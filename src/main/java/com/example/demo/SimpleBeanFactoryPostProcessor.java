package com.example.demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class SimpleBeanFactoryPostProcessor implements BeanFactoryPostProcessor, Ordered {
    @Override
    public int getOrder() {
        return 2;
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        System.out.println("postProcessBeanFactory 1: singletons=" + Arrays.toString(configurableListableBeanFactory.getSingletonNames()));
        BeanDefinition definition = configurableListableBeanFactory.getBeanDefinition("someName");
        System.out.println("postProcessBeanFactory 1: definition.scope=" + definition.getScope());
    }
}
