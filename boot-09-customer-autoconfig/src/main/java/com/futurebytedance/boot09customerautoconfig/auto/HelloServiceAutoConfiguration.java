package com.futurebytedance.boot09customerautoconfig.auto;

import com.futurebytedance.boot09customerautoconfig.bean.HelloProperties;
import com.futurebytedance.boot09customerautoconfig.service.HelloService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/10/18 - 23:16
 * @Description
 */
@Configuration
@EnableConfigurationProperties(HelloProperties.class) //默认HelloProperties放在容器中
public class HelloServiceAutoConfiguration {
    @ConditionalOnMissingBean(HelloService.class)
    @Bean
    public HelloService helloService() {
        HelloService helloService = new HelloService();
        return helloService;
    }
}
