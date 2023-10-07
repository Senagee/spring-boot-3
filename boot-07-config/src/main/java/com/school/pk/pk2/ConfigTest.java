package com.school.pk.pk2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ConfigTest {
    @Value("${spring.redis.host}")
    private String host;
    @Value("${spring.mysql.url}")
    private String url;
    public void printOut(){
        System.out.println("redis.host: " + host + "; " + "mysql.url: " + url);
    }
}
