package com.hzzh.charge.test;

import com.hzzh.charge.MyBatisApplication;
import com.hzzh.charge.model.Card;
import com.hzzh.charge.model.CardHistory;
import com.hzzh.charge.model.card_po.CardAction;
import org.apache.commons.collections.map.HashedMap;
import org.hibernate.validator.internal.util.privilegedactions.NewSchema;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.hzzh.charge.utils.HttpClientUtils;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
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
        CardAction cardAction = new CardAction();
        Card card = new Card();
        CardHistory cardHistory = new CardHistory();

        //主键
        card.setGuid("001");
        //卡号
        card.setCardNo("888999");
        //车牌号
        card.setCarNo("鄂888AZ");
        //被充值人的公司id
        card.setCompanyId("AAAAAAAA-B2AE-40CE-9FA7-1A409F636EDA");
        //被充值人的公司名称
        card.setCompanyName("武当山");
        //被充值人id
        card.setOwnerId("123");
        //被充值人的真是名称
        card.setOwnerName("张三峰");
        card.setCreatorId("d45c7258-fe03-4dbe-9c41-a55d53637485");
        card.setCreatorName("企业用户");
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateTime = simpleDateFormat.format(date);
        card.setCreateTime(dateTime);

        //添加历史记录
        //guid
        cardHistory.setGuid("001");
        //充值卡编号
        cardHistory.setCardNo("888999");
        //车牌号
        cardHistory.setCarNo("鄂888AZ");
        //公司id
        cardHistory.setCompanyId("AAAAAAAA-B2AE-40CE-9FA7-1A409F636EDA");
        //公司名称
        cardHistory.setCompanyName("武当山");
        //所属人id
        cardHistory.setOwnerId("123");
        //所属人姓名
        cardHistory.setOwnerName("张三峰");
        //操作人id
        cardHistory.setOperatorId("d45c7258-fe03-4dbe-9c41-a55d53637485");
        //操作人姓名
        cardHistory.setOperatorName("企业用户");
        //状态为正常（状态为正常（卡状态:0-未激活,1-正常(已激活),2-锁定,3-注销）
        cardHistory.setCardStatus("1");
        //操作状态为充值（操作状态为充值（操作类型:0-创建,1-充值，2-改变状态））
        cardHistory.setOperatorType("0");
        //操作时间
        Date date1 = new Date();
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateTime1 = simpleDateFormat1.format(date1);
        cardHistory.setOperateTime(dateTime1);
        cardAction.setCard(card);
        cardAction.setCardHistory(cardHistory);
        String message = HttpClientUtils.testUrl("/card/add", cardAction);
        System.out.println(message);


    }

    //查询用户信息
    @Test
    public void testQuertPerson() {
        Map<String, Object> map = new HashedMap();
        map.put("companyId", "AAAAAAAA-B2AE-40CE-9FA7-1A409F636EDA");
        String message = HttpClientUtils.testUrl("/card/queryPerson", map);
        System.out.println(message);
    }

    //分页测试
    @Test
    public void testQueryPage() {
        Map<String, Object> map = new HashedMap();
        map.put("pageNum", 1);
        map.put("pageSize", 20);
        map.put("cardNo", "52271808");
        map.put("companyId", "AAAAAAAA-B2AE-40CE-9FA7-1A409F636EDA");
        String message = HttpClientUtils.testUrl("/card/queryPage", map);
        System.out.println(message);
    }

    //充值卡,锁定,注销
    @Test
    public void testLocked() {
        CardAction cardAction = new CardAction();
        Card card = new Card();
        CardHistory cardHistory = new CardHistory();
        card.setCardNo("75986321");
        //状态为正常（卡状态:0-未激活,1-正常(已激活),2-锁定,3-注销）
        card.setCardStatus("2");


        //添加充值卡历史记录
        cardHistory.setGuid("001");
        cardHistory.setCardNo("75986321");
        cardHistory.setCardStatus("2");
        //操作状态为充值（操作类型:0-创建,1-充值，2-改变状态）
        cardHistory.setOperatorType("1");

        cardHistory.setCarNo("浙A5026");
        cardHistory.setCompanyId("a67bef10-5db2-11e5-bd9d-19cc9cdf5fc1");
        cardHistory.setCompanyName("杭州中恒");
        cardHistory.setOwnerId("888");
        cardHistory.setOwnerName("陶然");
        cardHistory.setOperatorId("d45c7258-fe03-4dbe-9c41-a55d53637485");
        cardHistory.setOperatorName("企业用户");
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateTime = simpleDateFormat.format(date);
        cardHistory.setOperateTime(dateTime);
        cardAction.setCard(card);
        cardAction.setCardHistory(cardHistory);
        String message = HttpClientUtils.testUrl("/card/action", cardAction);
        System.out.println(message);
    }

    //充值卡充值
    @Test
    public void testRecharge() {
        CardAction cardAction = new CardAction();
        Card card = new Card();
        CardHistory cardHistory = new CardHistory();

        card.setCardNo("888999");
        //余额
        BigDecimal bigDecimal = new BigDecimal("200.00");
        card.setCardBalance(bigDecimal);
        card.setCarNo("鄂888AZ");
        card.setCompanyId("AAAAAAAA-B2AE-40CE-9FA7-1A409F636EDA");

        //添加历史记录
        //guid
        cardHistory.setGuid("003");
        //充值卡编号
        cardHistory.setCardNo("888999");
        //充值金额
        BigDecimal bigDecimal1 = new BigDecimal("200.00");
        cardHistory.setCardMoney(bigDecimal1);

        //状态为正常（卡状态:0-未激活,1-正常(已激活),2-锁定,3-注销）
        cardHistory.setCardStatus("1");
        //操作状态为充值（操作类型:0-创建,1-充值，2-改变状态）
        cardHistory.setOperatorType("1");
        //车牌号
        cardHistory.setCarNo("鄂888AZ");
        //公司id
        cardHistory.setCompanyId("AAAAAAAA-B2AE-40CE-9FA7-1A409F636EDA");
        //公司名称
        cardHistory.setCompanyName("杭州中恒");
        //所属人id
        cardHistory.setOwnerId("888");
        //所属人姓名
        cardHistory.setOwnerName("陶然");
        //操作人id
        cardHistory.setOperatorId("d45c7258-fe03-4dbe-9c41-a55d53637485");
        //操作人姓名
        cardHistory.setOperatorName("企业用户");
        //操作时间
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateTime = simpleDateFormat.format(date);
        cardHistory.setOperateTime(dateTime);

        cardAction.setCard(card);
        cardAction.setCardHistory(cardHistory);

        String message = HttpClientUtils.testUrl("/card/recharge", cardAction);
        System.out.println(message);
    }

    //更新电卡
    @Test
    public void testUpdate() {
        Card card = new Card();
        card.setGuid("2F4376F2-5133-A250-7F59-784A1EF9457F");
        card.setCardNo("21822498");
//        card.setOwnerName("陶然");
        card.setCarNo("浙A88888");
        String message = HttpClientUtils.testUrl("/card/update", card);
        System.out.println(message);
    }

    //充值记录测试
    @Test
    public void testRechargeRecord() {
        Map<String, Object> map = new HashedMap();
        map.put("cardNo", "0056");
        map.put("dateTime", "2016-11-18");
        map.put("endTime", "2016-11-21");
        String message = HttpClientUtils.testUrl("/card/rechargeRecord", map);
        System.out.println(message);
    }

    //支出记录测试
    @Test
    public void testPayRecord() {
        Map<String, Object> map = new HashedMap();
        map.put("cardNo", "28461122");
        map.put("dateTime", "");
        map.put("endTime", "");
        String message = HttpClientUtils.testUrl("/card/payRecord", map);
        System.out.println(message);
    }

    //变更记录
    @Test
    public void testStatus(){
        Map<String, Object> map = new HashedMap();
        map.put("cardNo", "66668888");
        String message=HttpClientUtils.testUrl("/card/statusRecord",map);
        System.out.println(message);
    }


    //登录
    @Test
    public void testLogin(){
        Map<String, Object> map = new HashedMap();
        map.put("cardNo", "888888");
        map.put("cardPwd","789");
        String message=HttpClientUtils.testUrl("/card/login",map);
        System.out.println(message);
    }

    //注册
    @Test
    public void testRegister(){
        Card card=new Card();
        card.setGuid(HttpClientUtils.getUUID());
        card.setCardNo("888888");
        card.setCardPwd("123");
        card.setCarNo("浙A8888");
        card.setCompanyId("avsdv151321vasd4bvsd22121");
        Date date=new Date();
        SimpleDateFormat df= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateTime=df.format(date);
        card.setCreateTime(dateTime);
        String message=HttpClientUtils.testUrl("/card/register",card);
        System.out.println(message);
    }

    //修改密码
    @Test
    public void testEditPwd(){
        Map<String, Object> map = new HashedMap();
        map.put("cardNo", "888888");
        map.put("cardPwd","789");
        String message=HttpClientUtils.testUrl("/card/editPwd",map);
        System.out.println(message);
    }

}
