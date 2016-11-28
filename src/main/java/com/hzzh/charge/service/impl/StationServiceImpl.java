package com.hzzh.charge.service.impl;

import com.hzzh.charge.dao.StationDao;
import com.hzzh.charge.model.Station;
import com.hzzh.charge.service.StationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * Created by lilaifeng on 2016/9/22.
 */
@Service("StationService")
public class StationServiceImpl implements StationService {
    @Autowired
    private StationDao stationDao;

    @Override
    public List<Station> getStationsByCompanyID(String companyId) throws Exception{
        return stationDao.getStationsByCompanyID(companyId);
    }
    @Override
    public List<Station> getStationsByType(String stationType) throws Exception{
        return stationDao.getStationsByType(stationType);
    }
    @Override
    public List<Station> getStationsByCompanyAndType(String companyId,String stationType) throws Exception{
        return stationDao.getStationsByCompanyAndType(companyId,stationType);
    }
    @Override
    public Station getMaxCodeByCompanyID(String companyId) throws Exception{
        return stationDao.getMaxCodeByCompanyID(companyId);
    }
    @Override
    public int addStation(Station station) throws Exception{
        return stationDao.addStation(station);
    }
    @Override
    public int editStation(Station station) throws Exception{
        return stationDao.editStation(station);
    }
    @Override
    public int deleteStation(String code) throws Exception{
        return stationDao.deleteStation(code);
    }
}