package com.hzzh.charge.model.card_po;


/**
 * 分页查扩展类
 * Created by TaoRan on 2016/10/20.
 */
public class QueryPage {
    //卡号
    private String cardNo;
    //所属人id
    private String ownerId;
    //所属人
    private String ownerName;
    //车牌号
    private String carNo;
    //卡余额
    private String cardBalance;
    //卡状态
    private String cardStatus;

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getCarNo() {
        return carNo;
    }

    public void setCarNo(String carNo) {
        this.carNo = carNo;
    }

    public String getCardBalance() {
        return cardBalance;
    }

    public void setCardBalance(String cardBalance) {
        this.cardBalance = cardBalance;
    }

    public String getCardStatus() {
        return cardStatus;
    }

    public void setCardStatus(String cardStatus) {
        this.cardStatus = cardStatus;
    }
}
