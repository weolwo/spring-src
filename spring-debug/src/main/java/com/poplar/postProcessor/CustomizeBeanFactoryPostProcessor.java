package com.poplar.postProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * Create BY poplar ON 2020/12/26
 * 通过 getBeanFactoryPostProcessors()方法扩展 BeanFactoryPostProcessor
 */
public class CustomizeBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("扩展BeanFactoryPostProcessor");
    }
}
