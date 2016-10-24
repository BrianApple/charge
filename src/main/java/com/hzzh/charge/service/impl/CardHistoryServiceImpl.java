package com.hzzh.charge.service.impl;

import com.hzzh.charge.dao.CardHistoryDao;
import com.hzzh.charge.model.cardhistory_po.RechargeDetail;
import com.hzzh.charge.model.cardhistory_po.TotalBalance;
import com.hzzh.charge.service.CardHistoryService;
import com.hzzh.charge.utils.DateUtil;
import org.apache.commons.collections.map.HashedMap;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.*;

/**
 * 类名称：t_ev_card_history表的ServiceImpl接口类CardHistoryServiceImpl
 * 内容摘要：扩展ServiceImpl
 *
 * @author TaoRan
 * @version 1.0 2016年10月20日
 */
@Service
public class CardHistoryServiceImpl implements CardHistoryService {
    @Autowired
    private CardHistoryDao cardHistoryDao;

    /**
     * 充值卡明细
     *
     * @param companyId
     * @param operateTime
     * @return
     * @throws Exception
     */
    @Override
    public Map<String, Object> rechargeDetail(@Param("companyId") String companyId, @Param("operateTime") String operateTime) throws Exception {
        /**
         * 格式化时间
         */
        String dateTime = null;
        if (operateTime != "") {
            dateTime = DateUtil.monthFormat(operateTime);
        }
        List<RechargeDetail> list = cardHistoryDao.rechargeDetail(companyId, dateTime);
        Map<String, Object> map = new HashMap<>();
        List<Object> total = new ArrayList<>();
        if (list != null && list.size() != 0) {
            total = this.getSumBalance(list);
        }
        map.put("rechargeDetail", list);
        map.put("totals", total);
        return map;
    }

    /**
     * 计算总充值金额
     */
    private List<Object> getSumBalance(List<RechargeDetail> list) {
        //充值前金额集合
        List<Double> oldBalance = new ArrayList<>();
        //充值金额集合
        List<Double> money = new ArrayList<>();
        //余额集合
        List<Double> balance = new ArrayList<>();

        //有可能取到null值，需要捕获异常！
        try {
            for (RechargeDetail r : list) {
                oldBalance.add(r.getOldBalance());
                money.add(r.getMoney());
                balance.add(r.getBalance());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        List<Object> objects = new ArrayList<>();
        TotalBalance total = new TotalBalance();
        double totalOldBalance = this.getOldBalance(oldBalance);
        double totalMoney = this.getMoney(money);
        double totalBalance = this.getBalance(balance);
        total.setTotalOldBalance(totalOldBalance);
        total.setTotalMoney(totalMoney);
        total.setTotalBalance(totalBalance);
        objects.add(total);
        return objects;
    }

    /**
     * 计算充值前总金额
     *
     * @param list
     * @return
     */
    private double getOldBalance(List<Double> list) {
        double sum = 0;
        for (Double d : list) {
            sum += d;
        }
        //四舍五入
        BigDecimal bigDecimal = new BigDecimal(sum);
        double result = bigDecimal.setScale(2, BigDecimal.ROUND_CEILING).doubleValue();
        return result;
    }

    /**
     * 计算充值总金额
     *
     * @param list
     * @return
     */
    private double getMoney(List<Double> list) {
        double sum = 0;
        for (Double d : list) {
            sum += d;
        }
        //四舍五入
        BigDecimal bigDecimal = new BigDecimal(sum);
        double result = bigDecimal.setScale(2, BigDecimal.ROUND_CEILING).doubleValue();
        return result;
    }

    /**
     * 计算总余额
     *
     * @param list
     * @return
     */
    private double getBalance(List<Double> list) {
        double sum = 0;
        for (Double d : list) {
            sum += d;
        }
        //四舍五入
        BigDecimal bigDecimal = new BigDecimal(sum);
        double result = bigDecimal.setScale(2, BigDecimal.ROUND_CEILING).doubleValue();
        return result;
    }
}