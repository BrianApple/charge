package com.hzzh.charge.model.cardhistory_po;

/**
 * 总金额Pojo
 * Created by TaoRan on 2016/10/21.
 */
public class TotalBalance {
    //充值前总金额
    private double totalOldBalance;
    //充值总金额
    private double totalMoney;
    //总余额
    private double totalBalance;

    public double getTotalOldBalance() {
        return totalOldBalance;
    }

    public void setTotalOldBalance(double totalOldBalance) {
        this.totalOldBalance = totalOldBalance;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public double getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(double totalBalance) {
        this.totalBalance = totalBalance;
    }
}
