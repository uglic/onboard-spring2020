package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.concurrent.atomic.AtomicInteger;

@Configuration
public class LookupConfiguration {
    private static final AtomicInteger counter = new AtomicInteger(1);

    @Bean("someName")
    @Scope("prototype")
    public String someName() {
        int i = counter.getAndIncrement();
        return "someName_" + i;
    }
}
