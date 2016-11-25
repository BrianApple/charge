package com.hzzh.charge.model.order_po;

/**
 * 图表(场站月电量统计)，查询指定月份每一天的尖，峰，平，谷的电量
 * Created by TaoRan on 2016/11/25.
 */
public class StationMonthlyChart {
    //场站名称
    private String stationName;
    //尖电
    private String charge_J;
    //峰电
    private String charge_F;
    //平电
    private String charge_P;
    //谷电
    private String charge_G;
    //开始时间
    private String chargeBegin;
    //days
    private String days;

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getCharge_J() {
        return charge_J;
    }

    public void setCharge_J(String charge_J) {
        this.charge_J = charge_J;
    }

    public String getCharge_F() {
        return charge_F;
    }

    public void setCharge_F(String charge_F) {
        this.charge_F = charge_F;
    }

    public String getCharge_P() {
        return charge_P;
    }

    public void setCharge_P(String charge_P) {
        this.charge_P = charge_P;
    }

    public String getCharge_G() {
        return charge_G;
    }

    public void setCharge_G(String charge_G) {
        this.charge_G = charge_G;
    }

    public String getChargeBegin() {
        return chargeBegin;
    }

    public void setChargeBegin(String chargeBegin) {
        this.chargeBegin = chargeBegin;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }
}
