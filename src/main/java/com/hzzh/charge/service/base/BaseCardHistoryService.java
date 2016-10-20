package com.hzzh.charge.service.base;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.hzzh.charge.model.CardHistory;
import com.hzzh.charge.model.CardHistoryExample;

/**
 * 类名称：t_ev_card_history表的BaseService接口类BaseCardHistoryService
 * 内容摘要：针对于单表的基础操作：增删改查以及统计方法，包含物理逻辑操作
 * @author 工具生成
 * @version 1.0 2016年10月20日
 */
public abstract interface BaseCardHistoryService {


    /**
     * 根据条件统计表中数据数量 所有数据
     * @param example CardHistoryExample
     * @return int 数据条数
     */
    int countByExample(CardHistoryExample example);

    /**
     * 根据条件查询表中数据 所有数据
     * @param example CardHistoryExample
     * @return List<CardHistory> 数据集合
     */
    List<CardHistory> selectByExample(CardHistoryExample example);

    /**
     * 往表中插入一条数据 系统字段需要输入
     * @param record CardHistory
     * @return int 结果数量
     */
    int insert(CardHistory record);

    /**
     * 往表中批量插入数据 系统字段需要输入
     * @param record List<CardHistory>
     * @return int 结果数量
     */
    int insertList(List<CardHistory> record);

    /**
     * 往表中插入一条数据 字段为空不插入 系统字段需要输入
     * @param record CardHistory
     * @return int 结果数量
     */
    int insertSelective(CardHistory record);

    /**
     * 往表中批量插入数据 字段为空不插入 系统字段需要输入
     * @param record List<CardHistory>
     * @return int 结果数量
     */
    int insertListSelective(List<CardHistory> record);

    /**
     * 根据条件修改数据 所有数据
     * @param record CardHistory
     * @param example CardHistoryExample
     * @return int 结果数量
     */
    int updateByExample(@Param("record") CardHistory record, @Param("example") CardHistoryExample example);

    /**
     * 根据条件修改数据 字段为空不修改 所有数据
     * @param record CardHistory
     * @param example CardHistoryExample
     * @return int 结果数量
     */
    int updateByExampleSelective(@Param("record") CardHistory record, @Param("example") CardHistoryExample example);

    /**
     * 根据条件删除数据 物理删除
     * @param example CardHistoryExample
     * @return int 结果数量
     */
    int deleteByExample(CardHistoryExample example);

    /**
     * 根据主键查询数据 所有数据
     * @param map Map<String, Object>
     * @return CardHistory 数据对象
     */
    CardHistory selectByPrimaryKey(Map<String, Object> map);

    /**
     * 根据主键修改数据 所有数据
     * @param record CardHistory
     * @return int 结果数量
     */
    int updateByPrimaryKey(CardHistory record);

    /**
     * 根据主键修改数据 字段为空不修改 所有数据
     * @param record CardHistory
     * @return int 结果数量
     */
    int updateByPrimaryKeySelective(CardHistory record);

    /**
     * 根据主键删除数据 物理删除
     * @param map Map<String, Object>
     * @return int 结果数量
     */
    int deleteByPrimaryKey(Map<String, Object> map);
}