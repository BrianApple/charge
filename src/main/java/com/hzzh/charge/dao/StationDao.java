package com.hzzh.charge.dao;
import com.hzzh.charge.model.Station;
import com.hzzh.charge.model.station_po.StationInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by lilaifeng on 2016/9/22.
 */
public interface StationDao {
    public List<Station> getStationsByCompanyID(@Param("companyId") String companyId) throws Exception;
    public List<Station> getStationsByType(@Param("stationType") String stationType) throws Exception;
    public List<Station> getStationsByCompanyAndType(@Param("companyId") String companyId,@Param("stationType") String stationType) throws Exception;
    public int addStation(Station station) throws Exception;
    public Station getMaxCodeByCompanyID(@Param("companyId") String companyId) throws Exception;
    public int editStation(Station station) throws Exception;
    public int deleteStation(@Param("code") String code) throws Exception;

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
