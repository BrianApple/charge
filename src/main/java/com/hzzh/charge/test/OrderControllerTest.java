package com.hzzh.charge.test;

import com.hzzh.charge.MyBatisApplication;
import com.hzzh.charge.model.Order;
import com.hzzh.charge.utils.HttpClientUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 订单测试类
 * Created by TaoRan on 2016/10/24.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MyBatisApplication.class)
@WebIntegrationTest
public class OrderControllerTest {

    //新增订单
    @Test
    public void testAdd() {
        Order order = new Order();
        order.setGuid("001");//guid
        order.setCardNo("31382818");//卡号
        order.setStationCode("421200000002");//站编号
        order.setDevCode("0002");//设备编号
        order.setChargeBegin("2016-10-23 17:70:50");//开始时间
        order.setChargeType("1#");//充电类型
        order.setPort("555");//枪
        String message = HttpClientUtils.testUrl("/order/add", order);
        System.out.println(message);
    }
}
