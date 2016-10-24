package com.hzzh.charge.controller;

import com.hzzh.charge.model.cardhistory_po.RechargeDetail;
import com.hzzh.charge.service.CardHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * 充值卡历史记录控制器
 * Created by TaoRan on 2016/10/21.
 */
@RestController
@RequestMapping(value = "/card")
public class CardHistoryController {
    @Autowired
    private CardHistoryService cardHistoryService;

    /**
     * 充值卡明细
     * @param map
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/rechargeDetail")
    public Map<String, Object> rechargeDetail(@RequestBody Map<String, Object> map) throws Exception {
        if (map.get("companyId") == null || map.get("operateTime") == null) {
            return null;
        }
        String companyId = map.get("companyId").toString();
        String operateTime = map.get("operateTime").toString();
        Map<String, Object> maps = cardHistoryService.rechargeDetail(companyId, operateTime);
        return maps;
    }
}
