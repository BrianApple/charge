package com.hzzh.charge.service;

import com.hzzh.charge.model.po.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

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
    List<Object> stationReport(@Param("dateTime") String dateTime, @Param("companyId") String companyId)throws Exception;
}
