package com.hzzh.charge.service.impl;

import com.hzzh.charge.dao.HistoryOrderDao;
import com.hzzh.charge.model.report_po.*;
import com.hzzh.charge.service.HistoryOrderService;
import com.hzzh.charge.utils.DateUtil;
import com.hzzh.charge.utils.ReportUtil;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.*;

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
         */
        String startDate = DateUtil.dayFormat(startTime);
        /**
         * 2.获取数据添加到list集合中。
         */
        List<HistoryOrder> list = historyOrderDao.queryPage(cardNo, companyId, stationName, startDate, endTime);
        String beginTime = null;
        String overTime = null;
        List<Double> charge = new ArrayList<>();
        List<Double> expense = new ArrayList<>();

        /**
         * 3.遍历HistoryOrder对象，获取开始日期和结束日期，并进行日期处理。
         */
        for (HistoryOrder h : list) {
            beginTime = h.getChargeBegin();
            overTime = h.getChargeEnd();
            String useTime = DateUtil.getTime(beginTime, overTime);
            /**
             * 4.获取处理后的日期，并添加到HistoryOrder对象中。
             */
            h.setUseTime(useTime);
            /**
             * 5.获取HistoryOrder对象中的总电量，和总金额
             */
            charge.add(Double.parseDouble(h.getElectricCharge().toString()));
            expense.add(Double.parseDouble(h.getExpense().toString()));
        }
        /**
         * 6.
         * 通过getChargeSum方法，获得总电量
         * 通过getExpenseSum方法，获得总金额。
         */
        double totalCharge = this.getChargeSum(charge);
        double totalExpense = this.getExpenseSum(expense);

        /**
         *  7.创建OrderTotal对象，OrderTotal对象中包含了(电量总和，金额总和，充电次数)
         */
        OrderTotal orderTotal = new OrderTotal();
        /**
         * 8.将得到的电量总和，金额总和，充电次数，添加到OrderTotal对象中。
         */
        orderTotal.setTotalCharge(totalCharge);
        orderTotal.setTotalExpense(totalExpense);
        orderTotal.setCount(list.size());

        /**
         *9.遍历HistoryOrder对象并将OrderTotal对象添加到HistoryOrder对象中。
         */
        for (HistoryOrder h : list) {
            h.setOrderTotal(orderTotal);
        }
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
        BigDecimal bigDecimal = new BigDecimal(Double.toString(sum));
        double result = bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
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
        BigDecimal bigDecimal = new BigDecimal(Double.toString(sum));
        double result = bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
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
     * 查询所有公司当月的总电量和总电费
     *
     * @param dateTime
     * @param
     * @return
     * @throws Exception
     */
    @Override
    public List<TotalReport> getCurrentMonthlyReport(@Param("dateTime") String dateTime) throws Exception {
        String date = "";
        if (!dateTime.equals("")) {
            date = DateUtil.monthFormat(dateTime);//格式化日期
        }
        List<CarReport> list = totalReport.getReports();
        list = historyOrderDao.getCurrentMonthlyReport(date);
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
    public Map<String, Object> stationReport(@Param("dateTime") String dateTime, @Param("companyId") String companyId) throws Exception {
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

        //单个场站月统计集合
        List<SingleTotal> singleStation = new ArrayList<>();
        Map<String, Object> result = new HashMap<String, Object>();
        for (StationPo stationPo : list) {
            List<StationReportPo> sp = stationPo.getChargeInfo();
            for (StationReportPo s : sp) {
                if (s.getStationName() != null) {
                    SingleTotal singleTotal = new SingleTotal();
                    singleTotal.setStationName(s.getStationName());
                    singleTotal.setStationTotal(Double.parseDouble(s.getTotalCharge()));
                    singleStation.add(singleTotal);
                }
                if (s.getStationName() == null) {
                    StationTotal stationTotal = new StationTotal();
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
        //llf 去除空数据
        List<StationPo> stations = new ArrayList<>();
        for (StationPo item : list) {
            if (item.getStationName() != null) {
                stations.add(item);
            }
        }
        //endllf
        //每个场站的月总计
        List<SingleTotal> stationMonthlyTotal = this.getsingleSum(singleStation);
        try {
            for (StationPo s : stations) {
                for (SingleTotal l : stationMonthlyTotal) {
                    if (s.getStationName().equals(l.getStationName())) {
                        //四舍五入
                        BigDecimal bigDecimal = new BigDecimal(Double.toString(l.getStationTotal()));
                        double sum = bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
                        s.setTotal(sum);

                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        List<Object> allTotal = new ArrayList<>();
        for (StationTotal s : totals) {
            if (s.getDays() == null) {
                allTotal.add(s.getTotalCharge());
            }
        }

        /**
         * 判断集合total中的days是否等于null
         * 如果等于null，将remove。因为在数据库中分组统计时
         * 是按天进行分组的，所以统计后的结果，days会为null.
         */
        for (int i = 0; i < totals.size(); i++) {
            Iterator<StationTotal> iterator = totals.iterator();
            while (iterator.hasNext()) {
                if (iterator.next().getDays() == null) {
                    iterator.remove();
                }
            }
        }

        result.put("Stations", stations);
        result.put("Totals", totals);
        result.put("AllTotals", allTotal);
        return result;

    }

    /**
     * 查询所有公司当月场站的电量
     *
     * @param dateTime
     * @return
     * @throws Exception
     */
    @Override
    public Map<String, Object> getCurrentStationReport(@Param("dateTime") String dateTime) throws Exception {
        /**
         * 1.获取日期，并进行格式化
         * 2.获取数据添加到list集合中。
         * 3.计算总和
         */
        String date = "";
        if (!dateTime.equals("")) {
            date = DateUtil.monthFormat(dateTime);
        }
        List<StationPo> list = historyOrderDao.getCurrentStationReport(date);
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

        //单个场站月统计集合
        List<SingleTotal> singleStation = new ArrayList<>();
        Map<String, Object> result = new HashMap<String, Object>();
        for (StationPo stationPo : list) {
            List<StationReportPo> sp = stationPo.getChargeInfo();
            for (StationReportPo s : sp) {
                if (s.getStationName() != null) {
                    SingleTotal singleTotal = new SingleTotal();
                    singleTotal.setStationName(s.getStationName());
                    singleTotal.setStationTotal(Double.parseDouble(s.getTotalCharge()));
                    singleStation.add(singleTotal);
                }
                if (s.getStationName() == null) {
                    StationTotal stationTotal = new StationTotal();
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
        //llf 去除空数据
        List<StationPo> stations = new ArrayList<>();
        for (StationPo item : list) {
            if (item.getStationName() != null) {
                stations.add(item);
            }
        }
        //endllf
        //每个场站的月总计
        List<SingleTotal> stationMonthlyTotal = this.getsingleSum(singleStation);
        try {
            for (StationPo s : stations) {
                for (SingleTotal l : stationMonthlyTotal) {
                    if (s.getStationName().equals(l.getStationName())) {
                        //四舍五入
                        BigDecimal bigDecimal = new BigDecimal(Double.toString(l.getStationTotal()));
                        double sum = bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
                        s.setTotal(sum);

                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        List<Object> allTotal = new ArrayList<>();
        for (StationTotal s : totals) {
            if (s.getDays() == null) {
                allTotal.add(s.getTotalCharge());
            }
        }

        /**
         * 判断集合total中的days是否等于null
         * 如果等于null，将remove。因为在数据库中分组统计时
         * 是按天进行分组的，所以统计后的结果，days会为null.
         */
        for (int i = 0; i < totals.size(); i++) {
            Iterator<StationTotal> iterator = totals.iterator();
            while (iterator.hasNext()) {
                if (iterator.next().getDays() == null) {
                    iterator.remove();
                }
            }
        }

        result.put("Stations", stations);
        result.put("Totals", totals);
        result.put("AllTotals", allTotal);
        return result;

    }


    /**
     * 查询当月总共接入了多少充电桩
     *
     * @param companyId
     * @return
     * @throws Exception
     */
//    @Override
//    public MonthlyPoles queryChargePoles(@Param("companyId") String companyId) throws Exception {
//        MonthlyPoles queryChargePoles = historyOrderDao.queryChargePoles(companyId);
//        return queryChargePoles;
//    }

    /**
     * 计算每个场站当月的总电量
     *
     * @param list
     * @return
     */
    private List<SingleTotal> getsingleSum(List<SingleTotal> list) {
        /**
         * 计算单个场站的月电量总和，以及金额，按月统计
         */
        if (list == null || list.size() <= 0) {
            return null;
        }

        HashMap<String, SingleTotal> map = new HashMap<>();

        for (SingleTotal s : list) {
            if (map.containsKey(s.getStationName())) {
                s.setStationTotal(map.get(s.getStationName()).getStationTotal() + s.getStationTotal());
            }
            map.put(s.getStationName(), s);
        }
        list.clear();
        list.addAll(map.values());
        return list;
    }


    /**
     * 计算尖,峰，平，谷电量和费用总和
     *
     * @param list
     */
    private List<TotalReport> getCarSum(List<CarReport> list) {
        //创建chargeJ集合用于存放尖电量
        List<Double> chargeJ = new ArrayList<Double>();
        //创建chargeF集合用于存放峰电量
        List<Double> chargeF = new ArrayList<Double>();
        //创建chargeP集合用于存放平电量
        List<Double> chargeP = new ArrayList<Double>();
        //创建chargeG集合用于存放谷电量
        List<Double> chargeG = new ArrayList<Double>();
        //创建totalCharge集合用于存放尖，峰，平，谷，总电量
        List<Double> totalCharge = new ArrayList<Double>();
        //创建expenseJ集合用于存放尖电费
        List<Double> expenseJ = new ArrayList<Double>();
        //创建expenseF集合用于存放峰电费
        List<Double> expenseF = new ArrayList<Double>();
        //创建expenseP集合用于存放平电费
        List<Double> expenseP = new ArrayList<Double>();
        //创建expenseG集合用于存放谷电费
        List<Double> expenseG = new ArrayList<Double>();
        //创建totalExpense集合用于存放尖，峰，平，谷，总电费
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
        /**
         * 通过ReportUtil工具类，计算尖，峰，平，谷电量的总和
         */
        double toChargeJ = ReportUtil.totalChargeJ(chargeJ);
        double totalChargeF = ReportUtil.totalChargeF(chargeF);
        double totalChargeP = ReportUtil.totalChargeP(chargeP);
        double totalChargeG = ReportUtil.totalChargeG(chargeG);
        /**
         * 将计算出来的尖，峰，平，谷电量的总和添加到carTotal对象中
         */
        carTotal.setTotalChargeF(totalChargeF);
        carTotal.setTotalChargeJ(toChargeJ);
        carTotal.setTotalChargeP(totalChargeP);
        carTotal.setTotalChargeG(totalChargeG);

        /**
         * 通过ReportUtil工具类，计算尖，峰，平，谷电费的总和
         */
        double totalExpenseJ = ReportUtil.totalExpenseJ(expenseJ);
        double totalExpenseF = ReportUtil.totalExpenseF(expenseF);
        double totalExpenseP = ReportUtil.totalExpenseP(expenseP);
        double totalExpenseG = ReportUtil.totalExpenseG(expenseG);
        /**
         * 将计算出来的尖，峰，平，谷电费的总和添加到carTotal对象中
         */
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
