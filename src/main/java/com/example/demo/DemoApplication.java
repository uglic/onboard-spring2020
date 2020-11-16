package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.event.ApplicationContextEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class DemoApplication {
    @Autowired
    private LookupComponent lookupComponent;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @EventListener
    public void contextListener(ContextRefreshedEvent event) {
        System.out.println(lookupComponent.getMe());
        System.out.println(lookupComponent.getMe());
        System.out.println(lookupComponent.getMe());
    }
}
