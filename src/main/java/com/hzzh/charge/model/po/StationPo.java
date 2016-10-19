package com.hzzh.charge.model.po;

import java.util.List;

/**
 * Created by TaoRan on 2016/10/13.
 */
public class StationPo {

    //场站
    private String stationName;
    //一对多查询
    private List<StationReportPo> chargeInfo;
    private String companyId;

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public List<StationReportPo> getChargeInfo() {
        return chargeInfo;
    }

    public void setChargeInfo(List<StationReportPo> chargeInfo) {
        this.chargeInfo = chargeInfo;
    }


}
