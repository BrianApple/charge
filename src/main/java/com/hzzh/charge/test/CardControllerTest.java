package com.hzzh.charge.test;

import com.hzzh.charge.MyBatisApplication;
import com.hzzh.charge.model.Card;
import org.apache.commons.collections.map.HashedMap;
import org.apache.ibatis.annotations.Param;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.hzzh.charge.utils.HttpClientUtils;

import java.util.Date;
import java.util.Map;

/**
 * 卡管理测试类
 * Created by TaoRan on 2016/10/19.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MyBatisApplication.class)
@WebIntegrationTest
public class CardControllerTest {

    //添加卡
    @Test
    public void testAdd() {
        Card card = new Card();
        //主键
        card.setGuid("001");
        //卡号
        card.setCardNo("12345678");
        //车牌号
        card.setCarNo("浙A123AZ");
        //被充值人的公司id
        card.setCompanyId("hzzh-888");
        //被充值人的公司名称
        card.setCompanyName("杭州中恒");
        //被充值人id
        card.setOwnerId("888");
        //被充值人的真是名称
        card.setOwnerName("陶然");

        card.setCreatorId("d45c7258-fe03-4dbe-9c41-a55d53637485");
        card.setCreatorName("企业用户");
        Date date = new Date();
        String dateTime = String.valueOf(date);
        card.setCreateTime(dateTime);
        String message = HttpClientUtils.testUrl("/card/add", card);
        System.out.println(message);


    }

    //查询用户信息
    @Test
    public void testQuertPerson(){
        Map<String,Object> map=new HashedMap();
        map.put("companyId","AAAAAAAA-B2AE-40CE-9FA7-1A409F636EDA");
        String message=HttpClientUtils.testUrl("/card/queryPerson",map);
        System.out.println(message);
    }

    //分页测试
    @Test
    public void testQueryPage(){
        Map<String,Object> map=new HashedMap();
        map.put("pageNum",1);
        map.put("pageSize",20);
        map.put("cardNo","");
        map.put("companyId","AAAAAAAA-B2AE-40CE-9FA7-1A409F636EDA");
        String message=HttpClientUtils.testUrl("/card/queryPage",map);
        System.out.println(message);
    }



}
