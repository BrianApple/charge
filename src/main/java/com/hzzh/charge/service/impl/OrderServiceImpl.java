package com.hzzh.charge.service.impl;

import com.hzzh.charge.dao.CardDao;
import com.hzzh.charge.dao.CardHistoryDao;
import com.hzzh.charge.dao.OrderDao;
import com.hzzh.charge.model.*;
import com.hzzh.charge.model.order_po.CurrentOrder;
import com.hzzh.charge.model.order_po.CustomOrder;
import com.hzzh.charge.service.OrderService;
import com.hzzh.charge.utils.HttpClientUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
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
    @Autowired
    private CardDao cardDao;
    @Autowired
    private CardHistoryDao cardHistoryDao;


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
        /**
         * 1.判断前端传过来的order对象中的cardNo,
         * stationCode,devCode,port是否为null，
         * 如果为null直接return 0.
         */
        String cardNo = order.getCardNo();
        String stationCode = order.getStationCode();
        String devCode = order.getDevCode();
        String port = order.getPort();
        if (cardNo == null
                || cardNo.equals("")
                || stationCode == null
                || stationCode.equals("")
                || devCode == null
                || devCode.equals("")
                || port == null
                || port.equals("")) {
            System.out.println("-----后台接收参数发生问题!-----");
            return 0;
        }

        Integer addCount = 0;

        try {
            /**
             * 2.通过queryCarNo方法查询出车牌号。
             */
            CustomOrder customOrder = this.queryCarNo(cardNo);
            CustomOrder customOrder1 = new CustomOrder();
            if (customOrder == null) {
                customOrder1.setCarNo("");
            }
            /**
             * 3.通过queryCompanId方法查询出公司id,
             * 如果查询不到公司id直接返回0，不执行添加操作。
             */
            CustomOrder company = this.queryCompany(stationCode);
            if (company == null) {
                System.out.println("-----没找到公司id,不执行添加操作!-----");
                return 0;
            }
            /**
             * 4.通过queryStationName方法查询出场站名称，
             * 如果查询不到直接返回0，不执行添加操作。
             */
            CustomOrder stationName = this.queryStationName(stationCode);
            if (stationName == null) {
                System.out.println("-----没找到场站,不执行添加操作!-----");
                return 0;
            }
            /**
             * 5.通过queryDevName方法查询出设备名称，
             * 如果查询不到直接返回0，不执行添加操作。
             */
            CustomOrder devName = this.queryDevName(devCode, stationCode);
            if (devName == null) {
                System.out.println("-----没找到桩,不执行添加操作!-----");
                return 0;
            }
            /**
             * 6.通过selectItems方法根据前端传来的
             * cardNo，stationCode，devCode，port，
             * 当前状态等于2的条件，查询数据库中是否有已存在的数据，
             * 如果存在返回false,否则返回true.
             */
            boolean result = this.selectItems(order);
            /**
             * 7.判断selectItems方法的返回值是否等于true,
             * 如果为true，那么需要将查询出来的车牌号，公司id，
             * 场站名称以及设备名称添加到order对象中，
             *并且还需要将订单的结束时间设置为(" "),订单的状态设置为"2"。
             */
            if (result) {
                if (customOrder == null) {
                    order.setCarNo(customOrder1.getCarNo());
                } else {
                    order.setCarNo(customOrder.getCarNo());
                }
                order.setCompanyId(company.getCompanyId());
                order.setStationName(stationName.getStationName());
                order.setDevName(devName.getDevName());
                order.setChargeEnd("");//结束时间默认没有
                order.setStatus("2");//状态当前
                /**
                 * 8.执行添加操作，当返回值1时添加成功，否则添加失败。
                 */
                addCount = orderDao.insert(order);
                if (addCount == null || addCount == 0) {
                    System.out.println("----添加失败!----");
                    return 0;
                }
                /**
                 * 9.当添加操作返回1时，
                 * 还需执行specialUpdate方法，
                 * 此方法需要对长时间不能结算的订单进行更新，将状
                 * 态改为3，如果不这么做的话，后面订单不能正常添加。
                 */

                //更新长时间不能结算的订单
                Integer updateCount = this.specialUpdate(cardNo, stationCode, devCode, port);

                if (updateCount == 1) {
                    System.out.println("====更新成功!====");
                } else {
                    System.out.println("====更新失败!====");
                }

                System.out.println("----添加成功!----");
            }
        } catch (Exception e) {
            System.out.println("发生了未知的异常,请排查!");
            e.printStackTrace();
        }
        return addCount;
    }


    /**
     * 更新长时间不结算的订单
     *
     * @param cardNo
     * @param stationCode
     * @param devCode
     * @param port
     * @return
     * @throws Exception
     */
    @Override
    public Integer specialUpdate(
            @Param("cardNo") String cardNo,
            @Param("stationCode") String stationCode,
            @Param("devCode") String devCode,
            @Param("port") String port) throws Exception {
        Integer update = orderDao.specialUpdate(cardNo, stationCode, devCode, port);
        if (update == null || update == 0) {
            return 0;
        }
        return update;
    }

    /**
     * 添加订单前先查询，卡号，station_code,dev_code,结束时间等于""，状态等于2
     *
     * @param order
     * @return
     */
    private boolean selectItems(Order order) {
        OrderExample orderExample = new OrderExample();
        OrderExample.Criteria criteria = orderExample.createCriteria();

        criteria.andcardNoEqualTo(order.getCardNo());
        //根据站编号查询
        criteria.andstationCodeEqualTo(order.getStationCode());
        //根据设备号查询
        criteria.anddevCodeEqualTo(order.getDevCode());
        //根据结束时间查询
        criteria.andchargeEndEqualTo("");
        //根据枪查询
        criteria.andportEqualTo(order.getPort());
        //根据状态等于2查询
        criteria.andstatusEqualTo("2");

        List<Order> result = orderDao.selectByExample(orderExample);
        //如果能查询数据，说明数据已存在，则返回false,如果不存在数据，则返回true.
        for (Order o : result) {
            if (o.getCardNo() != null

                    && !o.getCardNo().equals("")

                    && o.getStationCode() != null

                    && !o.getStationCode().equals("")

                    && o.getDevCode() != null

                    && !o.getDevCode().equals("")

                    && o.getPort() != null

                    && !o.getPort().equals("")) {
                System.out.println("----发现相同的数据,后台不执行添加操作 !----");
                return false;
            }
        }
        return true;
    }


    /**
     * 根据站编号查询公司id
     *
     * @param stationCode
     * @return
     * @throws Exception
     */
    @Override
    public CustomOrder queryCompany(@Param("stationCode") String stationCode) throws Exception {
        CustomOrder companyId = orderDao.queryCompany(stationCode);
        return companyId;
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
    public CustomOrder queryDevName(@Param("devCode") String devCode,
                                    @Param("stationCode") String stationCode) throws Exception {
        CustomOrder find = orderDao.queryDevName(devCode, stationCode);
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
    @Transactional
    public Integer update(Order order) throws Exception {
        /**
         * 1.从order对象中取cardNo，stationCode，devCode，port
         2.设置更新条件：cardNo，stationCode，devCode，结束时间为" "，status设置为2.
         3.设置状态为3,因为更新订单就意味着充电结束，充电结束后订单的状态需要改为3,成为历史订单。
         4.执行更新操作，当结果返回1时更新成功，否则更新失败！
         6.当更新成功后需要执行updateCard方法，去更新card表中的余额。
         */

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
        //根据枪更新
        criteria.andportEqualTo(order.getPort());
        //根据状态等于2进行更新
        criteria.andstatusEqualTo("2");
        //设置状态等于3(历史订单)
        order.setStatus("3");
        Integer update = orderDao.updateByExampleSelective(order, orderExample);

        if (update == null || update == 0) {
            return 0;
        }
        //更新卡余额
        this.updateCard(order);
        return update;
    }

    /**
     * 充电结束时，需要更新card表中的余额
     *
     * @param order
     * @return
     */
    private Integer updateCard(Order order) {
        //条件更新
        CardExample cardExample = new CardExample();
        CardExample.Criteria criteria = cardExample.createCriteria();
        //卡号
        criteria.andcardNoEqualTo(order.getCardNo());
        //车牌号
        criteria.andcarNoEqualTo(order.getCarNo());
        //公司id
        criteria.andcompanyIdEqualTo(order.getCompanyId());
        Card card = new Card();
        //数据类型转换(String to BigDecimal)
        BigDecimal balance = new BigDecimal(order.getBalance());
        card.setCardBalance(balance);
        Integer updateCount = cardDao.updateByExampleSelective(card, cardExample);
        return updateCount;
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