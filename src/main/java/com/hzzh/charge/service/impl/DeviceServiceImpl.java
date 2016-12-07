package com.hzzh.charge.service.impl;

import com.hzzh.charge.dao.DeviceDao;
import com.hzzh.charge.model.Device;
import com.hzzh.charge.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * Created by lilaifeng on 2016/9/22.
 */
@Service("DeviceService")
public class DeviceServiceImpl implements DeviceService {
    @Autowired
    private DeviceDao deviceDao;

    @Override
    public List<Device> getDevicesByTypeCode(String typeCode)  throws Exception {
        return deviceDao.getDevicesByTypeCode(typeCode);
    }
    @Override
    public List<Device> getDevicesByCompanyID(String companyId) throws Exception{
        return deviceDao.getDevicesByCompanyID(companyId);
    }
    @Override
    public List<Device> getDevicesByStationCode(String stationCode) throws Exception{
        return deviceDao.getDevicesByStationCode(stationCode);
    }
    @Override
    public int deleteByStationCode(String stationCode) throws Exception{
        return deviceDao.deleteByStationCode(stationCode);
    }
    @Override
    public int editStationName(String stationCode,String stationName) throws Exception{
        return deviceDao.editStationName(stationCode,stationName);
    }
    @Override
    public Device getPoleMaxSerialNum(String modelCode) throws Exception{
        return deviceDao.getPoleMaxSerialNum(modelCode);
    }
    @Override
    public Device getPoleMaxCode(String stationCode) throws Exception{
        return deviceDao.getPoleMaxCode(stationCode);
    }
    @Override
    public int addPole(Device device) throws Exception{
        return deviceDao.addPole(device);
    }
    @Override
    public int delete(String guid) throws Exception{
        return deviceDao.delete(guid);
    }
}