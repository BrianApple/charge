package com.hzzh.charge.model;

import java.io.Serializable;

/**
 * 类名称：t_ev_order表的实体类Order
 * 内容摘要：t_ev_order表的各个元素的取得、设定方法
 * @author TaoRan
 * @version 1.0 2016年10月25日
 */@SuppressWarnings("serial")
public class Order implements Serializable {

    /** 主键编码 */
    private String guid;
    /** 车牌号 */
    private String carNo;
    /** 卡号 */
    private String cardNo;
    /** 车辆所属公司 */
    private String companyId;
    /** 站编码 */
    private String stationCode;
    /** 场站名称 */
    private String stationName;
    /** 设备编码 */
    private String devCode;
    /** 设备名称 */
    private String devName;
    /** 充电开始时间 */
    private String chargeBegin;
    /** 充电结束时间 */
    private String chargeEnd;
    /** 充电总电量 */
    private java.math.BigDecimal electricCharge;
    /** 支出总金额 */
    private String expense;
    /** 尖费率 */
    private String rateJ;
    /** 峰费率 */
    private String rateF;
    /** 谷费率 */
    private String rateG;
    /** 平费率 */
    private String rateP;
    /** 尖电量 */
    private String electricChargeJ;
    /** 峰电量 */
    private String electricChargeF;
    /** 谷电量 */
    private String electricChargeG;
    /** 平电量 */
    private String electricChargeP;
    /** 尖电费 */
    private String expenseJ;
    /** 峰电费 */
    private String expenseF;
    /** 谷电费 */
    private String expenseG;
    /** 平电费 */
    private String expenseP;
    /** 充电后卡余额 */
    private String balance;
    /** 消费金额 */
    private java.math.BigDecimal monetary;
    /** 停止充电原因 */
    private String stopReason;
    /** 充电方式 */
    private String chargeType;
    /** 重传标志 */
    private String sendTag;
    /** 充电端口 */
    private String port;
    /** 订单状态(1-预约,2-当前,3-历史,4-取消) */
    private String status;

    /**
     * 取得 主键编码
     * @return 主键编码
     */
    public String getGuid() {
        return guid;
    }

    /**
     * 设定 主键编码
     * @param guid 主键编码
     */
    public void setGuid(String guid) {
        this.guid = guid;
    }

    /**
     * 取得 车牌号
     * @return 车牌号
     */
    public String getCarNo() {
        return carNo;
    }

    /**
     * 设定 车牌号
     * @param carNo 车牌号
     */
    public void setCarNo(String carNo) {
        this.carNo = carNo;
    }

    /**
     * 取得 卡号
     * @return 卡号
     */
    public String getCardNo() {
        return cardNo;
    }

    /**
     * 设定 卡号
     * @param cardNo 卡号
     */
    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    /**
     * 取得 车辆所属公司
     * @return 车辆所属公司
     */
    public String getCompanyId() {
        return companyId;
    }

    /**
     * 设定 车辆所属公司
     * @param companyId 车辆所属公司
     */
    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    /**
     * 取得 站编码
     * @return 站编码
     */
    public String getStationCode() {
        return stationCode;
    }

    /**
     * 设定 站编码
     * @param stationCode 站编码
     */
    public void setStationCode(String stationCode) {
        this.stationCode = stationCode;
    }

    /**
     * 取得 场站名称
     * @return 场站名称
     */
    public String getStationName() {
        return stationName;
    }

    /**
     * 设定 场站名称
     * @param stationName 场站名称
     */
    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    /**
     * 取得 设备编码
     * @return 设备编码
     */
    public String getDevCode() {
        return devCode;
    }

    /**
     * 设定 设备编码
     * @param devCode 设备编码
     */
    public void setDevCode(String devCode) {
        this.devCode = devCode;
    }

    /**
     * 取得 设备名称
     * @return 设备名称
     */
    public String getDevName() {
        return devName;
    }

    /**
     * 设定 设备名称
     * @param devName 设备名称
     */
    public void setDevName(String devName) {
        this.devName = devName;
    }

    /**
     * 取得 充电开始时间
     * @return 充电开始时间
     */
    public String getChargeBegin() {
        return chargeBegin;
    }

    /**
     * 设定 充电开始时间
     * @param chargeBegin 充电开始时间
     */
    public void setChargeBegin(String chargeBegin) {
        this.chargeBegin = chargeBegin;
    }

    /**
     * 取得 充电结束时间
     * @return 充电结束时间
     */
    public String getChargeEnd() {
        return chargeEnd;
    }

    /**
     * 设定 充电结束时间
     * @param chargeEnd 充电结束时间
     */
    public void setChargeEnd(String chargeEnd) {
        this.chargeEnd = chargeEnd;
    }

    /**
     * 取得 充电总电量
     * @return 充电总电量
     */
    public java.math.BigDecimal getElectricCharge() {
        return electricCharge;
    }

    /**
     * 设定 充电总电量
     * @param electricCharge 充电总电量
     */
    public void setElectricCharge(java.math.BigDecimal electricCharge) {
        this.electricCharge = electricCharge;
    }

    /**
     * 取得 支出总金额
     * @return 支出总金额
     */
    public String getExpense() {
        return expense;
    }

    /**
     * 设定 支出总金额
     * @param expense 支出总金额
     */
    public void setExpense(String expense) {
        this.expense = expense;
    }

    /**
     * 取得 尖费率
     * @return 尖费率
     */
    public String getRateJ() {
        return rateJ;
    }

