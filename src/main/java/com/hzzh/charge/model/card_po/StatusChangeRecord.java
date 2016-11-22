package com.hzzh.charge.model.card_po;

/**
 * 电卡扩展类，电卡变更记录
 * Created by TaoRan on 2016/11/18.
 */

public class StatusChangeRecord {
    //操作时间
    private String opDate;
    //操作人
    private String opName;
    //状态
    private String status;
    //状态名称
    private String statusName;

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public String getOpDate() {
        return opDate;
    }

    public void setOpDate(String opDate) {
        this.opDate = opDate;
    }

    public String getOpName() {
        return opName;
    }

    public void setOpName(String opName) {
        this.opName = opName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
