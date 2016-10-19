package com.hzzh.charge.model.po;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * 历史订单扩张类
 * Created by TaoRan on 2016/10/8.
 */
public class HistoryOrder implements Serializable{
    //充电卡编号
    private String cardNo;
    //充电开始时间
    private String chargeBegin;
    //充电结束时间
    private String chargeEnd;
    //充电电量
    private BigDecimal electricCharge;
    //余额
    private String balance;
    //充电桩名称
    private String devName;
    //基站名称
    private String stationName;
    //车牌编号
    private String carNo;

    //订单状态
    private String status;
    //耗时
    private String useTime;
    //消费金额

    //公司id
    private String companyId;
    //金额
    private String expense;

    private OrderTotal orderTotal;

    public OrderTotal getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(OrderTotal orderTotal) {
        this.orderTotal = orderTotal;
    }

    /**
     * get,set方法
     */

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getChargeBegin() {
        return chargeBegin;
    }

    public void setChargeBegin(String chargeBegin) {
        this.chargeBegin = chargeBegin;
    }

    public String getChargeEnd() {
        return chargeEnd;
    }

    public void setChargeEnd(String chargeEnd) {
        this.chargeEnd = chargeEnd;
    }

    public BigDecimal getElectricCharge() {
        return electricCharge;
    }

    public void setElectricCharge(BigDecimal electricCharge) {
        this.electricCharge = electricCharge;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }


    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getCarNo() {
        return carNo;
    }

    public void setCarNo(String carNo) {
        this.carNo = carNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUseTime() {
        return useTime;
    }

    public void setUseTime(String useTime) {
        this.useTime = useTime;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getExpense() {
        return expense;
    }

    public void setExpense(String expense) {
        this.expense = expense;
    }

    public String getDevName() {
        return devName;
    }

    public void setDevName(String devName) {
        this.devName = devName;
    }

}
