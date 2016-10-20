package com.hzzh.charge.model.report_po;

/**
 * 按场站统计po类
 * Created by TaoRan on 2016/10/19.
 */
public class SingleTotal {
    //场站名称
    private String stationName;
    //当月总计
    private Double stationTotal;


    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public Double getStationTotal() {
        return stationTotal;
    }

    public void setStationTotal(Double stationTotal) {
        this.stationTotal = stationTotal;
    }

}
