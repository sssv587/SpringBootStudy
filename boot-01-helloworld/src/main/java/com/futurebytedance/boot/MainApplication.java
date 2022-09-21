package com.futurebytedance.boot;

import com.futurebytedance.boot.bean.Pet;
import com.futurebytedance.boot.bean.User;
import com.futurebytedance.boot.config.MyConfig;
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
        //3、从容器中获取组件
        Pet tom01 = run.getBean("tom", Pet.class);
        Pet tom02 = run.getBean("tom", Pet.class);
        System.out.println("组件: " + (tom01 == tom02));

        //4、com.futurebytedance.boot.config.MyConfig$$EnhancerBySpringCGLIB$$d2479ccb@61f2c3f0
        MyConfig bean = run.getBean(MyConfig.class);
        System.out.println(bean);

        //如果@Configuration(proxyBeanMethods = true)代理对象调用方法。
        // SpringBoot总会检查这个组件是否在容器中有
        // 保持组件单实例
        User user = bean.user01();
        User user1 = bean.user01();
        System.out.println(user == user1);

        User user01 = run.getBean("user01", User.class);
        Pet tom = run.getBean("tom", Pet.class);
        System.out.println("用户的宠物:" + (user01.getPet() == tom));
    }
}
