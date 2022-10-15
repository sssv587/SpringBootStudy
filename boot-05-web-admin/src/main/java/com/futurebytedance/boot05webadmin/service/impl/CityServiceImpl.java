package com.futurebytedance.boot05webadmin.service.impl;

import com.futurebytedance.boot05webadmin.bean.City;
import com.futurebytedance.boot05webadmin.mapper.CityMapper;
import com.futurebytedance.boot05webadmin.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/10/14 - 23:49
 * @Description
 */
@Service
public class CityServiceImpl implements CityService {
    @Autowired
    CityMapper cityMapper;

    public City getById(Long id) {
        return cityMapper.getById(id);
    }

    public City saveCity(City city) {
        cityMapper.insert(city);
        return city;
    }
}
