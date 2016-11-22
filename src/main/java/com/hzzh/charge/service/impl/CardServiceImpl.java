package com.hzzh.charge.service.impl;

import com.hzzh.charge.dao.CardDao;
import com.hzzh.charge.dao.CardHistoryDao;
import com.hzzh.charge.dao.OrderDao;
import com.hzzh.charge.model.Card;
import com.hzzh.charge.model.CardExample;
import com.hzzh.charge.model.CardHistory;
import com.hzzh.charge.model.CardHistoryExample;
import com.hzzh.charge.model.card_po.*;
import com.hzzh.charge.service.CardService;
import com.hzzh.charge.utils.OpUtil;
import org.apache.commons.collections.map.HashedMap;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 类名称：t_ev_card表的ServiceImpl接口类CardServiceImpl
 * 内容摘要：扩展ServiceImpl
 *
 * @author TaoRan
 * @version 1.0 2016年10月19日
 */
@Service
public class CardServiceImpl implements CardService {

    //依赖注入
    @Autowired
    private CardDao cardDao;
    @Autowired
    private CardHistoryDao cardHistoryDao;
    @Autowired
    private OrderDao orderDao;

    /**
     * 添加卡信息
     *
     * @param cardAction
     * @return
     * @throws Exception
     */
    @Override
    @Transactional
    public Integer add(CardAction cardAction) throws Exception {
        Card card = cardAction.getCard();
        //充值卡默认金额为0
        BigDecimal big = new BigDecimal("0.00");
        card.setCardBalance(big);
        //状态为正常（卡状态:0-未激活,1-正常(已激活),2-锁定,3-注销）
        card.setCardStatus("1");
        //卡类型为0，扣款卡
        card.setCardType("0");
        //创建日期对象
        Date date = new Date();
        //格式化日期
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateTime = sf.format(date);
        card.setCreateTime(dateTime);
        //执行添加操作
        Integer add = cardDao.insert(card);
        cardAction.setCard(card);
        if (add == 0 || add == null) {
            return 0;
        }
        //添加历史记录
        this.addCardHistory(cardAction);
        return add;
    }


    /**
     * 根据companyId查询用户信息
     *
     * @param companyId
     * @return
     * @throws Exception
     */
    @Override
    public List<QueryPerson> queryPerson(@Param("companyId") String companyId) throws Exception {
        List<QueryPerson> list = cardDao.queryPerson(companyId);
        if (list == null || list.size() <= 0) {
            return null;
        }
        return list;
    }

