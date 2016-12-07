package com.hzzh.charge.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 时间处理工具类
 * Created by TaoRan on 2016/10/9.
 */
public class DateUtil {

    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /**
     * 计算充电的耗时
     * @param beginTime
     * @param endTime
     * @return
     * @throws ParseException
     */
    public static String getTime(String beginTime, String endTime) throws ParseException {
        String useTime = null;
        if (beginTime != null && endTime != null) {
            Date sTime = sdf.parse(beginTime);
            Date eTime = sdf.parse(endTime);
            Long hour = (eTime.getTime() - sTime.getTime()) / (1000 * 60 * 60);//获得小时
            String time = getMinutesAndSecond(beginTime, endTime);
            useTime = hour.toString() + ":" + time.toString();
        }
        return useTime;
    }

    private static String getMinutesAndSecond(String beginTime, String endTime) throws ParseException {
        Long Time = sdf.parse(endTime).getTime() - sdf.parse(beginTime).getTime();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(Time));
        Integer minutes = calendar.get(Calendar.MINUTE);//获取分钟
        Integer second = calendar.get(Calendar.SECOND);//获取秒
        String time = minutes.toString() + ":" + second.toString();
        return time;
    }


    //    public static void main(String[] args) {
//        try {
//            String useTime = getTime("2016-09-28 12:47:29", "2016-09-28 13:53:59");
//            System.out.println(useTime);
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//    }

    /**
     * 日查询的日期格式化
     * @param dateTime
     * @return
     */
    public static String dayFormat(String dateTime) {
        String regex = dateTime;
        String split[] = regex.split(" ");
        String first = split[0];
        String replace = first.replaceAll("-", "");
        String result = replace + "000000";
        return result;
    }

    /**
     * 月查询的日期格式化
     * @param dateTime
     * @return
     */
    public static String monthFormat(String dateTime){
        String result=dateTime.replace(dateTime,dateTime+"-00");
        return result;
    }

}
