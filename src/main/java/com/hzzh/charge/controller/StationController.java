package com.hzzh.charge.controller;

import com.hzzh.charge.model.Station;
import com.hzzh.charge.service.StationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 场站控制器
 * Created by TaoRan on 2016/10/26.
 */
@RestController
@RequestMapping(value = "/station")
public class StationController {
    @Autowired
    private StationService stationService;

    @RequestMapping(value = "/findAll")
    public List<Station> findAll() throws Exception {
        List<Station> find = stationService.queryStation();
        return find;
    }
}
