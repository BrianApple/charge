package com.hzzh.charge.model.card_po;

/**
 * 电卡扩展类，支出记录
 * Created by TaoRan on 2016/11/17.
 */
public class PayRecord {
    //支出时间
    private String payDate;
    //场站名称
    private String stationName;
    //支出金额
    private Double pay;
    //余额
    private Double balance;

    public String getPayDate() {
        return payDate;
    }

    public void setPayDate(String payDate) {
        this.payDate = payDate;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public Double getPay() {
        return pay;
    }

    public void setPay(Double pay) {
        this.pay = pay;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}

