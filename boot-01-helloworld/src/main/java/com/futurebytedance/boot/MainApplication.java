package com.futurebytedance.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/9/19 - 23:43
 * @Description
 */
//主程序类:@SpringBootApplication 这是一个SpringBoot应用
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
