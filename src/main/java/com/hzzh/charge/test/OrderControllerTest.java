package com.hzzh.charge.test;

import com.hzzh.charge.MyBatisApplication;
import com.hzzh.charge.model.Order;
import com.hzzh.charge.utils.HttpClientUtils;
import org.apache.commons.collections.map.HashedMap;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.scheduling.annotation.Scheduled;
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
        System.out.println("=======开始执行添加操作========");
        Order order = new Order();
        //guid
        order.setGuid(HttpClientUtils.getUUID());
        //卡号
        order.setCardNo("75984623");
        //站编号
        order.setStationCode("421200000001");
        //设备编号
        order.setDevCode("0002");
        //开始时间
        Date date = new Date();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateTime = sf.format(date);
        order.setChargeBegin(dateTime);
        //消费金额
        BigDecimal bigDecimal1 = new BigDecimal("100.00");
        order.setMonetary(bigDecimal1);
        //资金余额
        order.setBalance("6000");
        //充电类型
        order.setChargeType("1");
        //枪
        order.setPort("1000");
        String message = HttpClientUtils.testUrl("/order/add", order);
        System.out.println(message);
        System.out.println("=======结束添加操作========");
    }


    //更新订单
    @Test
    public void testUpdate() {
        Order order = new Order();
        //卡号
        order.setCardNo("31291938");
        //站编号
        order.setStationCode("421200000002");

        //设备编号
        order.setDevCode("0006");

        //结束时间
        Date date = new Date();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateTime = sf.format(date);
        order.setChargeEnd(dateTime);
        //枪
        order.setPort("1000");

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
        order.setBalance("6000");
        String message = HttpClientUtils.testUrl("/order/update", order);
        System.out.println(message);


    }

    //查询当前订单
    @Test
    public void testCurrentOrder() {
        Map<String, Object> map = new HashedMap();
        map.put("companyId", "a67bef10-5db2-11e5-bd9d-19cc9cdf5fc1");
        map.put("cardNo", "");//卡号或车牌号
        String message = HttpClientUtils.testUrl("/order/currentOrder", map);
        System.out.println(message);
    }

    //数据重传测试
    @Test
    public void testRepeatData() {
        Order order = new Order();
        order.setGuid("78965645345363456");
        order.setCardNo("1111111");
        order.setStationCode("421200000002");
        order.setDevCode("0008");
        order.setPort("1000");
        Date date = new Date();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateTime = sf.format(date);
        order.setChargeBegin(dateTime);

        order.setChargeEnd(dateTime);
        BigDecimal decimal=new BigDecimal("80.00");
        order.setElectricCharge(decimal);
        order.setExpense("160.00");
        order.setBalance("6000");
        order.setMonetary(new BigDecimal("23"));

        String message = HttpClientUtils.testUrl("/order/repeat", order);
        System.out.println(message);

        Order order1 = new Order();
        order1.setGuid("456fsdfnsfdn4sd5f4nsdfnsdfn51");
        order1.setCardNo("1111111");
        order1.setStationCode("421200000002");
        order1.setDevCode("0008");
        order1.setPort("1000");
        order1.setChargeBegin(dateTime);
        order1.setChargeEnd(dateTime);
        order.setElectricCharge(new BigDecimal("160"));
        order.setExpense("160.00");
        order.setBalance("6000");
        order.setMonetary(new BigDecimal("23"));

        String message1 = HttpClientUtils.testUrl("/order/repeat", order1);
        System.out.println(message1);
//
//        Order order2 = new Order();
//        order2.setGuid("456fsdfnsfdn4sd5f4nsdfnsdfn51");
//        order2.setCardNo("1111111");
//        order2.setStationCode("421200000002");
//        order2.setDevCode("0008");
//        order2.setPort("1000");
//        order2.setChargeBegin(dateTime);
//        order2.setChargeEnd(dateTime);
//
//
//        String message2 = HttpClientUtils.testUrl("/order/repeat", order2);
//        System.out.println(message2);


    }

    //查询所有数据,用于车辆日充电详细报表数据导出
    @Test
    public void testFindAll() {
        Map<String, Object> map = new HashedMap();
        map.put("cardNo", "");
        map.put("companyId","a67bef10-5db2-11e5-bd9d-19cc9cdf5fc1");
        map.put("stationName","马桥站");
        map.put("startTime","2016-11-13");
        map.put("endTime","2016-11-14");
        String message=HttpClientUtils.testUrl("/order/exportOrders",map);
        System.out.println(message);
    }

    //图表(车辆月充电统计)
    @Test
    public void testQueryMonthlyData(){
        Map<String,Object>map=new HashedMap();
        map.put("companyId","a67bef10-5db2-11e5-bd9d-19cc9cdf5fc1");
        map.put("cardNo","59722480");
        map.put("dateTime","2016-11");
        String message=HttpClientUtils.testUrl("/order/monthlyData",map);
        System.out.println(message);
    }

    //图表(场站月电量统计)
    @Test
    public void testStationMonthlyChart(){
        Map<String,Object> map=new HashedMap();
        map.put("companyId","a67bef10-5db2-11e5-bd9d-19cc9cdf5fc1");
        map.put("stationName","义乌小商品站");
        map.put("dateTime","2016-11");
        String message=HttpClientUtils.testUrl("/order/stationChart",map);
        System.out.println(message);
    }
}

