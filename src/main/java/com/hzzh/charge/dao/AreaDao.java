package com.hzzh.charge.dao;
import com.hzzh.charge.model.Area;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by lilaifeng on 2016/9/22.
 */
public interface AreaDao {
    public List<Area> getAreasByParentCode(@Param("parentCode") String parentCode) throws Exception;

}
