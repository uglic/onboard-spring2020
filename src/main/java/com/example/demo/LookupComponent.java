package com.example.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.Lifecycle;
import org.springframework.context.SmartLifecycle;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LookupComponent implements SmartLifecycle, InitializingBean, DisposableBean {

    @PostConstruct
    private void postConstruct() {
        System.out.println("LookupComponent: postConstruct");
    }

    @PreDestroy
    private void preDestroy() {
        System.out.println("LookupComponent: preDestroy");
    }

    @Lookup
    @Qualifier("someName")
    public String getMe() {
        return null;
    }

    @Override
    public void start() {
        System.out.println("LookupComponent: lifeCycle.start");
    }

    @Override
    public void stop() {
        System.out.println("LookupComponent: lifeCycle.stop");
    }

    @Override
    public boolean isRunning() {
        System.out.println("LookupComponent: lifeCycle.isRunning");
        return false;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("LookupComponent: disposableBean.destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("LookupComponent: initializingBean.afterPropertiesSet");
    }
}
