package com.hzzh.charge.test;

import com.hzzh.charge.MyBatisApplication;
import com.hzzh.charge.utils.HttpClientUtils;
import org.apache.commons.collections.map.HashedMap;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Map;

/**
 * 公司查询测试类
 * Created by TaoRan on 2016/11/28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MyBatisApplication.class)
@WebIntegrationTest
public class CompanyControllerTest {

    @Test
    public void testQueryCompany(){
        Map<String,Object> map=new HashedMap();
        map.put("guid","AAAAAAAA-B2AE-40CE-9FA7-1A409F636EDA");
        String message= HttpClientUtils.testUrl("/company/queryCompany",map);
        System.out.println(message);
    }


}
