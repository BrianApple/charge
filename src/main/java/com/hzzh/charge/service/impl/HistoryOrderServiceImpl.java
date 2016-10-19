package com.hzzh.charge.service.impl;

import com.hzzh.charge.dao.HistoryOrderDao;
import com.hzzh.charge.model.po.*;
import com.hzzh.charge.service.HistoryOrderService;
import com.hzzh.charge.utils.DateUtil;
import com.hzzh.charge.utils.ReportUtil;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.javassist.expr.NewArray;
import org.hibernate.validator.internal.util.privilegedactions.NewSchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static com.hzzh.charge.utils.ReportUtil.*;

/**
 * Created by TaoRan on 2016/10/8.
 */
@Service
public class HistoryOrderServiceImpl implements HistoryOrderService {
    @Autowired
    private HistoryOrderDao historyOrderDao;
    private TotalReport totalReport = new TotalReport();

    /**
     * 历史订单分页查询
     *
     * @return
     * @throws Exception
     */
    @Override
    public List<HistoryOrder> queryPage(String cardNo, String companyId, String stationName, String startTime, String endTime) throws Exception {
        /**
         * 1. 将开始时间格式化:"yyyyMMddHHmmss"
         * 2.获取数据添加到list集合中。
         * 3.遍历HistoryOrder对象，获取开始日期和结束日期，并进行日期处理。
         * 4.获取处理后的日期，并添加到HistoryOrder对象中。
         * 5.获取HistoryOrder对象中的总电量，和总金额
         * 6.计算总电量，和总金额，并得到总和。
         * 7.创建OrderTotal对象，OrderTotal对象中包含了(电量总和，金额总和，充电次数)
         * 8.将得到的电量总和，金额总和，充电次数，添加到OrderTotal对象中。
         * 9.遍历HistoryOrder对象并将OrderTotal对象添加到HistoryOrder对象中。
         * 10.返回。
         */

        //1
        String startDate = DateUtil.dayFormat(startTime);
        //2
        List<HistoryOrder> list = historyOrderDao.queryPage(cardNo, companyId, stationName, startDate, endTime);
        String beginTime = null;
        String overTime = null;
        List<Double> charge = new ArrayList<>();
        List<Double> expense = new ArrayList<>();

        //3
        for (HistoryOrder h : list) {
            beginTime = h.getChargeBegin();
            overTime = h.getChargeEnd();
            String useTime = DateUtil.getTime(beginTime, overTime);
            //4
            h.setUseTime(useTime);
            //5
            charge.add(Double.parseDouble(h.getElectricCharge().toString()));
            expense.add(Double.parseDouble(h.getExpense().toString()));
        }
        //6
        double totalCharge = this.getChargeSum(charge);
        double totalExpense = this.getExpenseSum(expense);

        //7
        OrderTotal orderTotal = new OrderTotal();
        //8
        orderTotal.setTotalCharge(totalCharge);
        orderTotal.setTotalExpense(totalExpense);
        orderTotal.setCount(list.size());

        //9
        for (HistoryOrder h : list) {
            h.setOrderTotal(orderTotal);
        }


        if (list == null) {
            return null;
        }
        //10
        return list;
    }

    /**
     * 车辆日充电详细报表,总电量计算
     *
     * @param list
     * @return
     */
    private double getChargeSum(List<Double> list) {
        double sum = 0;
        for (Double d : list) {
            sum += d;
        }

        //保留两位小数返回
        BigDecimal bigDecimal = new BigDecimal(sum);
        double result = bigDecimal.setScale(2, BigDecimal.ROUND_CEILING).doubleValue();
        return result;
    }

    /**
     * 车辆日充电详细报表,总金额计算
     *
     * @param list
     * @return
     */
    private double getExpenseSum(List<Double> list) {
        double sum = 0;
        for (Double d : list) {
            sum += d;
        }
        //保留两位小数返回
        BigDecimal bigDecimal = new BigDecimal(sum);
        double result = bigDecimal.setScale(2, BigDecimal.ROUND_CEILING).doubleValue();
        return result;
    }


    /**
     * 车辆月报表统计
     *
     * @param dateTime
     * @param companyId
     * @return
     * @throws Exception
     */
    @Override
    public List<TotalReport> monthlyReport(String dateTime, String companyId) throws Exception {
        /**
         * 1.获取日期，并进行格式化
         * 2.获取数据添加到list集合中。
         * 3.计算总和
         */
        String date = "";
        if (!dateTime.equals("")) {
            date = DateUtil.monthFormat(dateTime);//格式化日期
        }
        List<CarReport> list = totalReport.getReports();
        list = historyOrderDao.monthlyReport(date, companyId);
        if (list == null || list.size() <= 0) {
            return null;
        }
        //计算总和
        List<TotalReport> result = this.getCarSum(list);
        return result;
    }

    /**
     * 车辆日报表统计
     *
     * @param dateTime
     * @param companyId
     * @return
     * @throws Exception
     */
    @Override
    public List<TotalReport> dailyReport(@Param("dateTime") String dateTime, @Param("companyId") String companyId) throws Exception {
        /**
         * 1.获取日期，并进行格式化
         * 2.获取数据添加到list集合中。
         * 3.计算总和
         */
        String date = "";
        if (!dateTime.equals("")) {
            date = DateUtil.dayFormat(dateTime);//格式化时间（yyyyMMddHims）
        }
        List<CarReport> list = totalReport.getReports();
        list = historyOrderDao.dailyReport(date, companyId);
        if (list == null || list.size() <= 0) {
            return null;
        }
        //计算总和
        List<TotalReport> result = this.getCarSum(list);
        return result;
    }


