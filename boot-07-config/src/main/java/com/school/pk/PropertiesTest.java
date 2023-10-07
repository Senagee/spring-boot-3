package com.school.pk;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Service
public class PropertiesTest {
    //Value注解
    // @Value("${key[:默认值]}")
    //key配置文件中的key
    @Value("${app.name}")
    private String name;
    @Value("${app.port:8000}")
    private Integer port;
    public void printOut(){
        System.out.println(name  + port);
    }
}
