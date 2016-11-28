package com.hzzh.charge.dao;
import com.hzzh.charge.model.TagIndex;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by lilaifeng on 2016/9/22.
 */
public interface TagIndexDao {
    public int deleteByStationCode(@Param("stationCode") String stationCode) throws Exception;
    public int editStationName(@Param("stationCode") String stationCode,@Param("stationName") String stationName) throws Exception;
}
