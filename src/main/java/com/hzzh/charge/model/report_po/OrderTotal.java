package com.hzzh.charge.model.report_po;

/**
 * 车辆日充电详细扩展类
 * Created by TaoRan on 2016/10/13.
 */
public class OrderTotal {
    //总电量
    private Double totalCharge;
    //总金额
    private Double totalExpense;
    //充电次数
    private Integer count;
    public Double getTotalCharge() {
        return totalCharge;
    }

    public void setTotalCharge(Double totalCharge) {
        this.totalCharge = totalCharge;
    }

    public Double getTotalExpense() {
        return totalExpense;
    }

    public void setTotalExpense(Double totalExpense) {
        this.totalExpense = totalExpense;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
