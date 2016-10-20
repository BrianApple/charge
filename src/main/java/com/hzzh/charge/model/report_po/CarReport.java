package com.hzzh.charge.model.report_po;
import java.io.Serializable;
import java.util.List;

/**
 * 车辆月统计报表
 * Created by TaoRan on 2016/10/13.
 */
public class CarReport implements Serializable{

    //车辆编号
    private String carNo;
    //卡编号
    private String cardNo;
    //公司id
    private String companyId;
    //场站
    private String stationName;
    //当前月份
    private String months;
    //当日
    private String days;
    //尖，峰，平，谷电量
    private String chargeJ;
    private String chargeF;
    private String chargeP;
    private String chargeG;
    //总电量
    private String totalCharge;
    //尖，峰，平，谷金额
    private String expenseJ;
    private String expenseF;
    private String expenseP;
    private String expenseG;
    //总金额
    private String totalExpense;
    //*******************************************************


    public String getCarNo() {
        return carNo;
    }

    public void setCarNo(String carNo) {
        this.carNo = carNo;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getMonths() {
        return months;
    }

    public void setMonths(String months) {
        this.months = months;
    }

    public String getChargeJ() {
        return chargeJ;
    }

    public void setChargeJ(String chargeJ) {
        this.chargeJ = chargeJ;
    }

    public String getChargeF() {
        return chargeF;
    }

    public void setChargeF(String chargeF) {
        this.chargeF = chargeF;
    }

    public String getChargeP() {
        return chargeP;
    }

    public void setChargeP(String chargeP) {
        this.chargeP = chargeP;
    }

    public String getChargeG() {
        return chargeG;
    }

    public void setChargeG(String chargeG) {
        this.chargeG = chargeG;
    }

    public String getTotalCharge() {
        return totalCharge;
    }

    public void setTotalCharge(String totalCharge) {
        this.totalCharge = totalCharge;
    }

    public String getExpenseJ() {
        return expenseJ;
    }

    public void setExpenseJ(String expenseJ) {
        this.expenseJ = expenseJ;
    }

    public String getExpenseF() {
        return expenseF;
    }

    public void setExpenseF(String expenseF) {
        this.expenseF = expenseF;
    }

    public String getExpenseP() {
        return expenseP;
    }

    public void setExpenseP(String expenseP) {
        this.expenseP = expenseP;
    }

    public String getExpenseG() {
        return expenseG;
    }

    public void setExpenseG(String expenseG) {
        this.expenseG = expenseG;
    }

    public String getTotalExpense() {
        return totalExpense;
    }

    public void setTotalExpense(String totalExpense) {
        this.totalExpense = totalExpense;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }
}
