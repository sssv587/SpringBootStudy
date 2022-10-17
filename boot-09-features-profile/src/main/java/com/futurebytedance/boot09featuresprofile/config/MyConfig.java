package com.futurebytedance.boot09featuresprofile.config;

import com.futurebytedance.boot09featuresprofile.bean.Color;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/10/17 - 23:36
 * @Description
 */
@Configuration
public class MyConfig {
    @Profile("prod")
    @Bean
    public Color red() {
        return new Color();
    }

    @Profile("test")
    @Bean
    public Color green() {
        return new Color();
    }
}
