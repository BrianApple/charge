package com.hzzh.charge.controller;

import com.hzzh.charge.exception.MyException;
import com.hzzh.charge.model.User;
import com.hzzh.charge.service.UserService;
import com.hzzh.charge.utils.OpUtil;
import com.hzzh.charge.utils.Result;
import com.hzzh.charge.utils.VerifyUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

/**
 * 用户控制器
 * Created by TR on 2016/9/24.
 */
@RestController
@RequestMapping(value = "/user")
public class TestController {

    @Autowired
    private UserService userService;
    @Autowired
    private Result result;

    /**
     * 查询user表所有数据
     *
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/findAll")
    public Result findAll() throws MyException {
        List<User> list = userService.findAll();
        if (list == null || list.size() <= 0) {
            result.setMsg(OpUtil.IS_EMPTY);
            return result;
        }
        result.setMsg(OpUtil.SELECT_SUCCESS);
        result.setData(list);
        return result;
    }

    @RequestMapping(value = "/insert")
    public Result insert(@Validated @RequestBody User user, BindingResult error) {

        List list = VerifyUtil.check(error);
        if (list != null && list.size() != 0) {
            result.setMsg("用户名不能为空");
            return result;
        }
        Integer count = null;
        try {
            count = userService.insert(user);
        } catch (Exception e) {
            result.setSuccess(false);
            result.setMsg(OpUtil.ADD_FAIL);
            return result;
        }
        result.setMsg(OpUtil.ADD_SUCCESS);
        result.setData(count);
        return result;
    }

    @RequestMapping(value = "/{id}/findUser")
    public User findUserById(@PathVariable Integer id) throws Exception {
        User findUser = userService.findUserById(id);
        return findUser;
    }

    @RequestMapping(value = "/update")
    public Integer update(User user) throws Exception {
        Integer count = userService.update(user);
        System.out.println(132132);
        return count;
    }
}
