package com.hzzh.charge.controller;

import com.hzzh.charge.model.Area;
import com.hzzh.charge.service.AreaService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Map;

/**
 * Created by lilaifeng on 2016/9/22.
 */
@RestController
@RequestMapping("/area")
public class AreaController {
    @Autowired
    private AreaService areaService;

    @RequestMapping(value = "/getByParentCode",method=RequestMethod.POST)
    @ResponseBody
    public List<Area> getAreasByParentCode(@RequestBody Map<String,Object> parms) throws Exception {
        return areaService.getAreasByParentCode(parms.get("parentCode").toString());
    }
}
