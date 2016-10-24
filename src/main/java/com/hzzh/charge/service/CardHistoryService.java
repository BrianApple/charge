package com.hzzh.charge.service;

import com.hzzh.charge.model.cardhistory_po.RechargeDetail;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 类名称：t_ev_card_history表的Service接口类CardHistoryService
 * 内容摘要：扩展Service
 * @author TaoRan
 * @version 1.0 2016年10月20日
 */
public interface CardHistoryService  {

    /**
     * 充值卡明细
     * @param companyId
     * @param operateTime
     * @return
     * @throws Exception
     */
    Map<String, Object> rechargeDetail(@Param("companyId") String companyId, @Param("operateTime") String operateTime)throws Exception;

}