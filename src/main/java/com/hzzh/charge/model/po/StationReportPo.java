package com.hzzh.charge.model.po;

import java.util.List;

/**
 * Created by TaoRan on 2016/10/13.
 */
public class StationReportPo {
    //公司id
    private String companyId;
    //当日
    private String days;
    //总电量
    private String totalCharge;
    //场站名
    private String stationName;
    //*******************************************************

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }


    public String getTotalCharge() {
        return totalCharge;
    }

    public void setTotalCharge(String totalCharge) {
        this.totalCharge = totalCharge;
    }


    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }
}
