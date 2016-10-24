package com.hzzh.charge.service;

import com.hzzh.charge.model.Card;
import com.hzzh.charge.model.Order;
import com.hzzh.charge.model.order_po.CustomOrder;
import com.hzzh.charge.service.base.BaseOrderService;
import org.apache.ibatis.annotations.Param;

/**
 * 类名称：t_ev_order表的Service接口类OrderService
 * 内容摘要：扩展Service
 *
 * @author TaoRan
 * @version 1.0 2016年10月13日
 */
public interface OrderService {

    /**
     * 添加订单
     *
     * @param order
     * @return
     * @throws Exception
     */
    Integer add(Order order) throws Exception;


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




}