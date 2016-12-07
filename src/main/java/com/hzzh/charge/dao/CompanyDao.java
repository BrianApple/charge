package com.hzzh.charge.dao;

import com.hzzh.charge.dao.base.BaseCompanyDao;
import com.hzzh.charge.model.company_po.QueryCompany;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 类名称：tb_sys_company表的DAO接口类CompanyDao
 * 内容摘要：自行追加的数据库操作方法
 * @author TaoRan
 * @version 1.0 2016年11月28日
 */
public interface CompanyDao extends BaseCompanyDao {

    /**
     * 根据id查询公司
     * @param guid
     * @return
     * @throws Exception
     */
    List<QueryCompany> queryCompanyById(@Param("guid")String guid)throws Exception;

    /**
     * 查询所有公司
     * @return
     * @throws Exception
     */
    List<QueryCompany> queryAllCompany()throws Exception;

}