package com.futurebytedance.boot05webadmin.mapper;

import com.futurebytedance.boot05webadmin.bean.City;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/10/14 - 23:47
 * @Description
 */
//@Mapper
public interface CityMapper {
    @Select("select * from city where id=#{id}")
    City getById(Long id);

    @Insert("insert into city(`name`,`state`,`country`) values(#{name},#{state},#{country})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void insert(City city);
}
