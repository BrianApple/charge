package com.hzzh.charge.dao.base;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.hzzh.charge.model.Company;
import com.hzzh.charge.model.CompanyExample;

/**
 * 类名称：tb_sys_company表的BaseDAO接口类BaseCompanyDao
 * 内容摘要：针对于单表的基础操作：增删改查以及统计方法，包含物理逻辑操作
 * @author 工具生成
 * @version 1.0 2016年11月28日
 */
public abstract interface BaseCompanyDao {


    /**
     * 根据条件统计表中数据数量 所有数据
     * @param example CompanyExample
     * @return int 数据条数
     */
    int countByExample(CompanyExample example);

    /**
     * 根据条件查询表中数据 所有数据
     * @param example CompanyExample
     * @return List<Company> 数据集合
     */
    List<Company> selectByExample(CompanyExample example);

    /**
     * 往表中插入一条数据 系统字段需要输入
     * @param record Company
     * @return int 结果数量
     */
    int insert(Company record);

    /**
     * 往表中批量插入数据 系统字段需要输入
     * @param record List<Company>
     * @return int 结果数量
     */
    int insertList(List<Company> record);

    /**
     * 往表中插入一条数据 字段为空不插入 系统字段需要输入
     * @param record Company
     * @return int 结果数量
     */
    int insertSelective(Company record);

    /**
     * 往表中批量插入数据 字段为空不插入 系统字段需要输入
     * @param record List<Company>
     * @return int 结果数量
     */
    int insertListSelective(List<Company> record);

    /**
     * 根据条件修改数据 所有数据
     * @param record Company
     * @param example CompanyExample
     * @return int 结果数量
     */
    int updateByExample(@Param("record") Company record, @Param("example") CompanyExample example);

    /**
     * 根据条件修改数据 字段为空不修改 所有数据
     * @param record Company
     * @param example CompanyExample
     * @return int 结果数量
     */
    int updateByExampleSelective(@Param("record") Company record, @Param("example") CompanyExample example);

    /**
     * 根据条件删除数据 物理删除
     * @param example CompanyExample
     * @return int 结果数量
     */
    int deleteByExample(CompanyExample example);

    /**
     * 根据主键查询数据 所有数据
     * @param map Map<String, Object>
     * @return Company 数据对象
     */
    Company selectByPrimaryKey(Map<String, Object> map);

    /**
     * 根据主键修改数据 所有数据
     * @param record Company
     * @return int 结果数量
     */
    int updateByPrimaryKey(Company record);

    /**
     * 根据主键修改数据 字段为空不修改 所有数据
     * @param record Company
     * @return int 结果数量
     */
    int updateByPrimaryKeySelective(Company record);

    /**
     * 根据主键删除数据 物理删除
     * @param map Map<String, Object>
     * @return int 结果数量
     */
    int deleteByPrimaryKey(Map<String, Object> map);
}