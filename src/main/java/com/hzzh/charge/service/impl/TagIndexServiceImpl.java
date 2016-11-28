package com.hzzh.charge.service.impl;

import com.hzzh.charge.dao.TagIndexDao;
import com.hzzh.charge.model.TagIndex;
import com.hzzh.charge.service.TagIndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * Created by lilaifeng on 2016/9/22.
 */
@Service("TagIndexService")
public class TagIndexServiceImpl implements TagIndexService {
    @Autowired
    private TagIndexDao tagIndexDao;

    @Override
    public int deleteByStationCode(String stationCode) throws Exception{
        return tagIndexDao.deleteByStationCode(stationCode);
    }
    @Override
    public int editStationName(String stationCode,String stationName) throws Exception{
        return tagIndexDao.editStationName(stationCode,stationName);
    }
}