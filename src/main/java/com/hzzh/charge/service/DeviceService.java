package com.hzzh.charge.service;

import com.hzzh.charge.model.Device;



import java.util.List;

/**
 * Created by lilaifeng on 2016/9/22.
 */
public interface DeviceService {
    List<Device> getDevicesByTypeCode(String typeCode) throws Exception;
    List<Device> getDevicesByCompanyID(String companyId) throws Exception;
    List<Device> getDevicesByStationCode(String stationCode) throws Exception;
    int deleteByStationCode(String stationCode) throws Exception;
    int editStationName(String stationCode,String stationName) throws Exception;
    Device getPoleMaxSerialNum(String modelCode) throws Exception;
    Device getPoleMaxCode(String stationCode) throws Exception;
    int addPole(Device device) throws Exception;
    int delete(String guid) throws Exception;
}
