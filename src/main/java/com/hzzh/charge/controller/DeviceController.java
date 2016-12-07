package com.hzzh.charge.controller;

import com.hzzh.charge.model.Device;
import com.hzzh.charge.service.DeviceService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Map;

/**
 * Created by lilaifeng on 2016/9/22.
 */
@RestController
@RequestMapping("/device")
public class DeviceController {
    @Autowired
    private DeviceService deviceService;

    @RequestMapping(value = "/getByTypeCode",method=RequestMethod.POST)
    @ResponseBody
    public List<Device> getDevicesByTypeCode(@RequestBody Map<String,Object> parms) throws Exception {
        return deviceService.getDevicesByTypeCode(parms.get("typeCode").toString());
    }
    @RequestMapping(value = "/getByCompanyID",method=RequestMethod.POST)
    @ResponseBody
    public List<Device> getDevicesByCompanyID(@RequestBody Map<String,Object> parms) throws Exception {
        return deviceService.getDevicesByCompanyID(parms.get("companyId").toString());
    }
    @RequestMapping(value = "/getByStationCode",method=RequestMethod.POST)
    @ResponseBody
    public List<Device> getDevicesByStationCode(@RequestBody Map<String,Object> parms) throws Exception {
        return deviceService.getDevicesByStationCode(parms.get("stationCode").toString());
    }
    @RequestMapping(value = "/deleteByStationCode",method=RequestMethod.POST)
    @ResponseBody
    public int deleteByStationCode(@RequestBody Map<String,Object> parms) throws Exception {
        return deviceService.deleteByStationCode(parms.get("stationCode").toString());
    }
    @RequestMapping(value = "/getPoleMaxSerialNum",method=RequestMethod.POST)
    @ResponseBody
    public Device getPoleMaxSerialNum(@RequestBody Map<String,Object> parms) throws Exception {
        return deviceService.getPoleMaxSerialNum(parms.get("modelCode").toString());
    }
    @RequestMapping(value = "/getPoleMaxCode",method=RequestMethod.POST)
    @ResponseBody
    public Device getPoleMaxCode(@RequestBody Map<String,Object> parms) throws Exception {
        return deviceService.getPoleMaxCode(parms.get("stationCode").toString());
    }
    @RequestMapping(value = "/addPole",method=RequestMethod.POST)
    @ResponseBody
    public int addPole(@RequestBody Device pole) throws Exception {
        return deviceService.addPole(pole);
    }
    @RequestMapping(value = "/delete",method=RequestMethod.POST)
    @ResponseBody
    public int delete(@RequestBody Map<String,Object> parms) throws Exception {
        return deviceService.delete(parms.get("guid").toString());
    }
}
