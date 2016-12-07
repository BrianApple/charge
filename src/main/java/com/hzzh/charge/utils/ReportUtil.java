package com.hzzh.charge.utils;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * 报表统计工具类
 * Created by TaoRan on 2016/10/14.
 */
public class ReportUtil {




    /**
     * 计算尖电总和
     *
     * @param totalChargeJ
     * @return
     */
    public static double totalChargeJ(List<Double> totalChargeJ) {
        double sum = 0;
        if (totalChargeJ != null && totalChargeJ.size() != 0) {
            for (Double J : totalChargeJ) {
                sum += J;
            }
        }

        //保留两位小数返回
        BigDecimal bigDecimal = new BigDecimal(Double.toString(sum));
        double result = bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        return result;
    }


    /**
     * 计算峰电总和
     *
     * @param totalChargeF
     * @return
     */
    public static double totalChargeF(List<Double> totalChargeF) {
        double sum = 0;
        if (totalChargeF != null && totalChargeF.size() != 0) {
            for (Double d : totalChargeF) {
                sum += d;
            }
        }
        //保留两位小数返回
        BigDecimal bigDecimal = new BigDecimal(Double.toString(sum));
        double result = bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        return result;

    }

    /**
     * 计算平电总和
     *
     * @param totalChargeP
     * @return
     */
    public static double totalChargeP(List<Double> totalChargeP) {
        double sum = 0;
        if (totalChargeP != null && totalChargeP.size() != 0) {
            for (Double p : totalChargeP) {
                sum += p;
            }
        }
        //保留两位小数返回
        BigDecimal bigDecimal = new BigDecimal(Double.toString(sum));
        double result = bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        return result;

    }

    /**
     * 计算谷电总和
     *
     * @param totalChargeG
     * @return
     */
    public static double totalChargeG(List<Double> totalChargeG) {
        double sum = 0;
        if (totalChargeG != null && totalChargeG.size() != 0) {
            for (Double g : totalChargeG) {
                sum += g;
            }
        }
        BigDecimal bigDecimal = new BigDecimal(Double.toString(sum));
        double result = bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        return result;
    }

    /**
     * 计算尖电费用总和
     *
     * @param totalExpenseJ
     * @return
     */
    public static double totalExpenseJ(List<Double> totalExpenseJ) {
        double sum = 0;
        if (totalExpenseJ != null && totalExpenseJ.size() != 0) {
            for (Double j : totalExpenseJ) {
                sum += j;
            }
        }
        //保留两位小数
        BigDecimal bigDecimal = new BigDecimal(Double.toString(sum));
        double result = bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        return result;
    }

    /**
     * 计算峰电费用总和
     *
     * @param totalExpenseF
     * @return
     */
    public static double totalExpenseF(List<Double> totalExpenseF) {
        double sum = 0;
        if (totalExpenseF != null && totalExpenseF.size() != 0) {
            for (Double f : totalExpenseF) {
                sum += f;
            }
        }
        BigDecimal bigDecimal = new BigDecimal(Double.toString(sum));
        double result = bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        return result;

    }

    /**
     * 计算平电费用总和
     *
     * @param totalExpenseP
     * @return
     */
    public static double totalExpenseP(List<Double> totalExpenseP) {
        double sum = 0;
        if (totalExpenseP != null && totalExpenseP.size() != 0) {
            for (Double p : totalExpenseP) {
                sum += p;
            }
        }
        BigDecimal bigDecimal = new BigDecimal(Double.toString(sum));
        double result = bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        return result;
    }

    /**
     * 计算谷电费用总和
     *
     * @param totalExpenseG
     * @return
     */
    public static double totalExpenseG(List<Double> totalExpenseG) {
        double sum = 0;
        if (totalExpenseG != null && totalExpenseG.size() != 0) {
            for (Double G : totalExpenseG) {
                sum += G;
            }
        }
        BigDecimal bigDecimal = new BigDecimal(Double.toString(sum));
        double result = bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        return result;
    }

    /**
     * 计算总电量总和
     *
     * @param totalCharge
     * @return
     */
    public static double totalCharge(List<Double> totalCharge) {
        double sum = 0;
        if (totalCharge != null && totalCharge.size() != 0) {
            for (Double charage : totalCharge) {
                sum += charage;
            }
        }
        BigDecimal bigDecimal = new BigDecimal(Double.toString(sum));
        double result = bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        return result;
    }

    /**
     * 计算总电费总和
     *
     * @param totalExpense
     * @return
     */
    public static double totalExpense(List<Double> totalExpense) {
        double sum = 0;
        if (totalExpense != null && totalExpense.size() != 0) {
            for (Double expense : totalExpense) {
                sum += expense;
            }
        }
        BigDecimal bigDecimal = new BigDecimal(Double.toString(sum));
        double result = bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        return result;
    }

}
