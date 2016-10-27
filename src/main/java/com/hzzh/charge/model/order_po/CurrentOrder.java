package com.hzzh.charge.model.order_po;

import com.hzzh.charge.model.report_po.HistoryOrder;

/**
 * 当前订单扩展类
 * Created by TaoRan on 2016/10/25.
 */
public class CurrentOrder extends HistoryOrder {
    private String stationCode;
    private String devCode;
    private String port;

    public String getStationCode() {
        return stationCode;
    }

    public void setStationCode(String stationCode) {
        this.stationCode = stationCode;
    }

    public String getDevCode() {
        return devCode;
    }

    public void setDevCode(String devCode) {
        this.devCode = devCode;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }
}
