package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.event.*;

@SpringBootApplication
public class DemoApplication {
    @Autowired
    private LookupComponent lookupComponent;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @EventListener
    public void contextListener(ContextRefreshedEvent event) {
        System.out.println("ContextRefreshedEvent fired"); // fires OK
        System.out.println(lookupComponent.getMe());
        System.out.println(lookupComponent.getMe());
        System.out.println(lookupComponent.getMe());
    }

    @EventListener
    public void contextListener(ContextStartedEvent event) {
        System.out.println("ContextStartedEvent fired"); // not fires at all
    }

    @EventListener
    public void contextListener(ContextStoppedEvent event) {
        System.out.println("ContextStoppedEvent fired"); // not fires at all
    }

    @EventListener
    public void contextListener(ContextClosedEvent event) {
        System.out.println("(ContextClosedEvent fired");  // fires OK
    }
}
