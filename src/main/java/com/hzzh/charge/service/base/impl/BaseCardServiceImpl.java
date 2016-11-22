package com.hzzh.charge.service.base.impl;

import com.hzzh.charge.dao.CardDao;

import com.hzzh.charge.model.Card;
import com.hzzh.charge.model.CardExample;
import com.hzzh.charge.service.base.BaseCardService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

/**
 * 类名称：t_ev_card表的Card接口实现类BaseCardServiceImpl
 * 内容摘要：针对于单表的基础操作：增删改查以及统计方法，包含物理逻辑操作
 * @author 工具生成
 * @version 1.0 2016年11月18日
 */
public class BaseCardServiceImpl implements BaseCardService {

    @Autowired
    protected CardDao cardDao;

    /**
     * 根据条件统计表中数据数量 所有数据
     * @param example CardExample
     * @return int 数据条数
     */
    public int countByExample(CardExample example) {
        return cardDao.countByExample(example);
    }

    /**
     * 根据条件查询表中数据 所有数据
     * @param example CardExample
     * @return List<Card> 数据集合
     */
    public List<Card> selectByExample(CardExample example) {
        return cardDao.selectByExample(example);
    }

    /**
     * 往表中插入一条数据 系统字段需要输入
     * @param record Card
     * @return int 结果数量
     */
    public int insert(Card record) {
        return cardDao.insert(record);
    }

    /**
     * 往表中批量插入数据 系统字段需要输入
     * @param record List<Card>
     * @return int 结果数量
     */
    public int insertList(List<Card> record) {
        return cardDao.insertList(record);
    }

    /**
     * 往表中插入一条数据 字段为空不插入 系统字段需要输入
     * @param record Card
     * @return int 结果数量
     */
    public int insertSelective(Card record) {
        return cardDao.insertSelective(record);
    }

    /**
     * 往表中批量插入数据 字段为空不插入 系统字段需要输入
     * @param record List<Card>
     * @return int 结果数量
     */
    public int insertListSelective(List<Card> record) {
        return cardDao.insertListSelective(record);
    }

    /**
     * 根据条件修改数据 所有数据
     * @param record Card
     * @param example CardExample
     * @return int 结果数量
     */
    public int updateByExample(@Param("record") Card record, @Param("example") CardExample example) {
        return cardDao.updateByExample(record, example);
    }

    /**
     * 根据条件修改数据 字段为空不修改 所有数据
     * @param record Card
     * @param example CardExample
     * @return int 结果数量
     */
    public int updateByExampleSelective(@Param("record") Card record, @Param("example") CardExample example) {
        return cardDao.updateByExampleSelective(record, example);
    }

    /**
     * 根据条件删除数据 物理删除
     * @param example CardExample
     * @return int 结果数量
     */
    public int deleteByExample(CardExample example) {
        return cardDao.deleteByExample(example);
    }

    /**
     * 根据主键查询数据 所有数据
     * @param map Map<String, Object>
     * @return Card 数据对象
     */
    public Card selectByPrimaryKey(Map<String, Object> map) {
        return cardDao.selectByPrimaryKey(map);
    }

    /**
     * 根据主键修改数据 所有数据
     * @param record Card
     * @return int 结果数量
     */
    public int updateByPrimaryKey(Card record) {
        return cardDao.updateByPrimaryKey(record);
    }

    /**
     * 根据主键修改数据 字段为空不修改 所有数据
     * @param record Card
     * @return int 结果数量
     */
    public int updateByPrimaryKeySelective(Card record) {
        return cardDao.updateByPrimaryKeySelective(record);
    }

    /**
     * 根据主键删除数据 物理删除
     * @param map Map<String, Object>
     * @return int 结果数量
     */
    public int deleteByPrimaryKey(Map<String, Object> map) {
        return cardDao.deleteByPrimaryKey(map);
    }
}