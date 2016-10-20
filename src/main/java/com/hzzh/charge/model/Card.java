package com.hzzh.charge.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 类名称：t_ev_card表的实体类Card
 * 内容摘要：t_ev_card表的各个元素的取得、设定方法
 * @author TaoRan
 * @version 1.0 2016年10月19日
 */@SuppressWarnings("serial")
public class Card implements Serializable {

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
    /** 卡持所有人ID */
    private String ownerId;
    private String ownerName;
    /** 卡余额 */
    private Long cardBalance;
    /** 卡状态:0-未激活,1-正常(已激活),2-锁定,3-注销 */
    private String cardStatus;
    /** 卡类型:0-扣款卡 */
    private String cardType;
    /** 操作员ID */
    private String creatorId;
    /** 操作员名称 */
    private String creatorName;
    /** 卡注册时间 */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private String createTime;

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
     * 取得 卡持所有人ID
     * @return 卡持所有人ID
     */
    public String getOwnerId() {
        return ownerId;
    }

    /**
     * 设定 卡持所有人ID
     * @param ownerId 卡持所有人ID
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
     * 取得 操作员ID
     * @return 操作员ID
     */
    public String getCreatorId() {
        return creatorId;
    }

    /**
     * 设定 操作员ID
     * @param creatorId 操作员ID
     */
    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    /**
     * 取得 操作员名称
     * @return 操作员名称
     */
    public String getCreatorName() {
        return creatorName;
    }

    /**
     * 设定 操作员名称
     * @param creatorName 操作员名称
     */
    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    /**
     * 取得 卡注册时间
     * @return 卡注册时间
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * 设定 卡注册时间
     * @param createTime 卡注册时间
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

}