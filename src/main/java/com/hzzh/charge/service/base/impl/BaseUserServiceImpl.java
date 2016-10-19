package com.hzzh.charge.service.base.impl;

import com.hzzh.charge.dao.UserDao;

import com.hzzh.charge.model.User;
import com.hzzh.charge.model.UserExample;
import com.hzzh.charge.service.base.BaseUserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

/**
 * 类名称：user表的User接口实现类BaseUserServiceImpl
 * 内容摘要：针对于单表的基础操作：增删改查以及统计方法，包含物理逻辑操作
 * @author 工具生成
 * @version 1.0 2016年09月24日
 */
public class BaseUserServiceImpl implements BaseUserService {

    @Autowired
    protected UserDao userDao;

    /**
     * 根据条件统计表中数据数量 所有数据
     * @param example UserExample
     * @return int 数据条数
     */
    public int countByExample(UserExample example) {
        return userDao.countByExample(example);
    }

    /**
     * 根据条件查询表中数据 所有数据
     * @param example UserExample
     * @return List<User> 数据集合
     */
    public List<User> selectByExample(UserExample example) {
        return userDao.selectByExample(example);
    }

    /**
     * 往表中插入一条数据 系统字段需要输入
     * @param record User
     * @return int 结果数量
     */
    public int insert(User record) {
        return userDao.insert(record);
    }

    /**
     * 往表中批量插入数据 系统字段需要输入
     * @param record List<User>
     * @return int 结果数量
     */
    public int insertList(List<User> record) {
        return userDao.insertList(record);
    }

    /**
     * 往表中插入一条数据 字段为空不插入 系统字段需要输入
     * @param record User
     * @return int 结果数量
     */
    public int insertSelective(User record) {
        return userDao.insertSelective(record);
    }

    /**
     * 往表中批量插入数据 字段为空不插入 系统字段需要输入
     * @param record List<User>
     * @return int 结果数量
     */
    public int insertListSelective(List<User> record) {
        return userDao.insertListSelective(record);
    }

    /**
     * 根据条件修改数据 所有数据
     * @param record User
     * @param example UserExample
     * @return int 结果数量
     */
    public int updateByExample(@Param("record") User record, @Param("example") UserExample example) {
        return userDao.updateByExample(record, example);
    }

    /**
     * 根据条件修改数据 字段为空不修改 所有数据
     * @param record User
     * @param example UserExample
     * @return int 结果数量
     */
    public int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example) {
        return userDao.updateByExampleSelective(record, example);
    }

    /**
     * 根据条件删除数据 物理删除
     * @param example UserExample
     * @return int 结果数量
     */
    public int deleteByExample(UserExample example) {
        return userDao.deleteByExample(example);
    }

    /**
     * 根据主键查询数据 所有数据
     * @param map Map<String, Object>
     * @return User 数据对象
     */
    public User selectByPrimaryKey(Map<String, Object> map) {
        return userDao.selectByPrimaryKey(map);
    }

    /**
     * 根据主键修改数据 所有数据
     * @param record User
     * @return int 结果数量
     */
    public int updateByPrimaryKey(User record) {
        return userDao.updateByPrimaryKey(record);
    }

    /**
     * 根据主键修改数据 字段为空不修改 所有数据
     * @param record User
     * @return int 结果数量
     */
    public int updateByPrimaryKeySelective(User record) {
        return userDao.updateByPrimaryKeySelective(record);
    }

    /**
     * 根据主键删除数据 物理删除
     * @param map Map<String, Object>
     * @return int 结果数量
     */
    public int deleteByPrimaryKey(Map<String, Object> map) {
        return userDao.deleteByPrimaryKey(map);
    }
}