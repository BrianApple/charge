package com.hzzh.charge.service.impl;

import com.hzzh.charge.dao.CardDao;
import com.hzzh.charge.model.Card;
import com.hzzh.charge.model.card_po.QueryPage;
import com.hzzh.charge.model.card_po.QueryPerson;
import com.hzzh.charge.service.CardService;
import com.hzzh.charge.utils.OpUtil;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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
@Transactional
public class CardServiceImpl implements CardService {

    //依赖注入
    @Autowired
    private CardDao cardDao;

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
    public List<QueryPage> queryPage(@Param("cardNo") String cardNo,@Param("companyId") String companyId) throws Exception {
        List<QueryPage> list = cardDao.queryPage(cardNo,companyId);
        try {
            for (QueryPage page : list) {
                if (page.getCardStatus().equals("0")) {
                    page.setCardStatus(OpUtil.NOT_ACTIVE);
                } else if (page.getCardStatus().equals("1")) {
                    page.setCardStatus(OpUtil.NORMAL);
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
}