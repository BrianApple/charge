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
 * 电卡管理模块
 *
 * @author TaoRan
 * @version 1.0 2016年10月20日
 */
@Service
public class CardHistoryServiceImpl implements CardHistoryService {
    @Autowired
    private CardHistoryDao cardHistoryDao;

    /**
     * 电卡明细
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
         * 1.获取前端传来的时间，通过DateUtil工具类进行日期格式化。
         */
        String dateTime = null;
        if (operateTime != "") {
            dateTime = DateUtil.monthFormat(operateTime);
        }
        /**
         * 2.通过companyId,dateTime查询出充值卡详单数据。
         */
        List<RechargeDetail> list = cardHistoryDao.rechargeDetail(companyId, dateTime);
        Map<String, Object> map = new HashMap<>();
        List<Object> total = new ArrayList<>();
        /**
         * 3.通过getSumBalance方法获，总金额总计，充值前金额总计，充值金额总计。
         */
        if (list != null && list.size() != 0) {
            total = this.getSumBalance(list);
        }
        /**
         * 4.将集合添加到map中，返回。
         */
        map.put("rechargeDetail", list);
        map.put("totals", total);
        return map;
    }

    /**
     * 统计卡内余额，充值前金额，充值金额
     */
    private List<Object> getSumBalance(List<RechargeDetail> list) {
        //充值前金额集合
        List<Double> oldBalance = new ArrayList<>();
        //充值金额集合
        List<Double> money = new ArrayList<>();
        //余额集合
        List<Double> balance = new ArrayList<>();

        /**
         * 1.有可能取到null值，需要捕获异常！
         * 2.遍历RechargeDetail，获取充值前的金额，充值金额，和余额
         * 3.将获取到的充值前的金额，充值金额，和余额添加到集合中，用于后面的计算。
         */

        try {
            for (RechargeDetail r : list) {
                oldBalance.add(r.getOldBalance());
                money.add(r.getMoney());
                balance.add(r.getBalance());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        //创建objects集合，用于存放total对象
        List<Object> objects = new ArrayList<>();
        //创建total对象
        TotalBalance total = new TotalBalance();
        //通过getOldBalance方法，获取总的充值前金额
        double totalOldBalance = this.getOldBalance(oldBalance);
        //通过getMoney方法，获取总的充值金额
        double totalMoney = this.getMoney(money);
        //通过getBalance方法，获取总的余额
        double totalBalance = this.getBalance(balance);
        /**
         * 将totalOldBalance(总的充值前金额),totalMoney(总的充值金额),totalBalance(总的余额)
         * 添加到total对象中。
         * 最终将添加到total对象添加到objects集合中，并返回。
         */
        total.setTotalOldBalance(totalOldBalance);
        total.setTotalMoney(totalMoney);
        total.setTotalBalance(totalBalance);
        objects.add(total);
        return objects;
    }

    /**
     * 计算充值前金额
     *
     * @param list
     * @return
     */
    private double getOldBalance(List<Double> list) {
        double sum = 0;
        for (Double oldBalance : list) {
            sum += oldBalance;
        }
        //四舍五入
        BigDecimal bigDecimal = new BigDecimal(sum);
        double result = bigDecimal.setScale(2, BigDecimal.ROUND_CEILING).doubleValue();
        return result;
    }

    /**
     * 计算充值金额
     *
     * @param list
     * @return
     */
    private double getMoney(List<Double> list) {
        double sum = 0;
        for (Double money : list) {
            sum += money;
        }
        //四舍五入
        BigDecimal bigDecimal = new BigDecimal(sum);
        double result = bigDecimal.setScale(2, BigDecimal.ROUND_CEILING).doubleValue();
        return result;
    }

    /**
     * 计算余额
     *
     * @param list
     * @return
     */
    private double getBalance(List<Double> list) {
        double sum = 0;
        for (Double balance : list) {
            sum += balance;
        }
        //四舍五入
        BigDecimal bigDecimal = new BigDecimal(sum);
        double result = bigDecimal.setScale(2, BigDecimal.ROUND_CEILING).doubleValue();
        return result;
    }
}