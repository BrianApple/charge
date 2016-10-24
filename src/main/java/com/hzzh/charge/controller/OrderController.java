package com.hzzh.charge.controller;
import com.hzzh.charge.model.Order;
import com.hzzh.charge.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 订单控制器
 * Created by TaoRan on 2016/10/24.
 */
@RestController
@RequestMapping(value = "/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "/add")
    public Integer save(@RequestBody Order order) throws Exception {
        Integer addCount=orderService.add(order);
        return addCount;
    }
}
