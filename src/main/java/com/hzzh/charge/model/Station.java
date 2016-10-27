package com.hzzh.charge.model;

import java.io.Serializable;

/**
 * 类名称：tb_base_station表的实体类Station
 * 内容摘要：tb_base_station表的各个元素的取得、设定方法
 * @author TaoRan
 * @version 1.0 2016年10月26日
 */@SuppressWarnings("serial")
public class Station implements Serializable {

    /** GUID_ */
    private String guid;
    /** 名称 */
    private String name;
    /** 简称 */
    private String shortName;
    /** 编码 */
    private String code;
    /** 对应第三方ID */
    private String refCode;
    /** 行业编码 */
    private String industryCode;
    /** 行业名称 */
    private String industryName;
    /** 所属区域ID */
    private String areaId;
    /** 所属区域编码 */
    private String areaCode;
    /** 所属区域名称 */
    private String areaName;
    /** 所在公司 */
    private String companyId;
    /** 站点地址 */
    private String address;
    private String lon;
    private String lat;
    /** 图片路径 */
    private String picturePath;
    /** 管理公司(代维服务商) */
    private String managementCompany;
    /** 建设完工时间 */
    private String completedDate;
    /** 联系人 */
    private String contactPerson;
    /** 联系电话 */
    private String contactTel;
    /** 0-在建,1-运行,2-故障 */
    private String runstatus;
    /** 运行天数 */
    private String runDays;
    /** 数据状态 */
    private String status;

    /**
     * 取得 GUID_
     * @return GUID_
     */
    public String getGuid() {
        return guid;
    }

    /**
     * 设定 GUID_
     * @param guid GUID_
     */
    public void setGuid(String guid) {
        this.guid = guid;
    }

    /**
     * 取得 名称
     * @return 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设定 名称
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 取得 简称
     * @return 简称
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * 设定 简称
     * @param shortName 简称
     */
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    /**
     * 取得 编码
     * @return 编码
     */
    public String getCode() {
        return code;
    }

    /**
     * 设定 编码
     * @param code 编码
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 取得 对应第三方ID
     * @return 对应第三方ID
     */
    public String getRefCode() {
        return refCode;
    }

    /**
     * 设定 对应第三方ID
     * @param refCode 对应第三方ID
     */
    public void setRefCode(String refCode) {
        this.refCode = refCode;
    }

    /**
     * 取得 行业编码
     * @return 行业编码
     */
    public String getIndustryCode() {
        return industryCode;
    }

    /**
     * 设定 行业编码
     * @param industryCode 行业编码
     */
    public void setIndustryCode(String industryCode) {
        this.industryCode = industryCode;
    }

    /**
     * 取得 行业名称
     * @return 行业名称
     */
    public String getIndustryName() {
        return industryName;
    }

    /**
     * 设定 行业名称
     * @param industryName 行业名称
     */
    public void setIndustryName(String industryName) {
        this.industryName = industryName;
    }

    /**
     * 取得 所属区域ID
     * @return 所属区域ID
     */
    public String getAreaId() {
        return areaId;
    }

    /**
     * 设定 所属区域ID
     * @param areaId 所属区域ID
     */
    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    /**
     * 取得 所属区域编码
     * @return 所属区域编码
     */
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * 设定 所属区域编码
     * @param areaCode 所属区域编码
     */
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    /**
     * 取得 所属区域名称
     * @return 所属区域名称
     */
    public String getAreaName() {
        return areaName;
    }

    /**
     * 设定 所属区域名称
     * @param areaName 所属区域名称
     */
    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    /**
     * 取得 所在公司
     * @return 所在公司
     */
    public String getCompanyId() {
        return companyId;
    }

    /**
     * 设定 所在公司
     * @param companyId 所在公司
     */
    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    /**
     * 取得 站点地址
     * @return 站点地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设定 站点地址
     * @param address 站点地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    /**
     * 取得 图片路径
     * @return 图片路径
     */
    public String getPicturePath() {
        return picturePath;
    }

    /**
     * 设定 图片路径
     * @param picturePath 图片路径
     */
    public void setPicturePath(String picturePath) {
        this.picturePath = picturePath;
    }

    /**
     * 取得 管理公司(代维服务商)
     * @return 管理公司(代维服务商)
     */
    public String getManagementCompany() {
        return managementCompany;
    }

    /**
     * 设定 管理公司(代维服务商)
     * @param managementCompany 管理公司(代维服务商)
     */
    public void setManagementCompany(String managementCompany) {
        this.managementCompany = managementCompany;
    }

    /**
     * 取得 建设完工时间
     * @return 建设完工时间
     */
    public String getCompletedDate() {
        return completedDate;
    }

    /**
     * 设定 建设完工时间
     * @param completedDate 建设完工时间
     */
    public void setCompletedDate(String completedDate) {
        this.completedDate = completedDate;
    }

    /**
     * 取得 联系人
     * @return 联系人
     */
    public String getContactPerson() {
        return contactPerson;
    }

    /**
     * 设定 联系人
     * @param contactPerson 联系人
     */
    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    /**
     * 取得 联系电话
     * @return 联系电话
     */
    public String getContactTel() {
        return contactTel;
    }

    /**
     * 设定 联系电话
     * @param contactTel 联系电话
     */
    public void setContactTel(String contactTel) {
        this.contactTel = contactTel;
    }

    /**
     * 取得 0-在建,1-运行,2-故障
     * @return 0-在建,1-运行,2-故障
     */
    public String getRunstatus() {
        return runstatus;
    }

    /**
     * 设定 0-在建,1-运行,2-故障
     * @param runstatus 0-在建,1-运行,2-故障
     */
    public void setRunstatus(String runstatus) {
        this.runstatus = runstatus;
    }

    /**
     * 取得 运行天数
     * @return 运行天数
     */
    public String getRunDays() {
        return runDays;
    }

    /**
     * 设定 运行天数
     * @param runDays 运行天数
     */
    public void setRunDays(String runDays) {
        this.runDays = runDays;
    }

    /**
     * 取得 数据状态
     * @return 数据状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设定 数据状态
     * @param status 数据状态
     */
    public void setStatus(String status) {
        this.status = status;
    }

}