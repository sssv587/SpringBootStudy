package com.futurebytedance.boot05webadmin.service;

import com.futurebytedance.boot05webadmin.bean.City;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/10/15 - 20:30
 * @Description
 */
public interface CityService {
    City getById(Long id);

    City saveCity(City city);
}
