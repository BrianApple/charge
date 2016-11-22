package com.hzzh.charge.dao;

import com.hzzh.charge.dao.base.BaseCardDao;
import com.hzzh.charge.model.Card;
import com.hzzh.charge.model.card_po.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 类名称：t_ev_card表的DAO接口类CardDao
 * 内容摘要：自行追加的数据库操作方法
 *
 * @author TaoRan
 * @version 1.0 2016年10月19日
 */
public interface CardDao extends BaseCardDao {

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
    List<QueryPage> queryPage(@Param("cardNo") String cardNo,@Param("companyId") String companyId) throws Exception;

    /**
     * 更新电卡
     * @param card
     * @return
     * @throws Exception
     */
    Integer update(Card card)throws Exception;


//    ===============================================电卡详情===========================================================

    /**
     * 电卡充值记录
     * @param cardNo
     * @param dateTime
     * @return
     * @throws Exception
     */
    List<RechargeRecord> rechargeRecord(@Param("cardNo")String cardNo,
                                        @Param("dateTime")String dateTime,
                                        @Param("endTime")String endTime)throws Exception;

    /**
     * 电卡支出记录
     * @param cardNo
     * @param dateTime
     * @return
     * @throws Exception
     */
    List<PayRecord> payRecord(@Param("cardNo")String cardNo,
                              @Param("dateTime")String dateTime,
                              @Param("endTime")String endTime)throws Exception;


    /**
     * 电卡变更记录
     * @param cardNo
     * @return
     * @throws Exception
     */
    List<StatusChangeRecord> statusChangeRecord(@Param("cardNo")String cardNo)throws Exception;






//    ===============================================移动端登录=========================================================

    /**
     * 查询电卡信息，用于移动端登录
     * @param cardNo
     * @param cardPwd
     * @return
     * @throws Exception
     */
    Card login(@Param("cardNo")String cardNo,@Param("cardPwd")String cardPwd)throws Exception;

    /**
     * 移动端用户修改密码
     * @param cardNo
     * @param cardPwd
     * @return
     * @throws Exception
     */
    Integer editPwd(@Param("cardNo")String cardNo,@Param("cardPwd")String cardPwd)throws Exception;



}