package com.hzzh.charge.model;

import java.io.Serializable;

/**
 * 类名称：tb_sys_area表的实体类Area
 * 内容摘要：tb_sys_area表的各个元素的取得、设定方法
 * @author TaoRan
 * @version 1.0 2016年10月24日
 */@SuppressWarnings("serial")
public class Area implements Serializable {

    /** GUID_ */
    private String guid;
    /** 名称 */
    private String name;
    /** 编码 */
    private String code;
    /** 父节点编码 */
    private String parentCode;
    /** 第三方对应ID */
    private String eCode;
    /** 数据状态 */
    private String status;
    private String lon;
    private String lat;

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
     * 取得 父节点编码
     * @return 父节点编码
     */
    public String getParentCode() {
        return parentCode;
    }

    /**
     * 设定 父节点编码
     * @param parentCode 父节点编码
     */
    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    /**
     * 取得 第三方对应ID
     * @return 第三方对应ID
     */
    public String geteCode() {
        return eCode;
    }

    /**
     * 设定 第三方对应ID
     * @param eCode 第三方对应ID
     */
    public void seteCode(String eCode) {
        this.eCode = eCode;
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

}