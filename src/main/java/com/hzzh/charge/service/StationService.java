package com.hzzh.charge.service;

import com.hzzh.charge.model.Station;
import com.hzzh.charge.service.base.BaseStationService;

import java.util.List;

/**
 * 类名称：tb_base_station表的Service接口类StationService
 * 内容摘要：扩展Service
 * @author TaoRan
 * @version 1.0 2016年10月26日
 */
public interface StationService  {
    /**
     * 查询所有站
     * @return
     * @throws Exception
     */
    List<Station> queryStation()throws Exception;

}