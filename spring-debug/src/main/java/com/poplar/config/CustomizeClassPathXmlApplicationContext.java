package com.poplar.config;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Create BY poplar ON 2020/12/22
 * 修改默认的允许循环依赖,测试结果：spring会抛出异常信息 Error creating bean with name 'apple': Requested bean is currently in creation: Is there an unresolvable circular reference?
 */
public class CustomizeClassPathXmlApplicationContext extends ClassPathXmlApplicationContext {

    public CustomizeClassPathXmlApplicationContext(String... configLocation) {
        super(configLocation);
    }

    @Override
    protected void customizeBeanFactory(DefaultListableBeanFactory beanFactory) {
        //修改默认的允许循环依赖
        //beanFactory.setAllowCircularReferences(false);
        super.customizeBeanFactory(beanFactory);
    }
}
