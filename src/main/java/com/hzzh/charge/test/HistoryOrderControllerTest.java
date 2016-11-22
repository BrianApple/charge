package com.hzzh.charge.test;

import com.hzzh.charge.MyBatisApplication;
import com.hzzh.charge.utils.HttpClientUtils;
import org.apache.commons.collections.map.HashedMap;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.Map;

/**
 * 历史订单测试类
 * Created by TaoRan on 2016/10/8.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MyBatisApplication.class)
@WebIntegrationTest

public class HistoryOrderControllerTest {
    //分页测试
    @Test
    public void testQueryPage() {
        Map<String,Object> map=new HashedMap();
        map.put("pageNum",1);
        map.put("pageSize",10);
        map.put("cardNo","");
        map.put("companyId","a67bef10-5db2-11e5-bd9d-19cc9cdf5fc1");
        map.put("stationName","");
        map.put("startTime","");
        map.put("endTime","");
        String message = HttpClientUtils.testUrl("/charge/queryPage", map);
        System.out.println(message);
    }

    //车辆月报表测试
    @Test
    public void testMonthlyReport(){
        Map<String,Object> map=new HashedMap();
        map.put("dateTime","");
        map.put("companyId","a67bef10-5db2-11e5-bd9d-19cc9cdf5fc1");
        String message=HttpClientUtils.testUrl("/charge/monthlyReport",map);
        System.out.println(message);

    }

    //车辆日报表测试
    @Test
    public void testDailyReport(){
        Map<String,Object> map=new HashedMap();
        map.put("dateTime","2016-10-07");
        map.put("companyId","001");
        String message=HttpClientUtils.testUrl("/charge/dailyReport",map);
        System.out.println(message);

    }

    //场站月报表测试
    @Test
    public void testStationReport(){

        Map<String,Object> map=new HashedMap();
        map.put("dateTime","2016-10");
        map.put("companyId","a67bef10-5db2-11e5-bd9d-19cc9cdf5fc1");
        String message=HttpClientUtils.testUrl("/charge/stationReport",map);
        System.out.println(message);

    }

    //测试当月接入充电桩次数
    @Test
    public void testPoles(){
        Map<String,Object> map=new HashedMap();
        map.put("companyId","ecbaeb3e-238d-11e5-bb46-00155d165f08");
        String message=HttpClientUtils.testUrl("/charge/poleCount",map);
        System.out.println(message);
    }


}
