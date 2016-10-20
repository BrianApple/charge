package com.hzzh.charge.dao;

import com.hzzh.charge.dao.base.BaseCardDao;
import com.hzzh.charge.model.card_po.QueryPage;
import com.hzzh.charge.model.card_po.QueryPerson;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 类名称：t_ev_card表的DAO接口类CardDao
 * 内容摘要：自行追加的数据库操作方法
 *
 * @author TaoRan
 * @version 1.0 2016年10月19日
 */
public interface CardDao extends BaseCardDao {

    /**
     * 根据companyId查询用户信息
     *
     * @param companyId
     * @return
     * @throws Exception
     */
    List<QueryPerson> queryPerson(@Param("companyId") String companyId) throws Exception;

    /**
     * 分页查询
     *
     * @param cardNo
     * @return
     * @throws Exception
     */
    List<QueryPage> queryPage(@Param("cardNo") String cardNo,@Param("companyId") String companyId) throws Exception;

}