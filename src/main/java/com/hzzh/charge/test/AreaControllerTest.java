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
 * 行政区域测试类
 * Created by TaoRan on 2016/10/24.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MyBatisApplication.class)
@WebIntegrationTest
public class AreaControllerTest {
    //查询区域
    @Test
    public void testProvinces(){
        Map<String,Object> map=new HashedMap();
        map.put("code","000000");
        String message= HttpClientUtils.testUrl("/area/queryArea",map);
        System.out.println(message);
    }


}
