package com.hzzh.charge.service.impl;

import com.hzzh.charge.dao.AreaDao;
import com.hzzh.charge.model.Area;
import com.hzzh.charge.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * Created by lilaifeng on 2016/9/22.
 */
@Service("AreaService")
public class AreaServiceImpl implements AreaService {
    @Autowired
    private AreaDao areaDao;

    @Override
    public List<Area> getAreasByParentCode(String parentCode) throws Exception{
        return areaDao.getAreasByParentCode(parentCode);
    }
}