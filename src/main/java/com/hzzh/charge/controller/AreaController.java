package com.hzzh.charge.controller;

import com.hzzh.charge.model.Area;
import com.hzzh.charge.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * 行政区域控制器
 * 场站管理
 * Created by TaoRan on 2016/10/24.
 */
@RestController
@RequestMapping(value = "/area")
public class AreaController {
    @Autowired
    private AreaService areaService;


    /**
     * 根据code查询省，市，县
     *
     * @param map
     * @return list
     * @throws Exception
     */
    @RequestMapping(value = "/queryArea")
    public List<Area> queryProvinces(@RequestBody Map<String, Object> map) throws Exception {
        if (map.get("code") == null) {
            return null;
        }
        String code = map.get("code").toString();
        List<Area> list = areaService.queryProvinces(code);
        return list;
    }


}
