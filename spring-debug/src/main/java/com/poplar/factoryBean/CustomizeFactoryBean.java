package com.poplar.factoryBean;

import org.springframework.beans.factory.FactoryBean;

/**
 * Create BY poplar ON 2020/12/29
 * 测试FactoryBean接口创建对象
 * BeanFactory和FactoryBean都是用来创建对象的，如果使用这个BeanFactory接口创建对象就必须严格遵守springBean的生命周期接口
 * 从初始化到实例化，到调用invokeBeanFactoryPostProcessors，初始化方法以及BeanPostProcessor的before和after等方法，
 * 流程非常复杂，如果我们需要更加便捷的方式创建对象就可以使用FactoryBean，而不需要遵守复杂的流程
 * 当使用FactoryBean接口创建对象的时候会创建两个对象，一个是实现FactoryBean接口的对象，另一个是getObject() 方法返回的对象
 */
public class CustomizeFactoryBean implements FactoryBean<Orange> {

    @Override
    public Orange getObject() throws Exception {
        return new Orange("绿色", 50.0);
    }

    @Override
    public Class<?> getObjectType() {
        return Orange.class;
    }

    //如果创建的对象是单例的，那么将会交给spring容器去管理，但是FactoryBean创建的bean和一般创建的bean是分开缓存的
    @Override
    public boolean isSingleton() {
        return true;
    }
}
