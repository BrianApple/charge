package com.hzzh.charge.service.base;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.hzzh.charge.model.User;
import com.hzzh.charge.model.UserExample;

/**
 * 类名称：user表的BaseService接口类BaseUserService
 * 内容摘要：针对于单表的基础操作：增删改查以及统计方法，包含物理逻辑操作
 * @author 工具生成
 * @version 1.0 2016年09月24日
 */
public abstract interface BaseUserService {


    /**
     * 根据条件统计表中数据数量 所有数据
     * @param example UserExample
     * @return int 数据条数
     */
    int countByExample(UserExample example);

    /**
     * 根据条件查询表中数据 所有数据
     * @param example UserExample
     * @return List<User> 数据集合
     */
    List<User> selectByExample(UserExample example);

    /**
     * 往表中插入一条数据 系统字段需要输入
     * @param record User
     * @return int 结果数量
     */
    int insert(User record);

    /**
     * 往表中批量插入数据 系统字段需要输入
     * @param record List<User>
     * @return int 结果数量
     */
    int insertList(List<User> record);

    /**
     * 往表中插入一条数据 字段为空不插入 系统字段需要输入
     * @param record User
     * @return int 结果数量
     */
    int insertSelective(User record);

    /**
     * 往表中批量插入数据 字段为空不插入 系统字段需要输入
     * @param record List<User>
     * @return int 结果数量
     */
    int insertListSelective(List<User> record);

    /**
     * 根据条件修改数据 所有数据
     * @param record User
     * @param example UserExample
     * @return int 结果数量
     */
    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    /**
     * 根据条件修改数据 字段为空不修改 所有数据
     * @param record User
     * @param example UserExample
     * @return int 结果数量
     */
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    /**
     * 根据条件删除数据 物理删除
     * @param example UserExample
     * @return int 结果数量
     */
    int deleteByExample(UserExample example);

    /**
     * 根据主键查询数据 所有数据
     * @param map Map<String, Object>
     * @return User 数据对象
     */
    User selectByPrimaryKey(Map<String, Object> map);

    /**
     * 根据主键修改数据 所有数据
     * @param record User
     * @return int 结果数量
     */
    int updateByPrimaryKey(User record);

    /**
     * 根据主键修改数据 字段为空不修改 所有数据
     * @param record User
     * @return int 结果数量
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * 根据主键删除数据 物理删除
     * @param map Map<String, Object>
     * @return int 结果数量
     */
    int deleteByPrimaryKey(Map<String, Object> map);
}