    /**
     * 设定 尖费率
     * @param rateJ 尖费率
     */
    public void setRateJ(String rateJ) {
        this.rateJ = rateJ;
    }

    /**
     * 取得 峰费率
     * @return 峰费率
     */
    public String getRateF() {
        return rateF;
    }

    /**
     * 设定 峰费率
     * @param rateF 峰费率
     */
    public void setRateF(String rateF) {
        this.rateF = rateF;
    }

    /**
     * 取得 谷费率
     * @return 谷费率
     */
    public String getRateG() {
        return rateG;
    }

    /**
     * 设定 谷费率
     * @param rateG 谷费率
     */
    public void setRateG(String rateG) {
        this.rateG = rateG;
    }

    /**
     * 取得 平费率
     * @return 平费率
     */
    public String getRateP() {
        return rateP;
    }

    /**
     * 设定 平费率
     * @param rateP 平费率
     */
    public void setRateP(String rateP) {
        this.rateP = rateP;
    }

    /**
     * 取得 尖电量
     * @return 尖电量
     */
    public String getElectricChargeJ() {
        return electricChargeJ;
    }

    /**
     * 设定 尖电量
     * @param electricChargeJ 尖电量
     */
    public void setElectricChargeJ(String electricChargeJ) {
        this.electricChargeJ = electricChargeJ;
    }

    /**
     * 取得 峰电量
     * @return 峰电量
     */
    public String getElectricChargeF() {
        return electricChargeF;
    }

    /**
     * 设定 峰电量
     * @param electricChargeF 峰电量
     */
    public void setElectricChargeF(String electricChargeF) {
        this.electricChargeF = electricChargeF;
    }

    /**
     * 取得 谷电量
     * @return 谷电量
     */
    public String getElectricChargeG() {
        return electricChargeG;
    }

    /**
     * 设定 谷电量
     * @param electricChargeG 谷电量
     */
    public void setElectricChargeG(String electricChargeG) {
        this.electricChargeG = electricChargeG;
    }

    /**
     * 取得 平电量
     * @return 平电量
     */
    public String getElectricChargeP() {
        return electricChargeP;
    }

    /**
     * 设定 平电量
     * @param electricChargeP 平电量
     */
    public void setElectricChargeP(String electricChargeP) {
        this.electricChargeP = electricChargeP;
    }

    /**
     * 取得 尖电费
     * @return 尖电费
     */
    public String getExpenseJ() {
        return expenseJ;
    }

    /**
     * 设定 尖电费
     * @param expenseJ 尖电费
     */
    public void setExpenseJ(String expenseJ) {
        this.expenseJ = expenseJ;
    }

    /**
     * 取得 峰电费
     * @return 峰电费
     */
    public String getExpenseF() {
        return expenseF;
    }

    /**
     * 设定 峰电费
     * @param expenseF 峰电费
     */
    public void setExpenseF(String expenseF) {
        this.expenseF = expenseF;
    }

    /**
     * 取得 谷电费
     * @return 谷电费
     */
    public String getExpenseG() {
        return expenseG;
    }

    /**
     * 设定 谷电费
     * @param expenseG 谷电费
     */
    public void setExpenseG(String expenseG) {
        this.expenseG = expenseG;
    }

    /**
     * 取得 平电费
     * @return 平电费
     */
    public String getExpenseP() {
        return expenseP;
    }

    /**
     * 设定 平电费
     * @param expenseP 平电费
     */
    public void setExpenseP(String expenseP) {
        this.expenseP = expenseP;
    }

    /**
     * 取得 充电后卡余额
     * @return 充电后卡余额
     */
    public String getBalance() {
        return balance;
    }

    /**
     * 设定 充电后卡余额
     * @param balance 充电后卡余额
     */
    public void setBalance(String balance) {
        this.balance = balance;
    }

    /**
     * 取得 消费金额
     * @return 消费金额
     */
    public java.math.BigDecimal getMonetary() {
        return monetary;
    }

    /**
     * 设定 消费金额
     * @param monetary 消费金额
     */
    public void setMonetary(java.math.BigDecimal monetary) {
        this.monetary = monetary;
    }

    /**
     * 取得 停止充电原因
     * @return 停止充电原因
     */
    public String getStopReason() {
        return stopReason;
    }

    /**
     * 设定 停止充电原因
     * @param stopReason 停止充电原因
     */
    public void setStopReason(String stopReason) {
        this.stopReason = stopReason;
    }

    /**
     * 取得 充电方式
     * @return 充电方式
     */
    public String getChargeType() {
        return chargeType;
    }

    /**
     * 设定 充电方式
     * @param chargeType 充电方式
     */
    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    /**
     * 取得 重传标志
     * @return 重传标志
     */
    public String getSendTag() {
        return sendTag;
    }

    /**
     * 设定 重传标志
     * @param sendTag 重传标志
     */
    public void setSendTag(String sendTag) {
        this.sendTag = sendTag;
    }

    /**
     * 取得 充电端口
     * @return 充电端口
     */
    public String getPort() {
        return port;
    }

    /**
     * 设定 充电端口
     * @param port 充电端口
     */
    public void setPort(String port) {
        this.port = port;
    }

    /**
     * 取得 订单状态(1-预约,2-当前,3-历史,4-取消)
     * @return 订单状态(1-预约,2-当前,3-历史,4-取消)
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设定 订单状态(1-预约,2-当前,3-历史,4-取消)
     * @param status 订单状态(1-预约,2-当前,3-历史,4-取消)
     */
    public void setStatus(String status) {
        this.status = status;
    }

}