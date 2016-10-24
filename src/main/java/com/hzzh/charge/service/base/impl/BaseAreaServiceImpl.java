package com.hzzh.charge.service.base.impl;

import com.hzzh.charge.dao.AreaDao;

import com.hzzh.charge.model.Area;
import com.hzzh.charge.model.AreaExample;
import com.hzzh.charge.service.base.BaseAreaService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

/**
 * 类名称：tb_sys_area表的Area接口实现类BaseAreaServiceImpl
 * 内容摘要：针对于单表的基础操作：增删改查以及统计方法，包含物理逻辑操作
 * @author 工具生成
 * @version 1.0 2016年10月24日
 */
public class BaseAreaServiceImpl implements BaseAreaService {

    @Autowired
    protected AreaDao areaDao;

    /**
     * 根据条件统计表中数据数量 所有数据
     * @param example AreaExample
     * @return int 数据条数
     */
    public int countByExample(AreaExample example) {
        return areaDao.countByExample(example);
    }

    /**
     * 根据条件查询表中数据 所有数据
     * @param example AreaExample
     * @return List<Area> 数据集合
     */
    public List<Area> selectByExample(AreaExample example) {
        return areaDao.selectByExample(example);
    }

    /**
     * 往表中插入一条数据 系统字段需要输入
     * @param record Area
     * @return int 结果数量
     */
    public int insert(Area record) {
        return areaDao.insert(record);
    }

    /**
     * 往表中批量插入数据 系统字段需要输入
     * @param record List<Area>
     * @return int 结果数量
     */
    public int insertList(List<Area> record) {
        return areaDao.insertList(record);
    }

    /**
     * 往表中插入一条数据 字段为空不插入 系统字段需要输入
     * @param record Area
     * @return int 结果数量
     */
    public int insertSelective(Area record) {
        return areaDao.insertSelective(record);
    }

    /**
     * 往表中批量插入数据 字段为空不插入 系统字段需要输入
     * @param record List<Area>
     * @return int 结果数量
     */
    public int insertListSelective(List<Area> record) {
        return areaDao.insertListSelective(record);
    }

    /**
     * 根据条件修改数据 所有数据
     * @param record Area
     * @param example AreaExample
     * @return int 结果数量
     */
    public int updateByExample(@Param("record") Area record, @Param("example") AreaExample example) {
        return areaDao.updateByExample(record, example);
    }

    /**
     * 根据条件修改数据 字段为空不修改 所有数据
     * @param record Area
     * @param example AreaExample
     * @return int 结果数量
     */
    public int updateByExampleSelective(@Param("record") Area record, @Param("example") AreaExample example) {
        return areaDao.updateByExampleSelective(record, example);
    }

    /**
     * 根据条件删除数据 物理删除
     * @param example AreaExample
     * @return int 结果数量
     */
    public int deleteByExample(AreaExample example) {
        return areaDao.deleteByExample(example);
    }

    /**
     * 根据主键查询数据 所有数据
     * @param map Map<String, Object>
     * @return Area 数据对象
     */
    public Area selectByPrimaryKey(Map<String, Object> map) {
        return areaDao.selectByPrimaryKey(map);
    }

    /**
     * 根据主键修改数据 所有数据
     * @param record Area
     * @return int 结果数量
     */
    public int updateByPrimaryKey(Area record) {
        return areaDao.updateByPrimaryKey(record);
    }

    /**
     * 根据主键修改数据 字段为空不修改 所有数据
     * @param record Area
     * @return int 结果数量
     */
    public int updateByPrimaryKeySelective(Area record) {
        return areaDao.updateByPrimaryKeySelective(record);
    }

    /**
     * 根据主键删除数据 物理删除
     * @param map Map<String, Object>
     * @return int 结果数量
     */
    public int deleteByPrimaryKey(Map<String, Object> map) {
        return areaDao.deleteByPrimaryKey(map);
    }
}