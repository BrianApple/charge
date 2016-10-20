package com.hzzh.charge.model;

import java.io.Serializable;

/**
 * 类名称：t_ev_card_history表的实体类CardHistory
 * 内容摘要：t_ev_card_history表的各个元素的取得、设定方法
 * @author TaoRan
 * @version 1.0 2016年10月20日
 */@SuppressWarnings("serial")
public class CardHistory implements Serializable {

    /** 主键编码 */
    private String guid;
    /** 卡编号 */
    private String cardNo;
    /** 车牌号 */
    private String carNo;
    /** 所属公司ID */
    private String companyId;
    /** 所属公司名称 */
    private String companyName;
    /** 卡持有人ID */
    private String ownerId;
    private String ownerName;
    /** 充前金额 */
    private Long cardOldBalance;
    /** 充值金额 */
    private Long cardMoney;
    /** 卡余额 */
    private Long cardBalance;
    /** 优惠金额 */
    private Long cardMoneyYh;
    /** 调整金额 */
    private Long cardMoneyTz;
    /** 积分兑换金额 */
    private Long cardMoneyJf;
    /** 卡类型:0-扣款卡 */
    private String cardType;
    /** 卡状态:0-未激活,1-正常(已激活),2-锁定,3-注销 */
    private String cardStatus;
    /** 操作类型:0-充值,1-改变状态 */
    private String operatorType;
    /** 操作员ID */
    private String operatorId;
    /** 操作员名称 */
    private String operatorName;
    /** 卡操作时间 */
    private String operateTime;

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
     * 取得 卡编号
     * @return 卡编号
     */
    public String getCardNo() {
        return cardNo;
    }

    /**
     * 设定 卡编号
     * @param cardNo 卡编号
     */
    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
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
     * 取得 所属公司ID
     * @return 所属公司ID
     */
    public String getCompanyId() {
        return companyId;
    }

    /**
     * 设定 所属公司ID
     * @param companyId 所属公司ID
     */
    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    /**
     * 取得 所属公司名称
     * @return 所属公司名称
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * 设定 所属公司名称
     * @param companyName 所属公司名称
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     * 取得 卡持有人ID
     * @return 卡持有人ID
     */
    public String getOwnerId() {
        return ownerId;
    }

    /**
     * 设定 卡持有人ID
     * @param ownerId 卡持有人ID
     */
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    /**
     * 取得 充前金额
     * @return 充前金额
     */
    public Long getCardOldBalance() {
        return cardOldBalance;
    }

    /**
     * 设定 充前金额
     * @param cardOldBalance 充前金额
     */
    public void setCardOldBalance(Long cardOldBalance) {
        this.cardOldBalance = cardOldBalance;
    }

    /**
     * 取得 充值金额
     * @return 充值金额
     */
    public Long getCardMoney() {
        return cardMoney;
    }

    /**
     * 设定 充值金额
     * @param cardMoney 充值金额
     */
    public void setCardMoney(Long cardMoney) {
        this.cardMoney = cardMoney;
    }

    /**
     * 取得 卡余额
     * @return 卡余额
     */
    public Long getCardBalance() {
        return cardBalance;
    }

    /**
     * 设定 卡余额
     * @param cardBalance 卡余额
     */
    public void setCardBalance(Long cardBalance) {
        this.cardBalance = cardBalance;
    }

    /**
     * 取得 优惠金额
     * @return 优惠金额
     */
    public Long getCardMoneyYh() {
        return cardMoneyYh;
    }

    /**
     * 设定 优惠金额
     * @param cardMoneyYh 优惠金额
     */
    public void setCardMoneyYh(Long cardMoneyYh) {
        this.cardMoneyYh = cardMoneyYh;
    }

    /**
     * 取得 调整金额
     * @return 调整金额
     */
    public Long getCardMoneyTz() {
        return cardMoneyTz;
    }

    /**
     * 设定 调整金额
     * @param cardMoneyTz 调整金额
     */
    public void setCardMoneyTz(Long cardMoneyTz) {
        this.cardMoneyTz = cardMoneyTz;
    }

    /**
     * 取得 积分兑换金额
     * @return 积分兑换金额
     */
    public Long getCardMoneyJf() {
        return cardMoneyJf;
    }

    /**
     * 设定 积分兑换金额
     * @param cardMoneyJf 积分兑换金额
     */
    public void setCardMoneyJf(Long cardMoneyJf) {
        this.cardMoneyJf = cardMoneyJf;
    }

    /**
     * 取得 卡类型:0-扣款卡
     * @return 卡类型:0-扣款卡
     */
    public String getCardType() {
        return cardType;
    }

    /**
     * 设定 卡类型:0-扣款卡
     * @param cardType 卡类型:0-扣款卡
     */
    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    /**
     * 取得 卡状态:0-未激活,1-正常(已激活),2-锁定,3-注销
     * @return 卡状态:0-未激活,1-正常(已激活),2-锁定,3-注销
     */
    public String getCardStatus() {
        return cardStatus;
    }

    /**
     * 设定 卡状态:0-未激活,1-正常(已激活),2-锁定,3-注销
     * @param cardStatus 卡状态:0-未激活,1-正常(已激活),2-锁定,3-注销
     */
    public void setCardStatus(String cardStatus) {
        this.cardStatus = cardStatus;
    }

    /**
     * 取得 操作类型:0-充值,1-改变状态
     * @return 操作类型:0-充值,1-改变状态
     */
    public String getOperatorType() {
        return operatorType;
    }

    /**
     * 设定 操作类型:0-充值,1-改变状态
     * @param operatorType 操作类型:0-充值,1-改变状态
     */
    public void setOperatorType(String operatorType) {
        this.operatorType = operatorType;
    }

    /**
     * 取得 操作员ID
     * @return 操作员ID
     */
    public String getOperatorId() {
        return operatorId;
    }

    /**
     * 设定 操作员ID
     * @param operatorId 操作员ID
     */
    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    /**
     * 取得 操作员名称
     * @return 操作员名称
     */
    public String getOperatorName() {
        return operatorName;
    }

    /**
     * 设定 操作员名称
     * @param operatorName 操作员名称
     */
    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    /**
     * 取得 卡操作时间
     * @return 卡操作时间
     */
    public String getOperateTime() {
        return operateTime;
    }

    /**
     * 设定 卡操作时间
     * @param operateTime 卡操作时间
     */
    public void setOperateTime(String operateTime) {
        this.operateTime = operateTime;
    }

}