package com.futurebytedance.boot05webadmin.service.impl;

import com.futurebytedance.boot05webadmin.bean.City;
import com.futurebytedance.boot05webadmin.mapper.CityMapper;
import com.futurebytedance.boot05webadmin.service.CityService;
import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
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

    Counter counter;

    public CityServiceImpl(MeterRegistry meterRegistry) {
        counter = meterRegistry.counter("cityService.saveCity.count");
    }

    public City getById(Long id) {
        counter.increment();
        return cityMapper.getById(id);
    }

    public City saveCity(City city) {
        cityMapper.insert(city);
        return city;
    }
}
