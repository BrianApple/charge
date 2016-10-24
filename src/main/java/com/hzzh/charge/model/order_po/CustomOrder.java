package com.hzzh.charge.model.order_po;

/**
 * order扩展类
 * Created by TaoRan on 2016/10/24.
 */
public class CustomOrder {
    //车牌号
    private String carNo;
    //companyId
    private String companyId;
    //站名称
    private String stationName;
    //设备名称
    private String devName;

    public String getCarNo() {
        return carNo;
    }

    public void setCarNo(String carNo) {
        this.carNo = carNo;
    }

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

    public String getDevName() {
        return devName;
    }

    public void setDevName(String devName) {
        this.devName = devName;
    }
}
