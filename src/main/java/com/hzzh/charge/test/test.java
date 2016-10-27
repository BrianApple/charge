//package com.hzzh.charge.test;
//
//import com.hzzh.charge.model.Order;
//import com.hzzh.charge.utils.HttpClientUtils;
//import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.stereotype.Component;
//
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
///**
// * Created by TaoRan on 2016/10/27.
// */
//@Component
//public class test {
//    @Scheduled(fixedRate = 5000)
//    public void testAdd() {
//
//        System.out.println("=======开始执行添加操作1========");
//        Order order = new Order();
//        //guid
//        order.setGuid("4212000000030010100020161027103056");
//        //卡号
//        order.setCardNo("56668864");
//        //站编号
//        order.setStationCode("421200000003");
//        //设备编号
//        order.setDevCode("0010");
//        //开始时间
//        Date date = new Date();
//        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String dateTime = sf.format(date);
//        order.setChargeBegin(dateTime);
//        //充电类型
//        order.setChargeType("1");
//        //枪
//        order.setPort("1000");
//        order.setBalance("109526.88");
//        String message = HttpClientUtils.testUrl("/order/add", order);
//        System.out.println(message);
//        System.out.println("=======结束添加操作1========");
//        System.out.println("=======开始执行添加操作2========");
//
//
//        Order order1 = new Order();
//        //guid
//        order1.setGuid("4212000000030010100020161027103056");
//        //卡号
//        order1.setCardNo("56668864");
//        //站编号
//        order1.setStationCode("421200000003");
//        //设备编号
//        order1.setDevCode("0010");
//        //开始时间
//        Date date1 = new Date();
//        SimpleDateFormat sf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String dateTime1 = sf1.format(date1);
//        order1.setChargeBegin(dateTime1);
//        //充电类型
//        order1.setChargeType("1");
//        //枪
//        order1.setPort("1000");
//        order1.setBalance("109526.88");
//        String message1 = HttpClientUtils.testUrl("/order/add", order1);
//        System.out.println(message1);
//        System.out.println("=======结束添加操作2========");
//
//
//        System.out.println("=======开始执行添加操作3========");
//        Order order3 = new Order();
//        //guid
//        order3.setGuid("4212000000010002100020161027103109");
//        //卡号
//        order3.setCardNo("31382818");
//        //站编号
//        order3.setStationCode("421200000001");
//        //设备编号
//        order3.setDevCode("0002");
//        //开始时间
//        Date date3 = new Date();
//        SimpleDateFormat sf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String dateTime3 = sf3.format(date3);
//        order3.setChargeBegin(dateTime3);
//        //充电类型
//        order3.setChargeType("1");
//        //枪
//        order3.setPort("1000");
//        order3.setBalance("109526.88");
//        String message3 = HttpClientUtils.testUrl("/order/add", order3);
//        System.out.println(message3);
//        System.out.println("=======结束添加操作3========");
//
//    }
//
////    @Scheduled(fixedRate = 1000)
//    public void testAdd1() {
//        /*
//        System.out.println("=======开始执行添加操作2========");
//        Order order1 = new Order();
//        //guid
//        order1.setGuid("4212000000030010100020161027103056");
//        //卡号
//        order1.setCardNo("56668864");
//        //站编号
//        order1.setStationCode("421200000003");
//        //设备编号
//        order1.setDevCode("0010");
//        //开始时间
//        Date date1 = new Date();
//        SimpleDateFormat sf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String dateTime1 = sf1.format(date1);
//        order1.setChargeBegin(dateTime1);
//        //充电类型
//        order1.setChargeType("1");
//        //枪
//        order1.setPort("1000");
//        order1.setBalance("109526.88");
//        String message1 = HttpClientUtils.testUrl("/order/add", order1);
//        System.out.println(message1);
//        System.out.println("=======结束添加操作2========");
//        */
//    }
////    @Scheduled(fixedRate = 10000)
////    public void testAdd3() {
////
////    }
//}
