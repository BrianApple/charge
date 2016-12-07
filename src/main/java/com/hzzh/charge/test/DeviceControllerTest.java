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
 * 设备测试类
 * Created by TaoRan on 2016/12/6.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MyBatisApplication.class)
@WebIntegrationTest
public class DeviceControllerTest {
    @Test
    public void testGetByTypeCode(){
        Map<String,Object>map=new HashedMap();
        map.put("typeCode","300001");
        String message= HttpClientUtils.testUrl("/device/getByTypeCode",map);
        System.out.println(message);
    }
}
