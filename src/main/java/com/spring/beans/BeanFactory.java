package com.spring.beans;

public interface BeanFactory {
    Object getBean(String beanName) throws BeanException;
    void registerBeanDefinition(BeanDefinition beanDefinition);
}
