package com.hzzh.charge.model.card_po;

import java.math.BigDecimal;

/**
 * 电卡扩展类，充值记录
 * Created by TaoRan on 2016/11/17.
 */
public class RechargeRecord {
    //充值金额
    private String meney;
    //余额
    private BigDecimal balance;
    //充值时间
    private String dateTime;
    //操作人
    private String person;


    public String getMeney() {
        return meney;
    }

    public void setMeney(String meney) {
        this.meney = meney;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

}
