package com.futurebytedance.boot09featuresprofile.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/10/17 - 23:33
 * @Description
 */
@Profile(value = {"prod", "default"})
@Component
@ConfigurationProperties("person")
@Data
public class Boss implements Person {
    private String name;
    private Integer age;

    @Override
    public String getName() {
        return null;
    }

    @Override
    public Integer getAge() {
        return null;
    }
}
