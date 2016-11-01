package com.hzzh.charge.service.impl;

import com.hzzh.charge.dao.AreaDao;
import com.hzzh.charge.model.Area;
import com.hzzh.charge.model.AreaExample;
import com.hzzh.charge.service.AreaService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 类名称：tb_sys_area表的ServiceImpl接口类AreaServiceImpl
 * 内容摘要：扩展ServiceImpl
 *
 * @author TaoRan
 * @version 1.0 2016年10月24日
 */
@Service
@Transactional
public class AreaServiceImpl implements AreaService {

    @Autowired
    private AreaDao areaDao;

    /**
     * 根据编码查询省份
     * 场站管理模块
     *
     * @param code:省份编号
     * @return
     * @throws Exception
     */
    @Override
    public List<Area> queryProvinces(@Param("code") String code) throws Exception {
        //创建查询条件实例
        AreaExample areaExample = new AreaExample();
        AreaExample.Criteria criteria = areaExample.createCriteria();
        //通过code作为查询条件
        criteria.andparentCodeEqualTo(code);
        //返回一个集合
        List<Area> findAll = areaDao.selectByExample(areaExample);
        return findAll;
    }
}