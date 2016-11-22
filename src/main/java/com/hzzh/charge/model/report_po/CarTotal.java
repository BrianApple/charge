package com.hzzh.charge.model.report_po;

/**
 * 统计尖，峰，平，谷电量,电费扩展类
 * Created by TaoRan on 2016/10/13.
 */
public class CarTotal {
    //汇总，尖，峰，平，谷电量
    private Double totalChargeJ;
    private Double totalChargeF;
    private Double totalChargeP;
    private Double totalChargeG;
    private Double totalCharge;
    //******************************************************
    //汇总，尖，峰，平，谷金额
    private Double totalExpenseJ;
    private Double totalExpenseF;
    private Double totalExpenseP;
    private Double totalExpenseG;
    private Double totalExpense;

    public Double getTotalChargeJ() {
        return totalChargeJ;
    }

    public void setTotalChargeJ(Double totalChargeJ) {
        this.totalChargeJ = totalChargeJ;
    }

    public Double getTotalChargeF() {
        return totalChargeF;
    }

    public void setTotalChargeF(Double totalChargeF) {
        this.totalChargeF = totalChargeF;
    }

    public Double getTotalChargeP() {
        return totalChargeP;
    }

    public void setTotalChargeP(Double totalChargeP) {
        this.totalChargeP = totalChargeP;
    }

    public Double getTotalChargeG() {
        return totalChargeG;
    }

    public void setTotalChargeG(Double totalChargeG) {
        this.totalChargeG = totalChargeG;
    }

    public Double getTotalExpenseJ() {
        return totalExpenseJ;
    }

    public void setTotalExpenseJ(Double totalExpenseJ) {
        this.totalExpenseJ = totalExpenseJ;
    }

    public Double getTotalExpenseF() {
        return totalExpenseF;
    }

    public void setTotalExpenseF(Double totalExpenseF) {
        this.totalExpenseF = totalExpenseF;
    }

    public Double getTotalExpenseP() {
        return totalExpenseP;
    }

    public void setTotalExpenseP(Double totalExpenseP) {
        this.totalExpenseP = totalExpenseP;
    }

    public Double getTotalExpenseG() {
        return totalExpenseG;
    }

    public void setTotalExpenseG(Double totalExpenseG) {
        this.totalExpenseG = totalExpenseG;
    }

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
}
