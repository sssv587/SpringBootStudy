package com.futurebytedance.boot09featuresprofile.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/10/17 - 23:30
 * @Description
 */
public interface Person {
    String getName();

    Integer getAge();
}
