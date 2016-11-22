package com.hzzh.charge.model.report_po;

/**
 * 按天统计场站的总电量的扩展类
 * Created by TaoRan on 2016/10/14.
 */
public class StationTotal {


    private String totalCharge;
    private String days;


    public String getTotalCharge() {
        return totalCharge;
    }

    public void setTotalCharge(String totalCharge) {
        this.totalCharge = totalCharge;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }
}
