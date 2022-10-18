package com.futurebytedance.boot09customerautoconfig.service;

import com.futurebytedance.boot09customerautoconfig.bean.HelloProperties;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/10/18 - 23:13
 * @Description
 * 默认不要放在容器中
 */
public class HelloService {
    @Autowired
    HelloProperties helloProperties;

    public String sayHello(String userName) {
        return helloProperties.getPrefix() + ":" + userName + helloProperties.getSuffix();
    }
}
