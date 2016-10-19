package com.hzzh.charge.model.po;

import java.util.List;

/**
 * Created by TaoRan on 2016/10/14.
 */
public class TotalReport {
    //车辆详情
    private List<CarReport> reports;
    //车辆总和
    private List<CarTotal> totals;
    //场站
    private List<StationPo> stations;
    //场站总和
    private List<StationTotal> stationTotals;


    public List<CarReport> getReports() {
        return reports;
    }

    public void setReports(List<CarReport> reports) {
        this.reports = reports;
    }

    public List<CarTotal> getTotals() {
        return totals;
    }

    public void setTotals(List<CarTotal> totals) {
        this.totals = totals;
    }

    public List<StationPo> getStations() {
        return stations;
    }

    public void setStations(List<StationPo> stations) {
        this.stations = stations;
    }

    public List<StationTotal> getStationTotals() {
        return stationTotals;
    }

    public void setStationTotals(List<StationTotal> stationTotals) {
        this.stationTotals = stationTotals;
    }
}
