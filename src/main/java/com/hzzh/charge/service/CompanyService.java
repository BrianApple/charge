package com.hzzh.charge.service;

import com.hzzh.charge.model.company_po.QueryCompany;
import com.hzzh.charge.service.base.BaseCompanyService;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 类名称：tb_sys_company表的Service接口类CompanyService
 * 内容摘要：扩展Service
 * @author TaoRan
 * @version 1.0 2016年11月28日
 */
public interface CompanyService {

    /**
     * 根据id查询公司
     * @param guid
     * @return
     * @throws Exception
     */
    List<QueryCompany> queryCompanyById(@Param("guid")String guid)throws Exception;

}