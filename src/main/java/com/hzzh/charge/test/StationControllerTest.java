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
 *场站测试类
 * Created by TaoRan on 2016/12/5.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MyBatisApplication.class)
@WebIntegrationTest
public class StationControllerTest {
    @Test
    public void testQueryStation(){
        Map<String,Object> map=new HashedMap();
        map.put("companyId","a67bef10-5db2-11e5-bd9d-19cc9cdf5fc1");
        map.put("name","马桥站");
        String message= HttpClientUtils.testUrl("/station/queryStations",map);
        System.out.println(message);
    }
    @Test
    public void testQueryStationInfo(){
        Map<String,Object> map=new HashedMap();
        map.put("companyId","a67bef10-5db2-11e5-bd9d-19cc9cdf5fc1");
        map.put("name","马桥站");
        String message= HttpClientUtils.testUrl("/station/queryStationInfo",map);
        System.out.println(message);

    }

}
