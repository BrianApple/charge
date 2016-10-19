package com.hzzh.charge.model;

import org.hibernate.validator.constraints.NotEmpty;

import java.io.Serializable;

/**
 * 类名称：user表的实体类User
 * 内容摘要：user表的各个元素的取得、设定方法
 * @author TR
 * @version 1.0 2016年09月24日
 */@SuppressWarnings("serial")
public class User implements Serializable {

    private Integer id;
    /** 用户名称 */
    @NotEmpty(message = "用户名不能空")
    private String username;
    /** 生日 */
    private java.util.Date birthday;
    /** 性别 */
    private String sex;
    /** 地址 */
    private String address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 取得 用户名称
     * @return 用户名称
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设定 用户名称
     * @param username 用户名称
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 取得 生日
     * @return 生日
     */
    public java.util.Date getBirthday() {
        return birthday;
    }

    /**
     * 设定 生日
     * @param birthday 生日
     */
    public void setBirthday(java.util.Date birthday) {
        this.birthday = birthday;
    }

    /**
     * 取得 性别
     * @return 性别
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设定 性别
     * @param sex 性别
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 取得 地址
     * @return 地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设定 地址
     * @param address 地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

}