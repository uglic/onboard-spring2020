package com.example.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.SmartLifecycle;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class SimpleComponent implements SmartLifecycle, InitializingBean, DisposableBean {
    @PostConstruct
    private void postConstruct() {
        System.out.println("SimpleComponent: postConstruct");
    }

    @PreDestroy
    private void preDestroy() {
        System.out.println("SimpleComponent: preDestroy");
    }

    @Override
    public void start() {
        System.out.println("SimpleComponent: lifeCycle.start");
    }

    @Override
    public void stop() {
        System.out.println("SimpleComponent: lifeCycle.stop");
    }

    @Override
    public boolean isRunning() {
        System.out.println("SimpleComponent: lifeCycle.isRunning");
        return false;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("SimpleComponent: disposableBean.destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("SimpleComponent: initializingBean.afterPropertiesSet");
    }
}
