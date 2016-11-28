package com.hzzh.charge.service;

import com.hzzh.charge.model.Area;



import java.util.List;

/**
 * Created by lilaifeng on 2016/9/22.
 */
public interface AreaService {
    List<Area> getAreasByParentCode(String parentCode) throws Exception;
}
