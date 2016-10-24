package com.hzzh.charge.service;


import com.hzzh.charge.model.Area;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 类名称：tb_sys_area表的Service接口类AreaService
 * 内容摘要：扩展Service
 *
 * @author TaoRan
 * @version 1.0 2016年10月24日
 */
public interface AreaService {

    /**
     * 根据编码查询省份
     *
     * @param code
     * @return
     * @throws Exception
     */
    List<Area> queryProvinces(@Param("code") String code) throws Exception;

}