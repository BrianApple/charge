package com.hzzh.charge.service;

import com.hzzh.charge.model.TagIndex;



import java.util.List;

/**
 * Created by lilaifeng on 2016/9/22.
 */
public interface TagIndexService {
    public int deleteByStationCode(String stationCode) throws Exception;
    int editStationName(String stationCode,String stationName) throws Exception;
}
