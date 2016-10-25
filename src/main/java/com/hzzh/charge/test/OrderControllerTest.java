package com.hzzh.charge.test;

import com.hzzh.charge.MyBatisApplication;
import com.hzzh.charge.model.Order;
import com.hzzh.charge.utils.HttpClientUtils;
import org.apache.commons.collections.map.HashedMap;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

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
        //guid
        order.setGuid("001");
        //卡号
        order.setCardNo("55928272");
        //站编号
        order.setStationCode("421200000001");
        //设备编号
        order.setDevCode("0005");
        //开始时间
        Date date = new Date();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateTime = sf.format(date);
        order.setChargeBegin(dateTime);
        //充电类型
        order.setChargeType("1");
        //枪
        order.setPort("555");
        order.setBalance("109526.88");
        String message = HttpClientUtils.testUrl("/order/add", order);
        System.out.println(message);
    }

    //更新订单
    @Test
    public void testUpdate() {
        Order order = new Order();
        //卡号
        order.setCardNo("55928272");
        //站编号
        order.setStationCode("421200000001");
        //设备编号
        order.setDevCode("0005");
        //结束时间
        Date date = new Date();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateTime = sf.format(date);
        order.setChargeEnd(dateTime);
        //停止充电原因
        order.setStopReason("结算");
        //充电尖度数
        order.setElectricChargeJ("20");
        //充电峰度数
        order.setElectricChargeF("20");
        //充电平度数
        order.setElectricChargeP("30");
        //充电谷度数
        order.setElectricChargeG("30");
        //充电尖金额
        order.setExpenseJ("50");
        //充电峰金额
        order.setExpenseF("50");
        //充电平金额
        order.setExpenseP("50");
        //充电谷金额
        order.setExpenseG("50");
        //充电总度数
        BigDecimal bigDecimal = new BigDecimal("100.00");
        order.setElectricCharge(bigDecimal);
        //总度数金额
        order.setExpense("200");
        //消费金额
        BigDecimal bigDecimal1 = new BigDecimal("100.00");
        order.setMonetary(bigDecimal1);
        //资金余额
        order.setBalance("500");
        String message = HttpClientUtils.testUrl("/order/update", order);
        System.out.println(message);


    }

    //查询当前订单
    @Test
    public void testCurrentOrder() {
        Map<String, Object> map = new HashedMap();
        map.put("companyId","a67bef10-5db2-11e5-bd9d-19cc9cdf5fc1");
        map.put("cardNo","");//卡号或车牌号
        String message = HttpClientUtils.testUrl("/order/currentOrder", map);
        System.out.println(message);
    }
}
