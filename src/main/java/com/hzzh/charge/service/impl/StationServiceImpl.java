package com.hzzh.charge.service.impl;

import com.hzzh.charge.dao.StationDao;
import com.hzzh.charge.model.Station;
import com.hzzh.charge.model.StationExample;
import com.hzzh.charge.service.StationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 类名称：tb_base_station表的ServiceImpl接口类StationServiceImpl
 * 内容摘要：扩展ServiceImpl
 *
 * @author TaoRan
 * @version 1.0 2016年10月26日
 */
@Service
public class StationServiceImpl implements StationService {

    @Autowired
    private StationDao stationDao;

    /**
     * 查询所有站
     *
     * @return
     * @throws Exception
     */
    @Override
    public List<Station> queryStation() throws Exception {
        StationExample stationExample = new StationExample();
        List<Station> findAll = stationDao.selectByExample(stationExample);
        return findAll;
    }
}