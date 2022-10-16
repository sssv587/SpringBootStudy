package com.futurebytedance.boot05webadmin.actuator.info;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

import java.util.Collections;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/10/16 - 23:47
 * @Description
 */
@Component
public class AppInfoContributor implements InfoContributor {
    @Override
    public void contribute(Info.Builder builder) {
        builder.withDetail("msg", "你好")
                .withDetail("hello", "world")
                .withDetails(Collections.singletonMap("world", "666"));
    }
}
