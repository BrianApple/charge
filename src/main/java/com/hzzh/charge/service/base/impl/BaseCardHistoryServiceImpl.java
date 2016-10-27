package com.hzzh.charge.service.base.impl;

import com.hzzh.charge.dao.CardHistoryDao;

import com.hzzh.charge.model.CardHistory;
import com.hzzh.charge.model.CardHistoryExample;
import com.hzzh.charge.service.base.BaseCardHistoryService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

/**
 * 类名称：t_ev_card_history表的CardHistory接口实现类BaseCardHistoryServiceImpl
 * 内容摘要：针对于单表的基础操作：增删改查以及统计方法，包含物理逻辑操作
 * @author 工具生成
 * @version 1.0 2016年10月26日
 */
public class BaseCardHistoryServiceImpl implements BaseCardHistoryService {

    @Autowired
    protected CardHistoryDao cardHistoryDao;

    /**
     * 根据条件统计表中数据数量 所有数据
     * @param example CardHistoryExample
     * @return int 数据条数
     */
    public int countByExample(CardHistoryExample example) {
        return cardHistoryDao.countByExample(example);
    }

    /**
     * 根据条件查询表中数据 所有数据
     * @param example CardHistoryExample
     * @return List<CardHistory> 数据集合
     */
    public List<CardHistory> selectByExample(CardHistoryExample example) {
        return cardHistoryDao.selectByExample(example);
    }

    /**
     * 往表中插入一条数据 系统字段需要输入
     * @param record CardHistory
     * @return int 结果数量
     */
    public int insert(CardHistory record) {
        return cardHistoryDao.insert(record);
    }

    /**
     * 往表中批量插入数据 系统字段需要输入
     * @param record List<CardHistory>
     * @return int 结果数量
     */
    public int insertList(List<CardHistory> record) {
        return cardHistoryDao.insertList(record);
    }

    /**
     * 往表中插入一条数据 字段为空不插入 系统字段需要输入
     * @param record CardHistory
     * @return int 结果数量
     */
    public int insertSelective(CardHistory record) {
        return cardHistoryDao.insertSelective(record);
    }

    /**
     * 往表中批量插入数据 字段为空不插入 系统字段需要输入
     * @param record List<CardHistory>
     * @return int 结果数量
     */
    public int insertListSelective(List<CardHistory> record) {
        return cardHistoryDao.insertListSelective(record);
    }

    /**
     * 根据条件修改数据 所有数据
     * @param record CardHistory
     * @param example CardHistoryExample
     * @return int 结果数量
     */
    public int updateByExample(@Param("record") CardHistory record, @Param("example") CardHistoryExample example) {
        return cardHistoryDao.updateByExample(record, example);
    }

    /**
     * 根据条件修改数据 字段为空不修改 所有数据
     * @param record CardHistory
     * @param example CardHistoryExample
     * @return int 结果数量
     */
    public int updateByExampleSelective(@Param("record") CardHistory record, @Param("example") CardHistoryExample example) {
        return cardHistoryDao.updateByExampleSelective(record, example);
    }

    /**
     * 根据条件删除数据 物理删除
     * @param example CardHistoryExample
     * @return int 结果数量
     */
    public int deleteByExample(CardHistoryExample example) {
        return cardHistoryDao.deleteByExample(example);
    }

    /**
     * 根据主键查询数据 所有数据
     * @param map Map<String, Object>
     * @return CardHistory 数据对象
     */
    public CardHistory selectByPrimaryKey(Map<String, Object> map) {
        return cardHistoryDao.selectByPrimaryKey(map);
    }

    /**
     * 根据主键修改数据 所有数据
     * @param record CardHistory
     * @return int 结果数量
     */
    public int updateByPrimaryKey(CardHistory record) {
        return cardHistoryDao.updateByPrimaryKey(record);
    }

    /**
     * 根据主键修改数据 字段为空不修改 所有数据
     * @param record CardHistory
     * @return int 结果数量
     */
    public int updateByPrimaryKeySelective(CardHistory record) {
        return cardHistoryDao.updateByPrimaryKeySelective(record);
    }

    /**
     * 根据主键删除数据 物理删除
     * @param map Map<String, Object>
     * @return int 结果数量
     */
    public int deleteByPrimaryKey(Map<String, Object> map) {
        return cardHistoryDao.deleteByPrimaryKey(map);
    }
}