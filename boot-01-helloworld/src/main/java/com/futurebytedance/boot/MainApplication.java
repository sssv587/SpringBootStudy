package com.futurebytedance.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/9/19 - 23:43
 * @Description
 */
//主程序类:@SpringBootApplication 这是一个SpringBoot应用
//@SpringBootApplication(scanBasePackages = "com.futurebytedance")
@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan("com.futurebytedance")
public class MainApplication {
    public static void main(String[] args) {
        //1、返回我们的IOC容器
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);
        //2、查看容器里面的组件
        String[] names = run.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }
}
