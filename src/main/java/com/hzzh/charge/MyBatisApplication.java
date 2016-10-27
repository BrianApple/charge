package com.hzzh.charge;

import com.hzzh.charge.model.Order;
import com.hzzh.charge.utils.HttpClientUtils;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.annotation.Schedules;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * 启动
 * Created by TR on 2016/9/21.
 *
 * @MapperScan:扫描dao接口
 * @EnableCaching:开启缓存注解
 */
@SpringBootApplication
@MapperScan("com.hzzh.charge.dao")
@ComponentScan("com.hzzh.charge.*")
//@EnableCaching
@EnableScheduling
public class MyBatisApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyBatisApplication.class, args);
    }

}



/**
 * 如果需要部署到tomcat上，请打开下面被注释的代码
 */
//public class MyBatisApplication extends SpringBootServletInitializer {
//
//
//    public static void main(String[] args) {
//        SpringApplication.run(MyBatisApplication.class,args);
//    }
//
//    @Override
//    protected SpringApplicationBuilder createSpringApplicationBuilder() {
//        return super.createSpringApplicationBuilder();
//    }
//}


