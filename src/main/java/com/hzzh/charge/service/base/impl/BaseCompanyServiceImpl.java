package com.hzzh.charge.service.base.impl;

import com.hzzh.charge.dao.CompanyDao;

import com.hzzh.charge.model.Company;
import com.hzzh.charge.model.CompanyExample;
import com.hzzh.charge.service.base.BaseCompanyService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

/**
 * 类名称：tb_sys_company表的Company接口实现类BaseCompanyServiceImpl
 * 内容摘要：针对于单表的基础操作：增删改查以及统计方法，包含物理逻辑操作
 * @author 工具生成
 * @version 1.0 2016年11月28日
 */
public class BaseCompanyServiceImpl implements BaseCompanyService {

    @Autowired
    protected CompanyDao companyDao;

    /**
     * 根据条件统计表中数据数量 所有数据
     * @param example CompanyExample
     * @return int 数据条数
     */
    public int countByExample(CompanyExample example) {
        return companyDao.countByExample(example);
    }

    /**
     * 根据条件查询表中数据 所有数据
     * @param example CompanyExample
     * @return List<Company> 数据集合
     */
    public List<Company> selectByExample(CompanyExample example) {
        return companyDao.selectByExample(example);
    }

    /**
     * 往表中插入一条数据 系统字段需要输入
     * @param record Company
     * @return int 结果数量
     */
    public int insert(Company record) {
        return companyDao.insert(record);
    }

    /**
     * 往表中批量插入数据 系统字段需要输入
     * @param record List<Company>
     * @return int 结果数量
     */
    public int insertList(List<Company> record) {
        return companyDao.insertList(record);
    }

    /**
     * 往表中插入一条数据 字段为空不插入 系统字段需要输入
     * @param record Company
     * @return int 结果数量
     */
    public int insertSelective(Company record) {
        return companyDao.insertSelective(record);
    }

    /**
     * 往表中批量插入数据 字段为空不插入 系统字段需要输入
     * @param record List<Company>
     * @return int 结果数量
     */
    public int insertListSelective(List<Company> record) {
        return companyDao.insertListSelective(record);
    }

    /**
     * 根据条件修改数据 所有数据
     * @param record Company
     * @param example CompanyExample
     * @return int 结果数量
     */
    public int updateByExample(@Param("record") Company record, @Param("example") CompanyExample example) {
        return companyDao.updateByExample(record, example);
    }

    /**
     * 根据条件修改数据 字段为空不修改 所有数据
     * @param record Company
     * @param example CompanyExample
     * @return int 结果数量
     */
    public int updateByExampleSelective(@Param("record") Company record, @Param("example") CompanyExample example) {
        return companyDao.updateByExampleSelective(record, example);
    }

    /**
     * 根据条件删除数据 物理删除
     * @param example CompanyExample
     * @return int 结果数量
     */
    public int deleteByExample(CompanyExample example) {
        return companyDao.deleteByExample(example);
    }

    /**
     * 根据主键查询数据 所有数据
     * @param map Map<String, Object>
     * @return Company 数据对象
     */
    public Company selectByPrimaryKey(Map<String, Object> map) {
        return companyDao.selectByPrimaryKey(map);
    }

    /**
     * 根据主键修改数据 所有数据
     * @param record Company
     * @return int 结果数量
     */
    public int updateByPrimaryKey(Company record) {
        return companyDao.updateByPrimaryKey(record);
    }

    /**
     * 根据主键修改数据 字段为空不修改 所有数据
     * @param record Company
     * @return int 结果数量
     */
    public int updateByPrimaryKeySelective(Company record) {
        return companyDao.updateByPrimaryKeySelective(record);
    }

    /**
     * 根据主键删除数据 物理删除
     * @param map Map<String, Object>
     * @return int 结果数量
     */
    public int deleteByPrimaryKey(Map<String, Object> map) {
        return companyDao.deleteByPrimaryKey(map);
    }
}