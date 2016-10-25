package com.hzzh.charge.service.base.impl;

import com.hzzh.charge.dao.OrderDao;

import com.hzzh.charge.model.Order;
import com.hzzh.charge.model.OrderExample;
import com.hzzh.charge.service.base.BaseOrderService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

/**
 * 类名称：t_ev_order表的Order接口实现类BaseOrderServiceImpl
 * 内容摘要：针对于单表的基础操作：增删改查以及统计方法，包含物理逻辑操作
 * @author 工具生成
 * @version 1.0 2016年10月25日
 */
public class BaseOrderServiceImpl implements BaseOrderService {

    @Autowired
    protected OrderDao orderDao;

    /**
     * 根据条件统计表中数据数量 所有数据
     * @param example OrderExample
     * @return int 数据条数
     */
    public int countByExample(OrderExample example) {
        return orderDao.countByExample(example);
    }

    /**
     * 根据条件查询表中数据 所有数据
     * @param example OrderExample
     * @return List<Order> 数据集合
     */
    public List<Order> selectByExample(OrderExample example) {
        return orderDao.selectByExample(example);
    }

    /**
     * 往表中插入一条数据 系统字段需要输入
     * @param record Order
     * @return int 结果数量
     */
    public int insert(Order record) {
        return orderDao.insert(record);
    }

    /**
     * 往表中批量插入数据 系统字段需要输入
     * @param record List<Order>
     * @return int 结果数量
     */
    public int insertList(List<Order> record) {
        return orderDao.insertList(record);
    }

    /**
     * 往表中插入一条数据 字段为空不插入 系统字段需要输入
     * @param record Order
     * @return int 结果数量
     */
    public int insertSelective(Order record) {
        return orderDao.insertSelective(record);
    }

    /**
     * 往表中批量插入数据 字段为空不插入 系统字段需要输入
     * @param record List<Order>
     * @return int 结果数量
     */
    public int insertListSelective(List<Order> record) {
        return orderDao.insertListSelective(record);
    }

    /**
     * 根据条件修改数据 所有数据
     * @param record Order
     * @param example OrderExample
     * @return int 结果数量
     */
    public int updateByExample(@Param("record") Order record, @Param("example") OrderExample example) {
        return orderDao.updateByExample(record, example);
    }

    /**
     * 根据条件修改数据 字段为空不修改 所有数据
     * @param record Order
     * @param example OrderExample
     * @return int 结果数量
     */
    public int updateByExampleSelective(@Param("record") Order record, @Param("example") OrderExample example) {
        return orderDao.updateByExampleSelective(record, example);
    }

    /**
     * 根据条件删除数据 物理删除
     * @param example OrderExample
     * @return int 结果数量
     */
    public int deleteByExample(OrderExample example) {
        return orderDao.deleteByExample(example);
    }

    /**
     * 根据主键查询数据 所有数据
     * @param map Map<String, Object>
     * @return Order 数据对象
     */
    public Order selectByPrimaryKey(Map<String, Object> map) {
        return orderDao.selectByPrimaryKey(map);
    }

    /**
     * 根据主键修改数据 所有数据
     * @param record Order
     * @return int 结果数量
     */
    public int updateByPrimaryKey(Order record) {
        return orderDao.updateByPrimaryKey(record);
    }

    /**
     * 根据主键修改数据 字段为空不修改 所有数据
     * @param record Order
     * @return int 结果数量
     */
    public int updateByPrimaryKeySelective(Order record) {
        return orderDao.updateByPrimaryKeySelective(record);
    }

    /**
     * 根据主键删除数据 物理删除
     * @param map Map<String, Object>
     * @return int 结果数量
     */
    public int deleteByPrimaryKey(Map<String, Object> map) {
        return orderDao.deleteByPrimaryKey(map);
    }
}