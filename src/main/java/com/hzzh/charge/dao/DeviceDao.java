package com.hzzh.charge.dao;
import com.hzzh.charge.model.Device;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by lilaifeng on 2016/9/22.
 */
public interface DeviceDao {
    public List<Device> getDevicesByTypeCode(@Param("typeCode") String typeCode) throws Exception;
    public List<Device> getDevicesByCompanyID(@Param("companyId") String companyId) throws Exception;
    public List<Device> getDevicesByStationCode(@Param("stationCode") String stationCode) throws Exception;
    public int deleteByStationCode(@Param("stationCode") String stationCode) throws Exception;
    public int editStationName(@Param("stationCode") String stationCode,@Param("stationName") String stationName) throws Exception;
    public Device getPoleMaxSerialNum(@Param("modelCode") String modelCode) throws Exception;
    public Device getPoleMaxCode(@Param("stationCode") String stationCode) throws Exception;
    public int addPole(Device device) throws Exception;
    public int delete(@Param("guid") String guid) throws Exception;
}
