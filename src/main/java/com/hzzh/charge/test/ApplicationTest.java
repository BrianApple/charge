package com.hzzh.charge.test;

import com.hzzh.charge.MyBatisApplication;
import com.hzzh.charge.model.User;
import com.hzzh.charge.utils.HttpClientUtils;
import com.sun.javafx.binding.Logging;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;


/**
 * 单元测试
 * Created by TR on 2016/9/26.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MyBatisApplication.class)
@WebIntegrationTest

public class ApplicationTest {

    /**
     * 查询所有数据
     */
    @Test
    public void testFindAll() {
        String message = HttpClientUtils.testUrl("/user/findAll", null);
        System.out.println(message);
    }

    /**
     * 添加数据
     */
    @Test
    @Transactional
    public void testInsert() {
        User user = new User();
//        user.setUsername("张三丰");
        user.setBirthday(new Date());
        user.setSex("男");
        user.setAddress("武当");
        String message = HttpClientUtils.testUrl("/user/insert", user);
        System.out.println(message);


    }

    /**
     * 根据id查询用户
     */
    @Test
    public void testfindUserById(){
        String message=HttpClientUtils.testUrl("/user/8/findUser",null);
        System.out.println(message);


    }

}
