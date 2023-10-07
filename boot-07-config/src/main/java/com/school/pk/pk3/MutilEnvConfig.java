package com.school.pk.pk3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MutilEnvConfig {
    @Value("${myapp.mome}")
    private String mome;
    public void printOut(){
        System.out.println("mome: " + mome);
    }
}
