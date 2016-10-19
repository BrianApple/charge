package com.hzzh.charge.exception;

/**
 * 自定义异常
 * Created by TaoRan on 2016/9/28.
 */
public class MyException extends Exception {
    //异常信息
    private String message="系统发生未知的错误！";

    public MyException(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
