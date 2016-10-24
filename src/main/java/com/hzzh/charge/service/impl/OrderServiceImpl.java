package com.hzzh.charge.service.impl;

import com.hzzh.charge.dao.CardDao;
import com.hzzh.charge.dao.OrderDao;
import com.hzzh.charge.model.Card;
import com.hzzh.charge.model.CardExample;
import com.hzzh.charge.model.Order;
import com.hzzh.charge.model.order_po.CustomOrder;
import com.hzzh.charge.service.OrderService;
import org.apache.commons.collections.map.HashedMap;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;

/**
 * 类名称：t_ev_order表的ServiceImpl接口类OrderServiceImpl
 * 内容摘要：扩展ServiceImpl
 *
 * @author TaoRan
 * @version 1.0 2016年10月13日
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderDao orderDao;
    @Autowired
    private CardDao cardDao;

    /**
     * 添加订单
     *
     * @param order
     * @return
     * @throws Exception
     */
    @Override
    @Transactional
    public Integer add(Order order) throws Exception {
        String cardNo = order.getCardNo();
        String stationCode = order.getStationCode();
        String devCode = order.getDevCode();
        if (cardNo == null || cardNo.equals("") || stationCode == null || stationCode.equals("") || devCode == null || devCode.equals("")) {
            return 0;
        }
        //查询车牌号和公司id
        CustomOrder customOrder = this.queryCarNo(cardNo);
        //查询站名称
        CustomOrder stationName = this.queryStationName(stationCode);
        //查询设备名称
        CustomOrder devName = this.queryDevName(devCode);

        order.setCarNo(customOrder.getCarNo());
        order.setCompanyId(customOrder.getCompanyId());
        order.setStationName(stationName.getStationName());
        order.setDevName(devName.getDevName());
        order.setChargeEnd("");//结束时间默认没有
        order.setStatus("2");//状态当前
        Integer addCount = orderDao.insert(order);
        if (addCount == null || addCount == 0) {
            return 0;
        }
        return addCount;
    }

    /**
     * 根据卡号查询车牌号
     *
     * @param cardNo
     * @return
     * @throws Exception
     */
    @Override
    public CustomOrder queryCarNo(@Param("cardNo") String cardNo) throws Exception {
        CustomOrder find = orderDao.queryCarNo(cardNo);
        return find;
    }

    /**
     * 根据站编号查询站名称
     *
     * @param stationCode
     * @return
     * @throws Exception
     */
    @Override
    public CustomOrder queryStationName(@Param("stationCode") String stationCode) throws Exception {
        CustomOrder find = orderDao.queryStationName(stationCode);
        return find;
    }

    /**
     * 根据设备编号查询设备名称
     *
     * @param devCode
     * @return
     * @throws Exception
     */
    @Override
    public CustomOrder queryDevName(@Param("devCode") String devCode) throws Exception {
        CustomOrder find = orderDao.queryDevName(devCode);
        return find;
    }


}