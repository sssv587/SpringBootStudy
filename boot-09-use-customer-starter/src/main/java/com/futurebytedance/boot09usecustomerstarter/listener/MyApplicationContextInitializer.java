package com.futurebytedance.boot09usecustomerstarter.listener;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/10/19 - 23:34
 * @Description
 */
public class MyApplicationContextInitializer implements ApplicationContextInitializer {
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        System.out.println("MyApplicationContextInitializer ... initialize...");
    }
}
