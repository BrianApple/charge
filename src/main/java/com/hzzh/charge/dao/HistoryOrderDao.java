package com.hzzh.charge.dao;

import com.hzzh.charge.model.po.HistoryOrder;
import com.hzzh.charge.model.po.CarReport;
import com.hzzh.charge.model.po.StationPo;
import com.hzzh.charge.model.po.StationReportPo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 历史订单接口
 * Created by TaoRan on 2016/10/8.
 */
public interface HistoryOrderDao {
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
            @Param("endTime") String endTime)
            throws Exception;

    /**
     * 车辆月报表统计
     *
     * @param dateTime
     * @param companyId
     * @return
     * @throws Exception
     */
    List<CarReport> monthlyReport(@Param("dateTime") String dateTime, @Param("companyId") String companyId) throws Exception;

    /**
     * 车辆日报表统计
     *
     * @param dateTime
     * @param companyId
     * @return
     * @throws Exception
     */
    List<CarReport> dailyReport(@Param("dateTime") String dateTime, @Param("companyId") String companyId) throws Exception;

    /**
     * 场站月统计
     *
     * @param dateTime
     * @param companyId
     * @return
     * @throws Exception
     */
    List<StationPo> stationReport(@Param("dateTime") String dateTime, @Param("companyId") String companyId) throws Exception;

}
