package com.poplar.supplier;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;

/**
 * Create BY poplar ON 2020/12/30
 * 用于测试spring中通过supplier创建对象
 */
public class SupplierBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        GenericBeanDefinition beanDefinition = (GenericBeanDefinition) beanFactory.getBeanDefinition("supplierObject");
        //这个方法是AbstractBeanDefinition抽象类在spring5.0新增的
        beanDefinition.setInstanceSupplier(CreateSupplier::createObj);
        beanDefinition.setBeanClass(SupplierObject.class);
    }
}
