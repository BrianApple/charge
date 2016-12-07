package com.hzzh.charge.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hzzh.charge.model.Card;
import com.hzzh.charge.model.card_po.*;
import com.hzzh.charge.service.CardService;
import org.apache.commons.collections.map.HashedMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * 电卡管理控制器
 * 电卡管理模块
 * Created by TaoRan on 2016/10/19.
 */


@RestController
@RequestMapping(value = "/card")
public class CardController {
    //依赖注入
    @Autowired
    private CardService cardService;

    /**
     * 添加电卡
     * cardAction是 Card,cardHistory的包装类
     *
     * @param cardAction
     * @return
     * @throws Exception
     */
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
        System.out.println("火星人在查卡!");
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
     *
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

    /**
     * 更新电卡
     *
     * @param card
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/update")
    public Integer update(@RequestBody Card card) throws Exception {
        Integer update = cardService.update(card);
        return update;
    }


    //    ===============================================电卡详情=======================================================

    /**
     * 电卡充值记录
     *
     * @param map
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/rechargeRecord")
    public Map<String, Object> rechargeRecord(@RequestBody Map<String, Object> map) throws Exception {
        Map<String, Object> result = null;
        if (map.get("cardNo") != null && map.get("dateTime") != null && map.get("endTime")!=null) {
            String cardNo = map.get("cardNo").toString();
            String dateTime = map.get("dateTime").toString();
            String endTime=map.get("endTime").toString();
            result = cardService.rechargeRecord(cardNo, dateTime,endTime);
        }
        return result;
    }

    /**
     * 支出记录
     *
     * @param map
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/payRecord")
    public Map<String, Object> payRecord(@RequestBody Map<String, Object> map) throws Exception {
        Map<String, Object> result = null;
        if (map.get("cardNo") != null && map.get("dateTime") != null && map.get("endTime")!=null) {
            String cardNo = map.get("cardNo").toString();
            String dateTime = map.get("dateTime").toString();
            String endTime=map.get("endTime").toString();
            result = cardService.payRecord(cardNo, dateTime,endTime);
        }
        return result;
    }

    /**
     * 变更记录
     *
     * @param map
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/statusRecord")
    public List<StatusChangeRecord> statusRecord(@RequestBody Map<String, Object> map) throws Exception {
        List<StatusChangeRecord> list = null;
        if (map.get("cardNo") != null) {
            String cardNo = map.get("cardNo").toString();
            list = cardService.statusChangeRecord(cardNo);
        }
        return list;
    }


    //    ===============================================移动端登录===================================================

    /**
     * 查询电卡信息，用于移动端登录
     *
     * @param map
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/login")
    public Card login(@RequestBody Map<String, Object> map) throws Exception {
        Card result = null;
        if (map.get("cardNo") != null && map.get("cardPwd") != null) {
            String cardNo = map.get("cardNo").toString();
            String cardPwd = map.get("cardPwd").toString();
            result = cardService.login(cardNo, cardPwd);
        }
        return result;
    }

    /**
     * 移动端用户注册
     *
     * @param card
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/register")
    public Integer register(@RequestBody Card card) throws Exception {
        Integer register = null;
        if (card != null) {
            register = cardService.register(card);
        }
        return register;
    }

    /**
     * 移动端用户修改密码
     * @param map
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/editPwd")
    public Integer editPwd(@RequestBody Map<String, Object> map) throws Exception {
        Integer count = null;
        if (map.get("cardNo") != null && map.get("cardPwd") != null) {
            String cardNo = map.get("cardNo").toString();
            String cardPwd = map.get("cardPwd").toString();
            count = cardService.editPwd(cardNo, cardPwd);
        }
        return count;
    }

}