package com.futurebytedance.boot09customerautoconfig.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/10/18 - 23:14
 * @Description
 */
@ConfigurationProperties("com.futurebytedance.boot09customerautoconfig")
public class HelloProperties {
    private String prefix;
    private String suffix;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}
