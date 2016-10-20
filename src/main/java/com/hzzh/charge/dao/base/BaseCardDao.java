package com.hzzh.charge.dao.base;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.hzzh.charge.model.Card;
import com.hzzh.charge.model.CardExample;

/**
 * 类名称：t_ev_card表的BaseDAO接口类BaseCardDao
 * 内容摘要：针对于单表的基础操作：增删改查以及统计方法，包含物理逻辑操作
 * @author 工具生成
 * @version 1.0 2016年10月19日
 */
public abstract interface BaseCardDao {


    /**
     * 根据条件统计表中数据数量 所有数据
     * @param example CardExample
     * @return int 数据条数
     */
    int countByExample(CardExample example);

    /**
     * 根据条件查询表中数据 所有数据
     * @param example CardExample
     * @return List<Card> 数据集合
     */
    List<Card> selectByExample(CardExample example);

    /**
     * 往表中插入一条数据 系统字段需要输入
     * @param record Card
     * @return int 结果数量
     */
    int insert(Card record);

    /**
     * 往表中批量插入数据 系统字段需要输入
     * @param record List<Card>
     * @return int 结果数量
     */
    int insertList(List<Card> record);

    /**
     * 往表中插入一条数据 字段为空不插入 系统字段需要输入
     * @param record Card
     * @return int 结果数量
     */
    int insertSelective(Card record);

    /**
     * 往表中批量插入数据 字段为空不插入 系统字段需要输入
     * @param record List<Card>
     * @return int 结果数量
     */
    int insertListSelective(List<Card> record);

    /**
     * 根据条件修改数据 所有数据
     * @param record Card
     * @param example CardExample
     * @return int 结果数量
     */
    int updateByExample(@Param("record") Card record, @Param("example") CardExample example);

    /**
     * 根据条件修改数据 字段为空不修改 所有数据
     * @param record Card
     * @param example CardExample
     * @return int 结果数量
     */
    int updateByExampleSelective(@Param("record") Card record, @Param("example") CardExample example);

    /**
     * 根据条件删除数据 物理删除
     * @param example CardExample
     * @return int 结果数量
     */
    int deleteByExample(CardExample example);

    /**
     * 根据主键查询数据 所有数据
     * @param map Map<String, Object>
     * @return Card 数据对象
     */
    Card selectByPrimaryKey(Map<String, Object> map);

    /**
     * 根据主键修改数据 所有数据
     * @param record Card
     * @return int 结果数量
     */
    int updateByPrimaryKey(Card record);

    /**
     * 根据主键修改数据 字段为空不修改 所有数据
     * @param record Card
     * @return int 结果数量
     */
    int updateByPrimaryKeySelective(Card record);

    /**
     * 根据主键删除数据 物理删除
     * @param map Map<String, Object>
     * @return int 结果数量
     */
    int deleteByPrimaryKey(Map<String, Object> map);
}