package com.hzzh.charge.service;

import com.hzzh.charge.model.Card;
import com.hzzh.charge.model.card_po.QueryPage;
import com.hzzh.charge.model.card_po.QueryPerson;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 类名称：t_ev_card表的Service接口类CardService
 * 内容摘要：扩展Service
 * @author TaoRan
 * @version 1.0 2016年10月19日
 */
public interface CardService  {

    /**
     * 添加卡信息
     * @param card
     * @return
     * @throws Exception
     */
    Integer add(Card card)throws Exception;

    /**
     * 根据companyId查询用户信息
     * @param companyId
     * @return
     * @throws Exception
     */
    List<QueryPerson> queryPerson(@Param("companyId") String companyId)throws Exception;

    /**
     * 分页查询
     *
     * @param cardNo
     * @return
     * @throws Exception
     */
    List<QueryPage> queryPage(@Param("cardNo") String cardNo,@Param("companyId") String companyId) throws Exception;
}