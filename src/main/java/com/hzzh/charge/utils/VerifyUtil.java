package com.hzzh.charge.utils;

import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

import java.util.ArrayList;
import java.util.List;

/**
 * 表单验证工具类
 * Created by TaoRan on 2016/10/11.
 */
public class VerifyUtil {

    public static List check(BindingResult error) {
        List<ObjectError> list = new ArrayList<ObjectError>();
        if (error.hasErrors()) {
            list = error.getAllErrors();
            for (ObjectError error1 : list) {
                System.out.println(error1.getCode() + "------" + error1.getArguments() + "----" + error1.getDefaultMessage());
            }
        }
        return list;
    }
}
