package com.futurebytedance.boot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.HiddenHttpMethodFilter;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.util.UrlPathHelper;
import sun.plugin2.message.helper.URLHelper;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/9/26 - 0:18
 * @Description
 */
@Configuration(proxyBeanMethods = false)
public class WebConfig implements WebMvcConfigurer {
    @Bean
    public HiddenHttpMethodFilter hiddenHttpMethodFilter() {
        HiddenHttpMethodFilter methodFilter = new HiddenHttpMethodFilter();
        methodFilter.setMethodParam("_m");
        return methodFilter;
    }

    @Bean //WebMvcConfigurer
    public WebMvcConfigurer webMvcConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void configurePathMatch(PathMatchConfigurer configurer) {
                UrlPathHelper urlHelper = new UrlPathHelper();
                urlHelper.setRemoveSemicolonContent(false);
                configurer.setUrlPathHelper(urlHelper);
            }
        };
    }

//    @Override
//    public void configurePathMatch(PathMatchConfigurer configurer) {
//        UrlPathHelper urlHelper = new UrlPathHelper();
//        //不移除;后面的内容。矩阵变量功能就可以生效
//        urlHelper.setRemoveSemicolonContent(false);
//        configurer.setUrlPathHelper(urlHelper);
//    }
}
