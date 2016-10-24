package com.hzzh.charge.service;

import com.hzzh.charge.model.report_po.HistoryOrder;
import com.hzzh.charge.model.report_po.MonthlyPoles;
import com.hzzh.charge.model.report_po.TotalReport;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 *
 * 内容摘要：扩展Service
 * @author TaoRan
 * @version 1.0 2016年10月08日
 */
public interface HistoryOrderService {
    /**
     * 历史订单分页查询
     *
     * @return
     * @throws Exception
     */
    List<HistoryOrder> queryPage(
            @Param("cardNo") String cardNo,
            @Param("companyId") String companyId,
            @Param("stationName") String stationName,
            @Param("startTime") String startTime,
            @Param("endTime") String endTime) throws Exception;


    /**
     * 车辆月报表统计
     * @param dateTime
     * @param companyId
     * @return
     * @throws Exception
     */
    List<TotalReport> monthlyReport(String dateTime, String companyId) throws Exception;

    /**
     * 车辆日报表统计
     * @param dateTime
     * @param companyId
     * @return
     * @throws Exception
     */
    List<TotalReport> dailyReport(@Param("dateTime") String dateTime, @Param("companyId") String companyId) throws Exception;

    /**
     * 场站月统计
     * @param dateTime
     * @param companyId
     * @return
     * @throws Exception
     */
    Map<String,Object> stationReport(@Param("dateTime") String dateTime, @Param("companyId") String companyId)throws Exception;

    /**
     * 查询当月总共接入了多少充电桩
     * @param companyId
     * @return
     * @throws Exception
     */
    MonthlyPoles queryChargePoles(@Param("companyId") String companyId) throws Exception;
}
