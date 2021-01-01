package com.poplar.populateBean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * Create BY poplar ON 2020/12/30
 * 实验属性填充中使用 postProcessAfterInstantiation()方法
 */
@Component
public class TeacherInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {

    //填充属性的时候会被调用
    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        System.out.println("beanName:" + beanName + "----执行postProcessAfterInstantiation方法");

        if (bean instanceof Book) {
            ((Book) bean).setName("Java 入门到放弃");
            //此处返回false，设置的值就不会被覆盖，因为执行该方法后就直接返回了
            return false;
        }
        return true;
    }

    //执行初始化方法前调用
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof Teacher) {
            ((Teacher) bean).setName("七猫🐱");
            //此处返回false，设置的值就不会被覆盖，因为执行该方法后就直接返回了
            System.out.println(((Teacher) bean).getName());
            return bean;
        }
        return bean;
    }

    //执行初始化方法后调用
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof Teacher) {
            ((Teacher) bean).setName("七猫🐱🐱");
            //此处返回false，设置的值就不会被覆盖，因为执行该方法后就直接返回了
            System.out.println(((Teacher) bean).getName());
            return bean;
        }
        return bean;
    }
}
