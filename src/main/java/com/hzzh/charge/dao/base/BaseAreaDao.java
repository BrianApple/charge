package com.hzzh.charge.dao.base;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.hzzh.charge.model.Area;
import com.hzzh.charge.model.AreaExample;

/**
 * 类名称：tb_sys_area表的BaseDAO接口类BaseAreaDao
 * 内容摘要：针对于单表的基础操作：增删改查以及统计方法，包含物理逻辑操作
 * @author 工具生成
 * @version 1.0 2016年10月24日
 */
public abstract interface BaseAreaDao {


    /**
     * 根据条件统计表中数据数量 所有数据
     * @param example AreaExample
     * @return int 数据条数
     */
    int countByExample(AreaExample example);

    /**
     * 根据条件查询表中数据 所有数据
     * @param example AreaExample
     * @return List<Area> 数据集合
     */
    List<Area> selectByExample(AreaExample example);

    /**
     * 往表中插入一条数据 系统字段需要输入
     * @param record Area
     * @return int 结果数量
     */
    int insert(Area record);

    /**
     * 往表中批量插入数据 系统字段需要输入
     * @param record List<Area>
     * @return int 结果数量
     */
    int insertList(List<Area> record);

    /**
     * 往表中插入一条数据 字段为空不插入 系统字段需要输入
     * @param record Area
     * @return int 结果数量
     */
    int insertSelective(Area record);

    /**
     * 往表中批量插入数据 字段为空不插入 系统字段需要输入
     * @param record List<Area>
     * @return int 结果数量
     */
    int insertListSelective(List<Area> record);

    /**
     * 根据条件修改数据 所有数据
     * @param record Area
     * @param example AreaExample
     * @return int 结果数量
     */
    int updateByExample(@Param("record") Area record, @Param("example") AreaExample example);

    /**
     * 根据条件修改数据 字段为空不修改 所有数据
     * @param record Area
     * @param example AreaExample
     * @return int 结果数量
     */
    int updateByExampleSelective(@Param("record") Area record, @Param("example") AreaExample example);

    /**
     * 根据条件删除数据 物理删除
     * @param example AreaExample
     * @return int 结果数量
     */
    int deleteByExample(AreaExample example);

    /**
     * 根据主键查询数据 所有数据
     * @param map Map<String, Object>
     * @return Area 数据对象
     */
    Area selectByPrimaryKey(Map<String, Object> map);

    /**
     * 根据主键修改数据 所有数据
     * @param record Area
     * @return int 结果数量
     */
    int updateByPrimaryKey(Area record);

    /**
     * 根据主键修改数据 字段为空不修改 所有数据
     * @param record Area
     * @return int 结果数量
     */
    int updateByPrimaryKeySelective(Area record);

    /**
     * 根据主键删除数据 物理删除
     * @param map Map<String, Object>
     * @return int 结果数量
     */
    int deleteByPrimaryKey(Map<String, Object> map);
}