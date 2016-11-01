package com.hzzh.charge.service.impl;

import com.hzzh.charge.dao.CardDao;
import com.hzzh.charge.dao.CardHistoryDao;
import com.hzzh.charge.model.Card;
import com.hzzh.charge.model.CardExample;
import com.hzzh.charge.model.CardHistory;
import com.hzzh.charge.model.CardHistoryExample;
import com.hzzh.charge.model.card_po.CardAction;
import com.hzzh.charge.model.card_po.QueryPage;
import com.hzzh.charge.model.card_po.QueryPerson;
import com.hzzh.charge.service.CardService;
import com.hzzh.charge.utils.OpUtil;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

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
        /**
         * 当添加card失败，不再执行this.addCardHistory(cardAction);
         */
        Card card = cardAction.getCard();
        //充值卡默认金额为0
        BigDecimal big = new BigDecimal("0");
        card.setCardBalance(big);
        //状态为正常（卡状态:0-未激活,1-正常(已激活),2-锁定,3-注销）
        card.setCardStatus("1");
        //卡类型为0，扣款卡
        card.setCardType("0");
        Date date = new Date();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateTime = sf.format(date);
        card.setCreateTime(dateTime);
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
        if (list == null || list.size() <= 0) {
            return null;
        }
        return list;
    }

    /**
     * 充值卡,锁定,注销
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
        CardExample cardExample = new CardExample();
        CardExample.Criteria criteria = cardExample.createCriteria();
        criteria.andcardNoEqualTo(card.getCardNo());
        criteria.andcarNoEqualTo(card.getCarNo());
        criteria.andcompanyIdEqualTo(card.getCompanyId());

        /**
         * 先查询卡的余额，在加上充值的金额，最终将余额和充值金额加在一起添加到数据库。
         */
        String oldBalance = String.valueOf(this.selectBalance(card));
        String currentBalance = String.valueOf(card.getCardBalance());

        double balance = Double.parseDouble(oldBalance) + Double.parseDouble(currentBalance);
        BigDecimal bigDecimal = new BigDecimal(balance);
        card.setCardBalance(bigDecimal);

        Integer recharge = cardDao.updateByExampleSelective(card, cardExample);
        if (recharge == null || recharge == 0) {
            return 0;
        }
        this.addCardHistory(cardAction);
        return recharge;
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
        for (Card c : find) {
            bigDecimal = c.getCardBalance();
        }
        return bigDecimal;
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
        Date date = new Date();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateTime = sf.format(date);
        cardHistory.setOperateTime(dateTime);

        if (card.getCardBalance() != null) {
            cardHistory.setCardBalance(card.getCardBalance());
        }


        Integer addCount = cardHistoryDao.insert(cardHistory);
        if (addCount == null || addCount == 0) {
            return 0;
        }
        return addCount;
    }

    /**
     * 查询cardHistory表中的余额
     *
     * @param cardHistory
     * @return
     */
    private BigDecimal selectHistoryBalance(CardHistory cardHistory) {
        CardHistoryExample cardHistoryExample = new CardHistoryExample();
        CardHistoryExample.Criteria criteria = cardHistoryExample.createCriteria();

        criteria.andcardNoEqualTo(cardHistory.getCardNo());
        criteria.andcarNoEqualTo(cardHistory.getCarNo());
        criteria.andcompanyIdEqualTo(cardHistory.getCompanyId());

        List<CardHistory> list = cardHistoryDao.selectByExample(cardHistoryExample);
        BigDecimal balance = null;
        for (CardHistory c : list) {
            balance = c.getCardBalance();
        }
        return balance;
    }


}