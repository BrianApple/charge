package com.hzzh.charge.model.company_po;

/**
 * 根据公司id查询公司名称
 * Created by TaoRan on 2016/11/28.
 */
public class QueryCompany {
    //guid
    private String guid;
    //公司全名
    private String name;

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
