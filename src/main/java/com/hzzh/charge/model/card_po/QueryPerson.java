package com.hzzh.charge.model.card_po;

/**
 * 查询用户扩展类
 * Created by TaoRan on 2016/10/20.
 */
public class QueryPerson {
    //guid
    private String guid;
    //姓名
    private String name;
    //公司id
    private String companyId;
    //公司名称
    private String companyName;

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

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
