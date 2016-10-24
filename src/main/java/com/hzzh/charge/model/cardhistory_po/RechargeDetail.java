package com.hzzh.charge.model.cardhistory_po;

/**
 * 充值卡明细扩展类
 * Created by TaoRan on 2016/10/21.
 */
public class RechargeDetail {
    //卡编号
    private String cardNo;
    //车牌号
    private String carNo;
    //操作时间
    private String operateTime;
    //充值前余额
    private double oldBalance;
    //充值金额
    private double money;
    //余额
    private double balance;
    //操作人
    private String operatorName;

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

    public String getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(String operateTime) {
        this.operateTime = operateTime;
    }

    public double getOldBalance() {
        return oldBalance;
    }

    public void setOldBalance(double oldBalance) {
        this.oldBalance = oldBalance;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }
}
