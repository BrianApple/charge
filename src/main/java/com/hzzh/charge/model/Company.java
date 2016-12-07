package com.hzzh.charge.model;

import java.io.Serializable;

/**
 * 类名称：tb_sys_company表的实体类Company
 * 内容摘要：tb_sys_company表的各个元素的取得、设定方法
 * @author TaoRan
 * @version 1.0 2016年11月28日
 */@SuppressWarnings("serial")
public class Company implements Serializable {

    /** GUID_ */
    private String guid;
    /** 公司简称 */
    private String name;
    /** 公司全称 */
    private String fullName;
    /** 所属行业编码 */
    private String industryCode;
    /** 行业名称 */
    private String industryName;
    /** 主门户ID,默认应用ID */
    private String portalId;
    /** 数据状态 */
    private String status;
    /** LOGO路径 */
    private String logoPath;
    /** 用户类别(PLATFORM、PROVIDER、ENTERPRISE、GOVERNMENT) */
    private String userType;
    /** 区域编码 */
    private String areaCode;
    /** 区域名称 */
    private String areaName;
    /** 公司地理位置 */
    private String address;

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
     * 取得 公司简称
     * @return 公司简称
     */
    public String getName() {
        return name;
    }

    /**
     * 设定 公司简称
     * @param name 公司简称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 取得 公司全称
     * @return 公司全称
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * 设定 公司全称
     * @param fullName 公司全称
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * 取得 所属行业编码
     * @return 所属行业编码
     */
    public String getIndustryCode() {
        return industryCode;
    }

    /**
     * 设定 所属行业编码
     * @param industryCode 所属行业编码
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
     * 取得 主门户ID,默认应用ID
     * @return 主门户ID,默认应用ID
     */
    public String getPortalId() {
        return portalId;
    }

    /**
     * 设定 主门户ID,默认应用ID
     * @param portalId 主门户ID,默认应用ID
     */
    public void setPortalId(String portalId) {
        this.portalId = portalId;
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

    /**
     * 取得 LOGO路径
     * @return LOGO路径
     */
    public String getLogoPath() {
        return logoPath;
    }

    /**
     * 设定 LOGO路径
     * @param logoPath LOGO路径
     */
    public void setLogoPath(String logoPath) {
        this.logoPath = logoPath;
    }

    /**
     * 取得 用户类别(PLATFORM、PROVIDER、ENTERPRISE、GOVERNMENT)
     * @return 用户类别(PLATFORM、PROVIDER、ENTERPRISE、GOVERNMENT)
     */
    public String getUserType() {
        return userType;
    }

    /**
     * 设定 用户类别(PLATFORM、PROVIDER、ENTERPRISE、GOVERNMENT)
     * @param userType 用户类别(PLATFORM、PROVIDER、ENTERPRISE、GOVERNMENT)
     */
    public void setUserType(String userType) {
        this.userType = userType;
    }

    /**
     * 取得 区域编码
     * @return 区域编码
     */
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * 设定 区域编码
     * @param areaCode 区域编码
     */
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    /**
     * 取得 区域名称
     * @return 区域名称
     */
    public String getAreaName() {
        return areaName;
    }

    /**
     * 设定 区域名称
     * @param areaName 区域名称
     */
    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    /**
     * 取得 公司地理位置
     * @return 公司地理位置
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设定 公司地理位置
     * @param address 公司地理位置
     */
    public void setAddress(String address) {
        this.address = address;
    }

}