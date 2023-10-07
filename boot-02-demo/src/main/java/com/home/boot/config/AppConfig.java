package com.home.boot.config;

import com.home.boot.bean.Cat;
import com.home.boot.bean.User;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;

@SpringBootConfiguration
public class AppConfig {
    @ConditionalOnClass(User.class)
    @Bean
    public Cat cat(){
        return  new Cat();
    }
    @ConditionalOnBean(User.class)
    @Bean
    public User user(){
        return new User();
    }
}
