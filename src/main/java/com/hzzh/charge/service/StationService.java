package com.hzzh.charge.service;

import com.hzzh.charge.model.Station;
import com.hzzh.charge.model.station_po.StationInfo;
import org.apache.ibatis.annotations.Param;


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

    /**
     * 查询场站列表
     * @param companyId
     * @param name
     * @return
     * @throws Exception
     */
    List<StationInfo> queryStations(@Param("companyId")String companyId, @Param("name")String name)throws Exception;

    /**
     * 通过companyId,stationName查询场站信息
     * @param companyId
     * @param name
     * @return
     * @throws Exception
     */
    Station queryStationInfo(@Param("companyId")String companyId,@Param("name")String name)throws Exception;




}
