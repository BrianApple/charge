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
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

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
     * @param card
     * @return
     * @throws Exception
     */
    @Override
    public Integer add(Card card) throws Exception {
        card.setCardBalance(0l);//充值卡默认金额为0
        card.setCardStatus("1"); //卡状态为1，已激活
        card.setCardType("0"); //卡类型为0，扣款卡
        Integer add = cardDao.insert(card);
        if (add == 0 || add == null) {
            return 0;
        }
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
        List<QueryPage> list = cardDao.queryPage(cardNo, companyId);
        try {
            for (QueryPage page : list) {
                if (page.getCardStatus().equals("0")) {
                    page.setCardStatus(OpUtil.NOT_ACTIVE);
                } else if (page.getCardStatus().equals("1")) {
                    page.setCardStatus(OpUtil.NORMAL);
                } else if (page.getCardStatus().equals("2")) {
                    page.setCardStatus(OpUtil.LOCKED);
                } else {
                    page.setCardStatus(OpUtil.CANCEL);
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
     *CardExample:条件(卡编号)
     * @param cardAction
     * @return
     * @throws Exception
     */
    @Override
    @Transactional
    public Integer action(CardAction cardAction) throws Exception {
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
     *CardExample:条件(卡编号)
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
        Integer recharge = cardDao.updateByExampleSelective(card, cardExample);
        if (recharge == null || recharge == 0) {
            return 0;
        }
        this.addCardHistory(cardAction);
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
        cardHistory.setCardType("0"); //卡类型为0，扣款卡
        cardAction.setCardHistory(cardHistory);
        Integer addCount = cardHistoryDao.insert(cardHistory);
        if (addCount == null || addCount == 0) {
            return 0;
        }
        return addCount;
    }


}