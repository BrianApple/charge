package com.hzzh.charge.controller;

import com.hzzh.charge.model.Station;
import com.hzzh.charge.model.station_po.StationInfo;
import com.hzzh.charge.service.DeviceService;
import com.hzzh.charge.service.StationService;
import com.hzzh.charge.service.TagIndexService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

/**
 * Created by lilaifeng on 2016/9/22.
 */
@RestController
@RequestMapping("/station")
public class StationController {
    @Autowired
    private StationService stationService;
    @Autowired
    private DeviceService deviceService;
    @Autowired
    private TagIndexService tagIndexService;

    @RequestMapping(value = "/getByCompanyID", method = RequestMethod.POST)
    @ResponseBody
    public List<Station> getStationsByCompanyID(@RequestBody Map<String, Object> parms) throws Exception {
        return stationService.getStationsByCompanyID(parms.get("companyId").toString());
    }

    @RequestMapping(value = "/getByType", method = RequestMethod.POST)
    @ResponseBody
    public List<Station> getStationsByType(@RequestBody Map<String, Object> parms) throws Exception {
        return stationService.getStationsByType(parms.get("stationType").toString());
    }

    @RequestMapping(value = "/getByCompanyAndType", method = RequestMethod.POST)
    @ResponseBody
    public List<Station> getStationsByCompanyAndType(@RequestBody Map<String, Object> parms) throws Exception {
        return stationService.getStationsByCompanyAndType(parms.get("companyId").toString(), parms.get("stationType").toString());
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public int getStationsByCompanyID(@RequestBody Station station) throws Exception {
        return stationService.addStation(station);
    }

    @RequestMapping(value = "/getMaxCodeByCompanyID", method = RequestMethod.POST)
    @ResponseBody
    public Station getMaxCodeByCompanyID(@RequestBody Map<String, Object> parms) throws Exception {
        return stationService.getMaxCodeByCompanyID(parms.get("companyId").toString());
    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    @ResponseBody
    public int editStation(@RequestBody Station station) throws Exception {
        deviceService.editStationName(station.getCode(), station.getName());
        tagIndexService.editStationName(station.getCode(), station.getName());
        return stationService.editStation(station);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public void deleteStation(@RequestBody Map<String, Object> parms) throws Exception {
        String code = parms.get("code").toString();
        deviceService.deleteByStationCode(code);
        tagIndexService.deleteByStationCode(code);
        stationService.deleteStation(code);
    }

    /**
     * 查询场站信息
     * @param map
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/queryStations", method = RequestMethod.POST)
    public List<StationInfo> queryStation(@RequestBody Map<String, Object> map) throws Exception {
        List<StationInfo> list = null;
        if (map.get("companyId") != null && map.get("name") != null) {
            String companyId = map.get("companyId").toString();
            String name = map.get("name").toString();
            list = stationService.queryStations(companyId, name);
        }
        return list;
    }

    /**
     *通过companyId，stationName，查询场站信息
     * @param map
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/queryStationInfo")
    public Station queryStationInfo(@RequestBody Map<String,Object> map) throws Exception {
        Station result=null;
        if (map.get("companyId") != null && map.get("name") != null && !map.get("name").equals("")) {
            String companyId = map.get("companyId").toString();
            String name = map.get("name").toString();
            result=stationService.queryStationInfo(companyId,name);
        }
        return result;
    }


}
