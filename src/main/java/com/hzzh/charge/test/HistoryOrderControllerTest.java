package com.hzzh.charge.test;

import com.hzzh.charge.MyBatisApplication;
import com.hzzh.charge.model.po.HistoryOrder;
import com.hzzh.charge.utils.HttpClientUtils;
import org.apache.commons.collections.map.HashedMap;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.validation.ObjectError;

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
        map.put("pageSize",5);
        map.put("cardNo","");
        map.put("companyId","001");
        map.put("stationName","");
        map.put("startTime","2016-10-05");
        map.put("endTime","2016-10-12");
        String message = HttpClientUtils.testUrl("/charge/queryPage", map);
        System.out.println(message);
    }

    //车辆月报表测试
    @Test
    public void testMonthlyReport(){
        Map<String,Object> map=new HashedMap();
        map.put("dateTime","2016-09");
        map.put("companyId","001");
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
        map.put("companyId","001");
        String message=HttpClientUtils.testUrl("/charge/stationReport",map);
        System.out.println(message);

    }


}
