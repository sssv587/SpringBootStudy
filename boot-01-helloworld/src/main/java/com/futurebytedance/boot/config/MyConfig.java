package com.futurebytedance.boot.config;

import ch.qos.logback.core.db.DBHelper;
import com.futurebytedance.boot.bean.Pet;
import com.futurebytedance.boot.bean.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author yuhang.sun
 * @version 1.0
 * @date 2022/9/21 - 23:22
 * @Description
 * 1.配置类里面使用@Bean标注在方法上给容器注册组件,默认也是单实例的
 * 2、配置类本身也是组件
 * 3、proxyBeanMethods:代理bean方法
 *      Full(proxyBeanMethods = true)【保证每个@Bean方法被调用多少次返回的组件都是单实例的】
 *      Lite(proxyBeanMethods = false)【每个@Bean方法被调用多少次返回的组件都是新创建的】
 * 组件依赖必须使用Full模式默认。其他默认是否Lite模式
 * 4、@Import({User.class, DBHelper.class})
 *     给容器中自动创建出这两个类型的组件,默认组件的名字就是全类名
 */
@Import({User.class, DBHelper.class})
@Configuration(proxyBeanMethods = true) //告诉SpringBoot这时一个配置类 == 配置文件
//@ConditionalOnBean(name = "tom")
@ConditionalOnMissingBean(name = "tom")
public class MyConfig {
    /**
     * 外部无论对配置类中的这个组件注册方法调用多少次获取的都是之前注册容器中的单实例对象
     * @return
     */
    //给容器中添加组件,以方法名作为组件的id,返回类型就是组件类型
    //返回的值,就是组件在容器中的实例
    @Bean
    public User user01() {
        User zhangsan = new User("zhangsan", 18);
        //user组件依赖了Pet组件
        zhangsan.setPet(tomcatPet());
        return zhangsan;
    }

    @Bean("tom22")
    public Pet tomcatPet() {
        return new Pet("tomcat");
    }
}
