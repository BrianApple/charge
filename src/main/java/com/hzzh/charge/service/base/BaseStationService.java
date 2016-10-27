package com.hzzh.charge.service.base;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.hzzh.charge.model.Station;
import com.hzzh.charge.model.StationExample;

/**
 * 类名称：tb_base_station表的BaseService接口类BaseStationService
 * 内容摘要：针对于单表的基础操作：增删改查以及统计方法，包含物理逻辑操作
 * @author 工具生成
 * @version 1.0 2016年10月26日
 */
public abstract interface BaseStationService {


    /**
     * 根据条件统计表中数据数量 所有数据
     * @param example StationExample
     * @return int 数据条数
     */
    int countByExample(StationExample example);

    /**
     * 根据条件查询表中数据 所有数据
     * @param example StationExample
     * @return List<Station> 数据集合
     */
    List<Station> selectByExample(StationExample example);

    /**
     * 往表中插入一条数据 系统字段需要输入
     * @param record Station
     * @return int 结果数量
     */
    int insert(Station record);

    /**
     * 往表中批量插入数据 系统字段需要输入
     * @param record List<Station>
     * @return int 结果数量
     */
    int insertList(List<Station> record);

    /**
     * 往表中插入一条数据 字段为空不插入 系统字段需要输入
     * @param record Station
     * @return int 结果数量
     */
    int insertSelective(Station record);

    /**
     * 往表中批量插入数据 字段为空不插入 系统字段需要输入
     * @param record List<Station>
     * @return int 结果数量
     */
    int insertListSelective(List<Station> record);

    /**
     * 根据条件修改数据 所有数据
     * @param record Station
     * @param example StationExample
     * @return int 结果数量
     */
    int updateByExample(@Param("record") Station record, @Param("example") StationExample example);

    /**
     * 根据条件修改数据 字段为空不修改 所有数据
     * @param record Station
     * @param example StationExample
     * @return int 结果数量
     */
    int updateByExampleSelective(@Param("record") Station record, @Param("example") StationExample example);

    /**
     * 根据条件删除数据 物理删除
     * @param example StationExample
     * @return int 结果数量
     */
    int deleteByExample(StationExample example);

    /**
     * 根据主键查询数据 所有数据
     * @param map Map<String, Object>
     * @return Station 数据对象
     */
    Station selectByPrimaryKey(Map<String, Object> map);

    /**
     * 根据主键修改数据 所有数据
     * @param record Station
     * @return int 结果数量
     */
    int updateByPrimaryKey(Station record);

    /**
     * 根据主键修改数据 字段为空不修改 所有数据
     * @param record Station
     * @return int 结果数量
     */
    int updateByPrimaryKeySelective(Station record);

    /**
     * 根据主键删除数据 物理删除
     * @param map Map<String, Object>
     * @return int 结果数量
     */
    int deleteByPrimaryKey(Map<String, Object> map);
}