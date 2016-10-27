package com.hzzh.charge.service.base.impl;

import com.hzzh.charge.dao.StationDao;

import com.hzzh.charge.model.Station;
import com.hzzh.charge.model.StationExample;
import com.hzzh.charge.service.base.BaseStationService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

/**
 * 类名称：tb_base_station表的Station接口实现类BaseStationServiceImpl
 * 内容摘要：针对于单表的基础操作：增删改查以及统计方法，包含物理逻辑操作
 * @author 工具生成
 * @version 1.0 2016年10月26日
 */
public class BaseStationServiceImpl implements BaseStationService {

    @Autowired
    protected StationDao stationDao;

    /**
     * 根据条件统计表中数据数量 所有数据
     * @param example StationExample
     * @return int 数据条数
     */
    public int countByExample(StationExample example) {
        return stationDao.countByExample(example);
    }

    /**
     * 根据条件查询表中数据 所有数据
     * @param example StationExample
     * @return List<Station> 数据集合
     */
    public List<Station> selectByExample(StationExample example) {
        return stationDao.selectByExample(example);
    }

    /**
     * 往表中插入一条数据 系统字段需要输入
     * @param record Station
     * @return int 结果数量
     */
    public int insert(Station record) {
        return stationDao.insert(record);
    }

    /**
     * 往表中批量插入数据 系统字段需要输入
     * @param record List<Station>
     * @return int 结果数量
     */
    public int insertList(List<Station> record) {
        return stationDao.insertList(record);
    }

    /**
     * 往表中插入一条数据 字段为空不插入 系统字段需要输入
     * @param record Station
     * @return int 结果数量
     */
    public int insertSelective(Station record) {
        return stationDao.insertSelective(record);
    }

    /**
     * 往表中批量插入数据 字段为空不插入 系统字段需要输入
     * @param record List<Station>
     * @return int 结果数量
     */
    public int insertListSelective(List<Station> record) {
        return stationDao.insertListSelective(record);
    }

    /**
     * 根据条件修改数据 所有数据
     * @param record Station
     * @param example StationExample
     * @return int 结果数量
     */
    public int updateByExample(@Param("record") Station record, @Param("example") StationExample example) {
        return stationDao.updateByExample(record, example);
    }

    /**
     * 根据条件修改数据 字段为空不修改 所有数据
     * @param record Station
     * @param example StationExample
     * @return int 结果数量
     */
    public int updateByExampleSelective(@Param("record") Station record, @Param("example") StationExample example) {
        return stationDao.updateByExampleSelective(record, example);
    }

    /**
     * 根据条件删除数据 物理删除
     * @param example StationExample
     * @return int 结果数量
     */
    public int deleteByExample(StationExample example) {
        return stationDao.deleteByExample(example);
    }

    /**
     * 根据主键查询数据 所有数据
     * @param map Map<String, Object>
     * @return Station 数据对象
     */
    public Station selectByPrimaryKey(Map<String, Object> map) {
        return stationDao.selectByPrimaryKey(map);
    }

    /**
     * 根据主键修改数据 所有数据
     * @param record Station
     * @return int 结果数量
     */
    public int updateByPrimaryKey(Station record) {
        return stationDao.updateByPrimaryKey(record);
    }

    /**
     * 根据主键修改数据 字段为空不修改 所有数据
     * @param record Station
     * @return int 结果数量
     */
    public int updateByPrimaryKeySelective(Station record) {
        return stationDao.updateByPrimaryKeySelective(record);
    }

    /**
     * 根据主键删除数据 物理删除
     * @param map Map<String, Object>
     * @return int 结果数量
     */
    public int deleteByPrimaryKey(Map<String, Object> map) {
        return stationDao.deleteByPrimaryKey(map);
    }
}