    /**
     * 分页查询
     *
     * @param cardNo
     * @return
     * @throws Exception
     */
    @Override
    public List<QueryPage> queryPage(@Param("cardNo") String cardNo, @Param("companyId") String companyId) throws Exception {
        /**
         * 判断卡状态
         * 0：未激活
         * 1:正常
         * 2：锁定
         * 3：注销
         * 如果不这样做判断，那么响应给前端的是0到3的数字，前端需要通过数字来判断出状态为，
         * 未激活，正常，锁定，注销。
         *
         */
        List<QueryPage> list = cardDao.queryPage(cardNo, companyId);
        try {
            for (QueryPage card : list) {
                if (card.getCardStatus().equals("0")) {
                    card.setCardStatus(OpUtil.NOT_ACTIVE);
                } else if (card.getCardStatus().equals("1")) {
                    card.setCardStatus(OpUtil.NORMAL);
                } else if (card.getCardStatus().equals("2")) {
                    card.setCardStatus(OpUtil.LOCKED);
                } else {
                    card.setCardStatus(OpUtil.CANCEL);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    /**
     * 电卡的锁定与注销
     * CardExample:条件(卡编号)
     *
     * @param cardAction
     * @return
     * @throws Exception
     */
    @Override
    @Transactional
    public Integer action(CardAction cardAction) throws Exception {
        /**
         * 根据条件更新
         * cardExample为条件实例
         */
        Card card = cardAction.getCard();
        CardExample cardExample = new CardExample();
        CardExample.Criteria criteria = cardExample.createCriteria();
        criteria.andcardNoEqualTo(card.getCardNo());
        Integer action = cardDao.updateByExampleSelective(card, cardExample);
        if (action == null || action == 0) {
            return 0;
        }
        this.addCardHistory(cardAction);
        return action;
    }

    /**
     * 充值卡充值
     * CardExample:条件(卡编号)
     *
     * @param cardAction
     * @return
     * @throws Exception
     */
    @Override
    @Transactional
    public Integer recharge(CardAction cardAction) throws Exception {
        Card card = cardAction.getCard();
        /**
         * cardExample充值条件
         */
        CardExample cardExample = new CardExample();
        CardExample.Criteria criteria = cardExample.createCriteria();
        criteria.andcardNoEqualTo(card.getCardNo());
        criteria.andcarNoEqualTo(card.getCarNo());
        criteria.andcompanyIdEqualTo(card.getCompanyId());

        /**
         * Balance，查询card表中的余额
         */
        String oldBalance = String.valueOf(this.selectBalance(card));

        /**
         * currentBalance，获取当前充值的金额
         */
        String currentBalance = String.valueOf(card.getCardBalance());

        /**
         * 将当前充值的金额加上查询数据库中的余额，为最终的余额。
         */
        double balance = Double.parseDouble(oldBalance) + Double.parseDouble(currentBalance);
        /**
         * 将最终的余额添加到数据库。
         */
        BigDecimal totalBalance = new BigDecimal(balance);
        card.setCardBalance(totalBalance);
        /**
         * 获取card表中的余额,作为cardHistory表中的充值前金额。
         */

        Integer recharge = cardDao.updateByExampleSelective(card, cardExample);
        if (recharge == null || recharge == 0) {
            return 0;
        }
        //更新cardHistory表中的充值前的余额
        this.updateOldBalance(cardAction, oldBalance);
        return recharge;
    }


    /**
     * 添加充值卡历史记录
     *
     * @param cardAction
     * @return
     */
    private final Integer addCardHistory(CardAction cardAction) {
        CardHistory cardHistory = cardAction.getCardHistory();
        Card card = cardAction.getCard();
        //卡类型为0，扣款卡
        cardHistory.setCardType("0");
        //创建时间对象
        Date date = new Date();
        //时间格式化为2016-11-02 14:03:00
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateTime = sf.format(date);
        cardHistory.setOperateTime(dateTime);

        /**
         * 充值时，cardHistoy需要获取card表中的余额
         *
         */
        cardHistory.setCardBalance(card.getCardBalance());
        return cardHistoryDao.insert(cardHistory);
    }

    /**
     * 更新充值前的金额
     *
     * @param cardAction
     * @return
     */
    private final Integer updateOldBalance(CardAction cardAction, String oldBalance) {
        CardHistory cardHistory = cardAction.getCardHistory();
        Card card = cardAction.getCard();
        //卡类型为0，扣款卡
        cardHistory.setCardType("0");
        //创建时间对象
        Date date = new Date();
        //时间格式化为2016-11-02 14:03:00
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateTime = sf.format(date);
        cardHistory.setOperateTime(dateTime);
        //数据格式转换，将字符串转为数字
        BigDecimal bigOldBalance = new BigDecimal(oldBalance);
        /**
         * 判断card对象中cardBalance是否为空，如果等于空
         * 直接返回0。
         */
        if (card.getCardBalance() != null) {
            cardHistory.setCardBalance(card.getCardBalance());
            cardHistory.setCardOldBalance(bigOldBalance);
            return cardHistoryDao.insert(cardHistory);
        }
        return 0;
    }


    /**
     * 查询card余额
     *
     * @param card
     * @return
     */
    private BigDecimal selectBalance(Card card) {
        CardExample cardExample = new CardExample();
        CardExample.Criteria criteria = cardExample.createCriteria();
        criteria.andcardNoEqualTo(card.getCardNo());
        criteria.andcarNoEqualTo(card.getCarNo());
        criteria.andcompanyIdEqualTo(card.getCompanyId());
        List<Card> find = cardDao.selectByExample(cardExample);
        BigDecimal bigDecimal = new BigDecimal("0");
        for (Card cardBalance : find) {
            bigDecimal = cardBalance.getCardBalance();
        }
        return bigDecimal;
    }

    /**
     * 更新电卡
     * 根据主键（guid）更新
     *
     * @param card
     * @return
     * @throws Exception
     */
    @Override
    public Integer update(Card card) throws Exception {
        Integer update = cardDao.update(card);
        if (update != null && update != 0) {
            //当车牌号更改后，需要更新order表中的车牌号
            orderDao.updateCarNo(card.getCarNo(), card.getCardNo());
        }
        return update;
    }


    //    ===============================================充值记录=======================================================

    /**
     * 电卡充值记录
     *
     * @param cardNo
     * @param dateTime
     * @return
     * @throws Exception
     */
    @Override
    public Map<String, Object> rechargeRecord(@Param("cardNo") String cardNo,
                                              @Param("dateTime") String dateTime,
                                              @Param("endTime") String endTime) throws Exception {
        List<RechargeRecord> list = cardDao.rechargeRecord(cardNo, dateTime, endTime);
        List<Double> lists = new ArrayList<>();
        Map<String, Object> map = new HashedMap();
        for (RechargeRecord record : list) {
            Double meney = Double.parseDouble(record.getMeney());
            lists.add(meney);
        }
        double total = this.getTotalMeney(lists);
        map.put("record", list);
        map.put("total", total);
        return map;
    }


    /**
     * 计算充值金额总额
     *
     * @param list
     * @return
     */
    private double getTotalMeney(List<Double> list) {
        double sum = 0;
        for (Double d : list) {
            sum += d;
        }
        //保留两位小数返回
        BigDecimal bigDecimal = new BigDecimal(sum);
        double result = bigDecimal.setScale(2, BigDecimal.ROUND_CEILING).doubleValue();
        return result;

    }


    //====================================================支出记录======================================================


    /**
     * 电卡支出记录
     *
     * @param cardNo
     * @param dateTime
     * @return
     * @throws Exception
     */
    @Override
    public Map<String, Object> payRecord(@Param("cardNo") String cardNo,
                                         @Param("dateTime") String dateTime,
                                         @Param("endTime") String endTime) throws Exception {
        List<PayRecord> list = cardDao.payRecord(cardNo, dateTime, endTime);
        List<Double> paylist = new ArrayList<>();
        Map<String, Object> map = new HashedMap();
        for (PayRecord record : list) {
            double pay = record.getPay();
            paylist.add(pay);
        }
        double payTotal = this.getTotalPay(paylist);
        map.put("record", list);
        map.put("payTotal", payTotal);
        return map;
    }


    //计算支出总额
    private double getTotalPay(List<Double> paylist) {
        double sum = 0;
        for (Double d : paylist) {
            sum += d;
        }

        BigDecimal decimal = new BigDecimal(sum);
        Double result = decimal.setScale(2, BigDecimal.ROUND_CEILING).doubleValue();
        return result;

    }


    //=================================================变更记录======================================================


    /**
     * 电卡变更记录
     *
     * @param cardNo
     * @return
     * @throws Exception
     */
    @Override
    public List<StatusChangeRecord> statusChangeRecord(@Param("cardNo") String cardNo) throws Exception {
        List<StatusChangeRecord> list = cardDao.statusChangeRecord(cardNo);
        for (StatusChangeRecord status : list) {
            if (status.getStatus().equals("1")) {
                status.setStatusName(OpUtil.NORMAL);
            } else if (status.getStatus().equals("2")) {
                status.setStatusName(OpUtil.LOCKED);
            } else {
                status.setStatusName(OpUtil.CANCEL);
            }
        }

        return list;
    }


    //=================================================移动端登录======================================================

    /**
     * 查询电卡信息，用于移动端登录
     *
     * @param cardNo
     * @param cardPwd
     * @return
     * @throws Exception
     */
    @Override
    public Card login(@Param("cardNo") String cardNo, @Param("cardPwd") String cardPwd) throws Exception {
        Card login = cardDao.login(cardNo, cardPwd);
        return login;
    }


    /**
     * 移动端用户注册
     *
     * @param card
     * @return
     * @throws Exception
     */
    @Override
    @Transactional
    public Integer register(Card card) throws Exception {
        return cardDao.insert(card);
    }

    /**
     * 移动端用户修改密码
     *
     * @param cardNo
     * @param cardPwd
     * @return
     * @throws Exception
     */
    @Override
    public Integer editPwd(@Param("cardNo") String cardNo, @Param("cardPwd") String cardPwd) throws Exception {
        return cardDao.editPwd(cardNo, cardPwd);
    }
}