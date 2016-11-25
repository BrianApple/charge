package com.hzzh.charge.model.order_po;

/**
 * 用于查询指定月的尖，峰，平，谷的电量
 * 图表(车辆月充电统计)
 * Created by TaoRan on 2016/11/24.
 */
public class CarMonthlyChart {
    //卡号
    private String cardNo;
    //车牌号
    private String carNo;
    //开始时间
    private String chargeBegin;
    //尖电
    private String electricChargeJ;
    //峰电
    private String electricChargeF;
    //平电
    private String electricChargeP;
    //谷电
    private String electricChargeG;
    //days
    private String days;

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getCarNo() {
        return carNo;
    }

    public void setCarNo(String carNo) {
        this.carNo = carNo;
    }

    public String getChargeBegin() {
        return chargeBegin;
    }

    public void setChargeBegin(String chargeBegin) {
        this.chargeBegin = chargeBegin;
    }

    public String getElectricChargeJ() {
        return electricChargeJ;
    }

    public void setElectricChargeJ(String electricChargeJ) {
        this.electricChargeJ = electricChargeJ;
    }

    public String getElectricChargeF() {
        return electricChargeF;
    }

    public void setElectricChargeF(String electricChargeF) {
        this.electricChargeF = electricChargeF;
    }

    public String getElectricChargeP() {
        return electricChargeP;
    }

    public void setElectricChargeP(String electricChargeP) {
        this.electricChargeP = electricChargeP;
    }

    public String getElectricChargeG() {
        return electricChargeG;
    }

    public void setElectricChargeG(String electricChargeG) {
        this.electricChargeG = electricChargeG;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }
}
