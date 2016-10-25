package com.hzzh.charge.dao.base;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.hzzh.charge.model.Order;
import com.hzzh.charge.model.OrderExample;

/**
 * 类名称：t_ev_order表的BaseDAO接口类BaseOrderDao
 * 内容摘要：针对于单表的基础操作：增删改查以及统计方法，包含物理逻辑操作
 * @author 工具生成
 * @version 1.0 2016年10月25日
 */
public abstract interface BaseOrderDao {


    /**
     * 根据条件统计表中数据数量 所有数据
     * @param example OrderExample
     * @return int 数据条数
     */
    int countByExample(OrderExample example);

    /**
     * 根据条件查询表中数据 所有数据
     * @param example OrderExample
     * @return List<Order> 数据集合
     */
    List<Order> selectByExample(OrderExample example);

    /**
     * 往表中插入一条数据 系统字段需要输入
     * @param record Order
     * @return int 结果数量
     */
    int insert(Order record);

    /**
     * 往表中批量插入数据 系统字段需要输入
     * @param record List<Order>
     * @return int 结果数量
     */
    int insertList(List<Order> record);

    /**
     * 往表中插入一条数据 字段为空不插入 系统字段需要输入
     * @param record Order
     * @return int 结果数量
     */
    int insertSelective(Order record);

    /**
     * 往表中批量插入数据 字段为空不插入 系统字段需要输入
     * @param record List<Order>
     * @return int 结果数量
     */
    int insertListSelective(List<Order> record);

    /**
     * 根据条件修改数据 所有数据
     * @param record Order
     * @param example OrderExample
     * @return int 结果数量
     */
    int updateByExample(@Param("record") Order record, @Param("example") OrderExample example);

    /**
     * 根据条件修改数据 字段为空不修改 所有数据
     * @param record Order
     * @param example OrderExample
     * @return int 结果数量
     */
    int updateByExampleSelective(@Param("record") Order record, @Param("example") OrderExample example);

    /**
     * 根据条件删除数据 物理删除
     * @param example OrderExample
     * @return int 结果数量
     */
    int deleteByExample(OrderExample example);

    /**
     * 根据主键查询数据 所有数据
     * @param map Map<String, Object>
     * @return Order 数据对象
     */
    Order selectByPrimaryKey(Map<String, Object> map);

    /**
     * 根据主键修改数据 所有数据
     * @param record Order
     * @return int 结果数量
     */
    int updateByPrimaryKey(Order record);

    /**
     * 根据主键修改数据 字段为空不修改 所有数据
     * @param record Order
     * @return int 结果数量
     */
    int updateByPrimaryKeySelective(Order record);

    /**
     * 根据主键删除数据 物理删除
     * @param map Map<String, Object>
     * @return int 结果数量
     */
    int deleteByPrimaryKey(Map<String, Object> map);
}