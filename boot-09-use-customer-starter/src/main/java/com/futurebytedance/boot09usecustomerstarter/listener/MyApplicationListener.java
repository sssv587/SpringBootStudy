package com.futurebytedance.boot09usecustomerstarter.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/10/19 - 23:35
 * @Description
 */
public class MyApplicationListener implements ApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("MyApplicationListener ... onApplicationEvent");
    }
}
