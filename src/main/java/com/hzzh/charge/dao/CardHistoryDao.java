package com.hzzh.charge.dao;

import com.hzzh.charge.dao.base.BaseCardHistoryDao;
import com.hzzh.charge.model.cardhistory_po.RechargeDetail;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 类名称：t_ev_card_history表的DAO接口类CardHistoryDao
 * 内容摘要：自行追加的数据库操作方法
 * @author TaoRan
 * @version 1.0 2016年10月20日
 */
public interface CardHistoryDao extends BaseCardHistoryDao {

    /**
     * 充值卡明细
     * @param companyId
     * @param operateTime
     * @return
     * @throws Exception
     */
    List<RechargeDetail> rechargeDetail(@Param("companyId") String companyId,@Param("operateTime") String operateTime)throws Exception;
}