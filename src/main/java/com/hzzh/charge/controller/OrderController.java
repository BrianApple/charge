package com.hzzh.charge.controller;

import com.hzzh.charge.model.Order;
import com.hzzh.charge.model.order_po.CurrentOrder;
import com.hzzh.charge.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * 订单管理控制器
 * 订单管理模块
 * Created by TaoRan on 2016/10/24.
 */

@RestController
@RequestMapping(value = "/order")
public class OrderController {
    @Autowired
    private OrderService orderService;


    /**
     * 添加订单
     *
     * @param order
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/add")
    public Integer save(@RequestBody Order order) throws Exception {
        System.out.println("----后台接收到请求!----");
        if (order == null) {
            return 0;
        }
        Integer addCount = orderService.add(order);
        return addCount;
    }

    /**
     * 更新订单
     *
     * @param order
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/update")
    public Integer update(@RequestBody Order order) throws Exception {
        if (order == null) {
            return null;
        }
        Integer update = orderService.update(order);
        return update;
    }

    /**
     * 查询当前订单
     * @param map
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/currentOrder")
    public List<CurrentOrder> queryOrder(@RequestBody Map<String, Object> map) throws Exception {
        if (map.get("companyId") == null || map.get("cardNo") == null) {
            return null;
        }
        String companyId = map.get("companyId").toString();
        String cardNo = map.get("cardNo").toString();
        List<CurrentOrder> list = orderService.currentOrder(companyId, cardNo);
        return list;
    }
}
