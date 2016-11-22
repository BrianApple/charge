package com.hzzh.charge.model.order_po;

import java.io.Serializable;

/**
 * 根据companyId查询所有数据，用于车辆日充电详细报表数据导出
 * Created by TaoRan on 2016/11/14.
 */
public class ExportOrder implements Serializable{
    //车牌号
    private String carNo;
    //卡号
    private String cardNo;
    //开始时间
    private String chargeBegin;
    //结束时间
    private String chargeEnd;
    //场站
    private String stationName;
    //电桩
    private String devName;
    //电量
    private String electricCharge;
    //电费
    private String expense;
    //公司id
    private String companyId;

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

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getDevName() {
        return devName;
    }

    public void setDevName(String devName) {
        this.devName = devName;
    }

    public String getElectricCharge() {
        return electricCharge;
    }

    public void setElectricCharge(String electricCharge) {
        this.electricCharge = electricCharge;
    }

    public String getExpense() {
        return expense;
    }

    public void setExpense(String expense) {
        this.expense = expense;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }
}
