package com.futurebytedance.boot09usecustomerstarter.config;

import com.futurebytedance.boot09customerautoconfig.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/10/18 - 23:32
 * @Description
 */
@Configuration
public class MyConfig {
    @Bean
    public HelloService helloService() {
        HelloService helloService = new HelloService();
//        helloService.set()
        return helloService;
    }
}
