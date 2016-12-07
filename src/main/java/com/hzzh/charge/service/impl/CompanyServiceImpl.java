package com.hzzh.charge.service.impl;

import com.hzzh.charge.dao.CompanyDao;
import com.hzzh.charge.model.company_po.QueryCompany;
import com.hzzh.charge.service.CompanyService;
import com.hzzh.charge.utils.OpUtil;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 类名称：tb_sys_company表的ServiceImpl接口类CompanyServiceImpl
 * 内容摘要：扩展ServiceImpl
 *
 * @author TaoRan
 * @version 1.0 2016年11月28日
 */
@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyDao companyDao;


    /**
     * 根据id查询公司
     *
     * @param guid
     * @return
     * @throws Exception
     */
    @Override
    public List<QueryCompany> queryCompanyById(@Param("guid") String guid) throws Exception {
        List<QueryCompany> list = null;
        /**
         * 根据guid来判断是否是中恒公司的人员，如果是，可获得所有公司
         * 否则获取自己的公司
         */
//        if (guid.equals(OpUtil.HZ_MAIN_COMPANY_ID)) {
            list = companyDao.queryAllCompany();
//        } else {
//            list = companyDao.queryCompanyById(guid);
//        }
        return list;
    }
}