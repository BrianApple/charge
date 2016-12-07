package com.hzzh.charge.controller;

import com.hzzh.charge.model.company_po.QueryCompany;
import com.hzzh.charge.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * 组织机构控制器
 * Created by TaoRan on 2016/11/28.
 */
@RestController
@RequestMapping(value = "/company")
public class CompanyController {
    @Autowired
    private CompanyService companyService;

    /**
     * 根据guid查询公司名称
     * @param map
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/queryCompany")
    public List<QueryCompany> queryCompanyById(@RequestBody Map<String, Object> map) throws Exception {
        List<QueryCompany> list = null;
        if (map.get("guid") != null) {
            String guid = map.get("guid").toString();
            list = companyService.queryCompanyById(guid);
        }
        return list;
    }

}