    /**
     * 场站月统计
     *
     * @param dateTime
     * @param companyId
     * @return
     * @throws Exception
     */
    @Override
    public List<Object> stationReport(@Param("dateTime") String dateTime, @Param("companyId") String companyId) throws Exception {
        /**
         * 1.获取日期，并进行格式化
         * 2.获取数据添加到list集合中。
         * 3.计算总和
         */
        String date = "";
        if (!dateTime.equals("")) {
            date = DateUtil.monthFormat(dateTime);
        }
        List<StationPo> list = historyOrderDao.stationReport(date, companyId);
        if (list == null || list.size() <= 0) {
            return null;
        }

        /**
         * 1.第一层循环遍历StationPo对象，此对象中包含了StationReportPo对象。
         * 2.第二层循环遍历StationReportPo对象中的属性。
         * 3.第三层循环，去掉场站名为null元素。
         * 4.创建了StationTotal对象，用于添加从StationReportPo对象中遍历出来的属性
         * 5.创建List<StationTotal>集合，用于存放StationTotal对象。
         * 6.将List<StationTotal>集合添加到StationPo对象中。
         */
        List<StationTotal> totals = new ArrayList<>();
        StationTotal stationTotal = null;
        List<Object> result = new ArrayList<>();
        for (StationPo stationPo : list) {
            List<StationReportPo> sp = stationPo.getChargeInfo();
            for (StationReportPo s : sp) {
                if (s.getStationName() == null) {
                    stationTotal = new StationTotal();
                    stationTotal.setDays(s.getDays());
                    stationTotal.setTotalCharge(s.getTotalCharge());
                    totals.add(stationTotal);
                }
            }
            for (int i = 0; i < sp.size(); i++) {
                Iterator<StationReportPo> iterator = sp.iterator();
                while (iterator.hasNext()) {
                    if (iterator.next().getStationName() == null) {
                        iterator.remove();
                    }
                }
            }

        }
        result.addAll(list);
        result.addAll(totals);
        return result;

    }


    /**
     * 计算尖,峰，平，谷电量和费用总和
     *
     * @param list
     */
    private List<TotalReport> getCarSum(List<CarReport> list) {

        List<Double> chargeJ = new ArrayList<Double>();
        List<Double> chargeF = new ArrayList<Double>();
        List<Double> chargeP = new ArrayList<Double>();
        List<Double> chargeG = new ArrayList<Double>();
        List<Double> totalCharge = new ArrayList<Double>();
        List<Double> expenseJ = new ArrayList<Double>();
        List<Double> expenseF = new ArrayList<Double>();
        List<Double> expenseP = new ArrayList<Double>();
        List<Double> expenseG = new ArrayList<Double>();
        List<Double> totalExpense = new ArrayList<Double>();

        List<TotalReport> result = new ArrayList<>();

        for (CarReport mc : list) {
            //添加电量到集合中
            chargeJ.add(Double.parseDouble(mc.getChargeJ()));
            chargeF.add(Double.parseDouble(mc.getChargeF()));
            chargeP.add(Double.parseDouble(mc.getChargeP()));
            chargeG.add(Double.parseDouble(mc.getChargeG()));
            totalCharge.add(Double.parseDouble(mc.getTotalCharge()));
            //添加金额到集合中
            expenseJ.add(Double.parseDouble(mc.getExpenseJ()));
            expenseF.add(Double.parseDouble(mc.getExpenseF()));
            expenseP.add(Double.parseDouble(mc.getExpenseP()));
            expenseG.add(Double.parseDouble(mc.getExpenseG()));
            totalExpense.add(Double.parseDouble(mc.getTotalExpense()));
        }

        //车辆总汇实例
        CarTotal carTotal = new CarTotal();
        //获取尖，峰，平，谷电量的总和
        double toChargeJ = ReportUtil.totalChargeJ(chargeJ);
        double totalChargeF = ReportUtil.totalChargeF(chargeF);
        double totalChargeP = ReportUtil.totalChargeP(chargeP);
        double totalChargeG = ReportUtil.totalChargeG(chargeG);
        carTotal.setTotalChargeF(totalChargeF);
        carTotal.setTotalChargeJ(toChargeJ);
        carTotal.setTotalChargeP(totalChargeP);
        carTotal.setTotalChargeG(totalChargeG);

        //获取尖，峰，平，谷电费的总和
        double totalExpenseJ = ReportUtil.totalExpenseJ(expenseJ);
        double totalExpenseF = ReportUtil.totalExpenseF(expenseF);
        double totalExpenseP = ReportUtil.totalExpenseP(expenseP);
        double totalExpenseG = ReportUtil.totalExpenseG(expenseG);
        carTotal.setTotalExpenseJ(totalExpenseJ);
        carTotal.setTotalExpenseF(totalExpenseF);
        carTotal.setTotalExpenseP(totalExpenseP);
        carTotal.setTotalExpenseG(totalExpenseG);

        //获取总电量的总和
        double Charge = totalCharge(totalCharge);
        carTotal.setTotalCharge(Charge);
        //获取总电费的总和
        double expense = totalCharge(totalExpense);
        carTotal.setTotalExpense(expense);

        List<CarTotal> totals = new ArrayList<>();
        totals.add(carTotal);
        totalReport.setTotals(totals);
        totalReport.setReports(list);
        result.add(totalReport);
        return result;
    }
}
