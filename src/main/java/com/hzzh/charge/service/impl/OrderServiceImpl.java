package com.hzzh.charge.service.impl;

import com.hzzh.charge.dao.OrderDao;
import com.hzzh.charge.model.Order;
import com.hzzh.charge.model.OrderExample;
import com.hzzh.charge.model.order_po.CurrentOrder;
import com.hzzh.charge.model.order_po.CustomOrder;
import com.hzzh.charge.service.OrderService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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
        if (cardNo == null
                || cardNo.equals("")
                || stationCode == null
                || stationCode.equals("")
                || devCode == null
                || devCode.equals("")) {
            return 0;
        }

        Integer addCount = 0;
        try {
            //查询车牌号和公司id
            CustomOrder customOrder = this.queryCarNo(cardNo);
            CustomOrder customOrder1 = new CustomOrder();
            if (customOrder == null) {
                customOrder1.setCarNo("");
                customOrder1.setCompanyId("");
            }
            //查询站名称
            CustomOrder stationName = this.queryStationName(stationCode);
            if (stationName.getStationName() == null) {
                stationName.setStationName("");
            }
            //查询设备名称
            CustomOrder devName = this.queryDevName(devCode);
            if (devName.getDevName() == null) {
                devName.setDevName("");
            }

            //添加订单前，先查询卡号，station_code,dev_code是否存在，如果不存在则添加，否则不添加
            boolean result = this.selectItems(order);
            if (result) {
                if (customOrder == null) {
                    order.setCarNo(customOrder1.getCarNo());
                    order.setCompanyId(customOrder1.getCompanyId());
                } else {
                    order.setCarNo(customOrder.getCarNo());
                    order.setCompanyId(customOrder.getCompanyId());
                }
                order.setStationName(stationName.getStationName());
                order.setDevName(devName.getDevName());
                order.setChargeEnd("");//结束时间默认没有
                order.setStatus("2");//状态当前
                addCount = orderDao.insert(order);
                if (addCount == null || addCount == 0) {
                    return 0;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return addCount;
    }

    /**
     * 添加订单前先查询，卡号，station_code,dev_code
     *
     * @param order
     * @return
     */
    private boolean selectItems(Order order) {
        OrderExample orderExample = new OrderExample();
        OrderExample.Criteria criteria = orderExample.createCriteria();
        criteria.andcardNoEqualTo(order.getCardNo());
        criteria.andstationCodeEqualTo(order.getStationCode());
        criteria.anddevCodeEqualTo(order.getDevCode());
        criteria.andchargeEndEqualTo("");
        List<Order> result = orderDao.selectByExample(orderExample);
        //如果能查询数据，说明数据已存在，则返回false,如果不存在数据，则返回true.
        for (Order o : result) {
            if (o.getCardNo() != null
                    && !o.getCardNo().equals("")
                    && o.getStationCode() != null
                    && !o.getStationCode().equals("")
                    && o.getDevCode() != null
                    && !o.getDevCode().equals("")) {
                return false;
            }
        }
        return true;
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

    /**
     * 更新订单
     *
     * @param order
     * @return
     * @throws Exception
     * @Example: cardNo, station_code, dev_code, charge_end
     */
    @Override
    public Integer update(Order order) throws Exception {
        OrderExample orderExample = new OrderExample();
        OrderExample.Criteria criteria = orderExample.createCriteria();
        //根据卡编号更新
        criteria.andcardNoEqualTo(order.getCardNo());
        //根据站编号更新
        criteria.andstationCodeEqualTo(order.getStationCode());
        //根据设备编号更新
        criteria.anddevCodeEqualTo(order.getDevCode());
        //根据结束时间更新
        criteria.andchargeEndEqualTo("");
        order.setStatus("3");
        Integer update = orderDao.updateByExampleSelective(order, orderExample);
        if (update == null || update == 0) {
            return 0;
        }
        return update;
    }

    /**
     * 查询当前订单
     *
     * @param companyId
     * @param cardNo
     * @return
     * @throws Exception
     */
    @Override
    public List<CurrentOrder> currentOrder(@Param("companyId") String companyId, @Param("cardNo") String cardNo) throws Exception {
        List<CurrentOrder> list = orderDao.currentOrder(companyId, cardNo);
        return list;
    }


}