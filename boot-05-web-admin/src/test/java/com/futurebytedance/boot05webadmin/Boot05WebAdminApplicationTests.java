package com.futurebytedance.boot05webadmin;

import com.futurebytedance.boot05webadmin.bean.User;
import com.futurebytedance.boot05webadmin.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Slf4j
@SpringBootTest
class Boot05WebAdminApplicationTests {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    DataSource dataSource;

    @Autowired
    UserMapper userMapper;

    @Test
    void contextLoads() {
//        jdbcTemplate.queryForObject("select * from customers");
        Long aLong = jdbcTemplate.queryForObject("select count(1) from customers", Long.class);
        log.info("记录总数:{}", aLong);

        log.info("数据源类型：{}", dataSource.getClass());
    }

    @Test
    void testUserMapper() {
        User user = userMapper.selectById(1L);
        log.info("用户信息:{}", user);
    }
}
