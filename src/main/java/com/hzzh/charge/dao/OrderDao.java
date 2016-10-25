package com.hzzh.charge.dao;

import com.hzzh.charge.dao.base.BaseOrderDao;
import com.hzzh.charge.model.order_po.CurrentOrder;
import com.hzzh.charge.model.order_po.CustomOrder;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 类名称：t_ev_order表的DAO接口类OrderDao
 * 内容摘要：自行追加的数据库操作方法
 *
 * @author TaoRan
 * @version 1.0 2016年10月13日
 */
public interface OrderDao extends BaseOrderDao {

    /**
     * 根据卡号查询车牌号
     * @param cardNo
     * @return
     * @throws Exception
     */
    CustomOrder queryCarNo(@Param("cardNo") String cardNo) throws Exception;

    /**
     * 根据站编号查询站名称
     * @param stationCode
     * @return
     * @throws Exception
     */
    CustomOrder queryStationName(@Param("stationCode") String stationCode) throws Exception;

    /**
     * 根据设备编号查询设备名称
     * @param devCode
     * @return
     * @throws Exception
     */
    CustomOrder queryDevName(@Param("devCode") String devCode) throws Exception;

    /**
     * 查询当前订单
     * @param companyId
     * @param cardNo
     * @return
     * @throws Exception
     */
    List<CurrentOrder> currentOrder(@Param("companyId") String companyId,@Param("cardNo") String cardNo)throws Exception;

}