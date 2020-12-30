package com.poplar.resolveBeforeInstantiation;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.cglib.proxy.Enhancer;

/**
 * Create BY poplar ON 2020/12/30
 */
public class CustomizeInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {

    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        System.out.println("beanName:" + beanName + "----执行postProcessBeforeInstantiation方法");
        if (beanClass == BeforeInstantiation.class) {
            Enhancer enhancer = new Enhancer();
            enhancer.setCallback(new CustomizeMethodInterceptor());
            enhancer.setSuperclass(beanClass);
            return enhancer.create();
        }
        return null;
    }

    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        System.out.println("beanName:" + beanName + "----执行postProcessAfterInstantiation方法");
        return false;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("beanName:" + beanName + "----执行postProcessBeforeInitialization方法");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("beanName:" + beanName + "----执行postProcessAfterInitialization方法");
        return bean;
    }

    @Override
    public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
        System.out.println("beanName:" + beanName + "----执行postProcessProperties方法");
        return pvs;
    }
}
