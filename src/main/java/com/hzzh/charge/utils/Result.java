package com.hzzh.charge.utils;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * Created by TaoRan on 2016/10/9.
 */
@Component
public class Result implements Serializable {
    private boolean success = true;
    private String msg;
    private Object data;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
