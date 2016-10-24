package com.hzzh.charge.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hzzh.charge.exception.MyException;
import com.hzzh.charge.model.Card;
import com.hzzh.charge.model.card_po.CardAction;
import com.hzzh.charge.model.card_po.QueryPage;
import com.hzzh.charge.model.card_po.QueryPerson;
import com.hzzh.charge.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * 卡管理控制器
 * Created by TaoRan on 2016/10/19.
 */
@RestController
@RequestMapping(value = "/card")
public class CardController {
    //依赖注入
    @Autowired
    private CardService cardService;

    @RequestMapping(value = "/add")
    public Integer add(@RequestBody CardAction cardAction) throws Exception {
        if (cardAction == null) {
            return null;
        }
        Integer add = cardService.add(cardAction);
        return add;
    }

    /**
     * 根据companyId查询用户信息
     *
     * @param map
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/queryPerson")
    public List<QueryPerson> queryPerson(@RequestBody Map<String, Object> map) throws Exception {
        if (map.get("companyId") == null) {
            return null;
        }
        String companyId = map.get("companyId").toString();
        List<QueryPerson> list = cardService.queryPerson(companyId);
        return list;
    }

    /**
     * 分页查询
     *
     * @param map
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/queryPage")
    public PageInfo queryPage(@RequestBody Map<String, Object> map) throws Exception {
        if (map.get("pageNum") == null || map.get("pageSize") == null || map.get("cardNo") == null || map.get("companyId") == null) {
            return null;
        }
        Integer pageNum = Integer.parseInt(map.get("pageNum").toString());
        Integer pageSize = Integer.parseInt(map.get("pageSize").toString());
        String cardNo = map.get("cardNo").toString();
        String companyId = map.get("companyId").toString();
        PageHelper.startPage(pageNum, pageSize);
        List<QueryPage> list = cardService.queryPage(cardNo, companyId);
        return new PageInfo(list);
    }

    /**
     * 充值卡,锁定,注销
     *
     * @param cardAction
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/action")
    public Integer action(@RequestBody CardAction cardAction) throws Exception {
        if (cardAction == null) {
            return null;
        }
        Integer action = cardService.action(cardAction);
        return action;
    }

    /**
     * 充值卡充值
     * @param cardAction
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/recharge")
    public Integer recharge(@RequestBody CardAction cardAction) throws Exception {
        if (cardAction == null) {
            return null;
        }
        Integer addCount = cardService.recharge(cardAction);
        return addCount;
    }

}