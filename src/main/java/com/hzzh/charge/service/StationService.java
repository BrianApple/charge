package com.hzzh.charge.service;

import com.hzzh.charge.model.Station;



import java.util.List;

/**
 * Created by lilaifeng on 2016/9/22.
 */
public interface StationService {
    List<Station> getStationsByCompanyID(String companyId) throws Exception;
    List<Station> getStationsByType(String stationType) throws Exception;
    List<Station> getStationsByCompanyAndType(String companyId,String stationType) throws Exception;
    int addStation(Station station) throws Exception;
    Station getMaxCodeByCompanyID(String companyId) throws Exception;
    public int editStation(Station station) throws Exception;
    public int deleteStation(String code) throws Exception;

}
