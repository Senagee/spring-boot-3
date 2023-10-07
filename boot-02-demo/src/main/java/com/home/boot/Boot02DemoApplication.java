package com.home.boot;

import com.home.boot.bean.Cat;
import com.home.boot.bean.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Date;

/*
* SpringBootApplication
*       @SpringBootConfiguration    配置类
        *   可在本类中用@Bean注解将bean注入ioc容器
        @EnableAutoConfiguration
        *   开启自动注解
        *   将第三方类进入容器
        @ComponentScan
        *   扫描本类包机器子包下的所有类
        *   @Controller、@Service、@Repository、@Component
*
*
* */
@SpringBootApplication
public class Boot02DemoApplication {

    @Bean
    public Date date(){
        return new Date();
    }
    public static void main(String[] args) {
        ConfigurableApplicationContext ioc = SpringApplication.run(Boot02DemoApplication.class, args);

    }

}
