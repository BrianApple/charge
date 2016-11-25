package com.hzzh.charge.service;

import com.hzzh.charge.model.Order;
import com.hzzh.charge.model.order_po.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

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
     * 根据站编号查询公司id
     *
     * @param stationCode
     * @return
     * @throws Exception
     */
    CustomOrder queryCompany(@Param("stationCode") String stationCode) throws Exception;

    /**
     * 根据卡号查询车牌号
     *
     * @param cardNo
     * @return
     * @throws Exception
     */
    CustomOrder queryCarNo(@Param("cardNo") String cardNo) throws Exception;

    /**
     * 根据站编号查询站名称
     *
     * @param stationCode
     * @return
     * @throws Exception
     */
    CustomOrder queryStationName(@Param("stationCode") String stationCode) throws Exception;

    /**
     * 根据设备编号查询设备名称
     *
     * @param devCode
     * @return
     * @throws Exception
     */
    CustomOrder queryDevName(@Param("devCode") String devCode, @Param("stationCode") String stationCode) throws Exception;

//    /**
//     * 更新订单
//     *
//     * @param order
//     * @return
//     * @throws Exception
//     */
//    Integer update(Order order) throws Exception;


    /**
     * 查询当前订单
     *
     * @param companyId
     * @param cardNo
     * @return
     * @throws Exception
     */
    List<CurrentOrder> currentOrder(@Param("companyId") String companyId, @Param("cardNo") String cardNo) throws Exception;

    /**
     * 更新当前订单
     * @param order
     * @return
     * @throws Exception
     */
    Integer updateCurrentOrder(Order order)throws Exception;



    /**
     *查询数据是否存在(数据重传)
     * @param order
     * @return
     * @throws Exception
     */
    Order queryRepeat(Order order)throws Exception;




    /**
     * 更新长时间不结算的订单
     *
     * @param
     * @param stationCode
     * @param devCode
     * @param port
     * @return
     * @throws Exception
     */
    Integer specialUpdate(
            @Param("stationCode") String stationCode,
            @Param("cardNo") String cardNo,
            @Param("devCode") String devCode,
            @Param("port") String port) throws Exception;


    Integer beforeUpdate(@Param("cardNo") String cardNo,
                         @Param("stationCode") String stationCode,
                         @Param("devCode") String devCode,
                         @Param("port") String port) throws Exception;

    /**
     * 根据条件查询所有数据用于车辆日充电详细报表导出
     * @param cardNo
     * @param companyId
     * @param stationName
     * @param startTime
     * @param endTime
     * @return
     */
    List<ExportOrder> exportOrder(@Param("cardNo") String cardNo,
                                  @Param("companyId") String companyId,
                                  @Param("stationName") String stationName,
                                  @Param("startTime") String startTime,
                                  @Param("endTime") String endTime)throws Exception;


    /**
     * 更新order表中没有车牌号的车辆
     * @param carNo
     * @param cardNo
     * @return
     * @throws Exception
     */
    Integer updateCarNo(@Param("carNo")String carNo,@Param("cardNo")String cardNo)throws Exception;

    /**
     * 图表(车辆月充电统计)
     * 查询指定月份的尖，峰，平，谷,的电量
     * @param companyId
     * @param cardNo
     * @param dateTime
     * @return
     * @throws Exception
     */
    List<CarMonthlyChart> QueryMonthlyData(@Param("companyId")String companyId,
                                           @Param("cardNo")String cardNo,
                                           @Param("dateTime")String dateTime)throws Exception;

    /**
     * 图表(场站月电量统计)
     * 查询指定月份每一天的尖，峰，平，谷的电量
     * @param companyId
     * @param stationName
     * @param dateTime
     * @return
     * @throws Exception
     */
    List<StationMonthlyChart> stationMonthlyChart(@Param("companyId")String companyId,
                                                  @Param("stationName")String stationName,
                                                  @Param("dateTime")String dateTime)throws Exception;

}