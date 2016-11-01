package com.hzzh.charge.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hzzh.charge.model.report_po.HistoryOrder;
import com.hzzh.charge.model.report_po.TotalReport;
import com.hzzh.charge.service.HistoryOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * 历史订单管理控制器
 * 订单管理模块
 * Created by TaoRan on 2016/10/8.
 */


@RestController
@RequestMapping(value = "/charge")
public class HistoryOrderController {
    @Autowired
    private HistoryOrderService historyOrderService;


    /**
     * 历史订单分页查询
     *
     * @param
     * @param
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/queryPage")
    public PageInfo queryPage(@RequestBody Map<String, Object> map) throws Exception {

        /**
         * pageNum：当前页数
         * 查询条件
         * pageSize：每页显示的条数
         * startTime：开始时间
         * endTime：结束时间
         * cardNo：车牌号，场站编号
         * stationName：场站名称
         * companyId：公司id
         */

        //判断参数是否等于null,如果其中有一个参数等于null,整个结果将返回null。
        if (map.get("pageNum") == null || map.get("pageSize") == null || map.get("startTime") == null ||
                map.get("endTime") == null || map.get("cardNo") == null || map.get("stationName") == null
                || map.get("companyId") == null) {
            return null;
        }
        Integer pageNum = Integer.parseInt(map.get("pageNum").toString());
        Integer pageSize = Integer.parseInt(map.get("pageSize").toString());
        String startTime = map.get("startTime").toString();
        String endTime = map.get("endTime").toString();
        String cardNo = map.get("cardNo").toString();
        String stationName = map.get("stationName").toString();
        String companyId = map.get("companyId").toString();
        PageHelper.startPage(pageNum, pageSize);
        List<HistoryOrder> list = historyOrderService.queryPage(cardNo, companyId, stationName, startTime, endTime);
        return new PageInfo(list);
    }




    //=========================================统计报表==================================================================

    /**
     *
     * 车辆月报表统计
     *
     * @param map
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/monthlyReport")

    /**
     * 参数：dateTime，时间查询，companyId.公司id
     */
    public List<TotalReport> monthlyReport(@RequestBody Map<String, Object> map) throws Exception {
        if (map.get("dateTime") == null || map.get("companyId") == null) {
            return null;
        }
        String dateTime = map.get("dateTime").toString();
        String companyId = map.get("companyId").toString();

        List<TotalReport> list = historyOrderService.monthlyReport(dateTime, companyId);
        return list;

    }

    /**
     * 车辆日报表统计
     *
     * @param map
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/dailyReport")
    public List<TotalReport> dailyReport(@RequestBody Map<String, Object> map) throws Exception {

        if (map.get("dateTime") == null || map.get("companyId") == null) {
            return null;
        }

        String companyId = map.get("companyId").toString();
        String dateTime = map.get("dateTime").toString();

        List<TotalReport> list = historyOrderService.dailyReport(dateTime, companyId);
        return list;
    }

    /**
     * 场站月统计报表
     *
     * @param map
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/stationReport")
    public Map<String, Object> stationReport(@RequestBody Map<String, Object> map) throws Exception {

        if (map.get("dateTime") == null || map.get("companyId") == null) {
            return null;
        }

        String dateTime = map.get("dateTime").toString();
        String companyId = map.get("companyId").toString();
        Map<String, Object> list = historyOrderService.stationReport(dateTime, companyId);
        return list;
    }

    /**
     * 查询当月接入充电桩次数
     * @param map
     * @return
     * @throws Exception
     */
//    @RequestMapping(value = "/poleCount")
//    public MonthlyPoles queryPole(@RequestBody Map<String, Object> map) throws Exception {
//        if (map.get("companyId") == null) {
//            return null;
//        }
//        String companyId = map.get("companyId").toString();
//        MonthlyPoles queryPole = historyOrderService.queryChargePoles(companyId);
//        return queryPole;
//    }


}
