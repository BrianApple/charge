package com.hzzh.charge.service;

import com.hzzh.charge.model.Card;
import com.hzzh.charge.model.card_po.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 类名称：t_ev_card表的Service接口类CardService
 * 内容摘要：扩展Service
 *
 * @author TaoRan
 * @version 1.0 2016年10月19日
 */
public interface CardService {

    /**
     * 添加卡信息
     *CardAction为card,cardHistory的包装类
     * @param cardAction
     * @return
     * @throws Exception
     */
    Integer add(CardAction cardAction) throws Exception;

    /**
     * 根据companyId查询用户信息
     *
     * @param companyId
     * @return
     * @throws Exception
     */
    List<QueryPerson> queryPerson(@Param("companyId") String companyId) throws Exception;

    /**
     * 分页查询
     *
     * @param cardNo
     * @return
     * @throws Exception
     */
    List<QueryPage> queryPage(@Param("cardNo") String cardNo, @Param("companyId") String companyId) throws Exception;

    /**
     * 充值卡,锁定,注销
     *
     * @param cardAction
     * @return
     * @throws Exception
     */

    Integer action(CardAction cardAction) throws Exception;

    /**
     * 充值卡充值
     * @param cardAction
     * @return
     * @throws Exception
     */
    Integer recharge(CardAction cardAction)throws Exception;

    /**
     * 更新卡
     * @param card
     * @return
     * @throws Exception
     */
    Integer update (Card card)throws Exception;


    //    ===============================================电卡详情=======================================================

    /**
     * 电卡充值记录
     * @param cardNo
     * @param dateTime
     * @return
     * @throws Exception
     */
    Map<String,Object> rechargeRecord(@Param("cardNo")String cardNo,
                                      @Param("dateTime")String dateTime,
                                      @Param("endTime")String endTime)throws Exception;


    /**
     * 电卡支出记录
     * @param cardNo
     * @param dateTime
     * @return
     * @throws Exception
     */
    Map<String,Object> payRecord(@Param("cardNo")String cardNo,
                                 @Param("dateTime")String dateTime,
                                 @Param("endTime")String endTime)throws Exception;


    /**
     * 电卡变更记录
     * @param cardNo
     * @return
     * @throws Exception
     */
    List<StatusChangeRecord> statusChangeRecord(@Param("cardNo")String cardNo)throws Exception;






    //    ===============================================移动端登录=============================================

    /**
     * 查询电卡信息，用于移动端登录
     * @param cardNo
     * @param cardPwd
     * @return
     * @throws Exception
     */
    Card login(@Param("cardNo")String cardNo,@Param("cardPwd")String cardPwd)throws Exception;




//    ==================================================用户注册=================================================

    /**
     * 移动端用户注册
     * @param card
     * @return
     * @throws Exception
     */
    Integer register(Card card)throws Exception;


//    ==================================================用户修改密码=================================================
    /**
     * 移动端用户修改密码
     * @param cardNo
     * @param cardPwd
     * @return
     * @throws Exception
     */
    Integer editPwd(@Param("cardNo")String cardNo,@Param("cardPwd")String cardPwd)throws Exception;



}