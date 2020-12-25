package com.poplar.customize_tag;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * Create BY poplar ON 2020/12/25
 * 这个类的全限定名会被放到 spring.handlers文件中
 */
public class CustomizeNamespaceHandler extends NamespaceHandlerSupport {


    //DefaultNamespaceHandlerResolver 中 会调用该方法
    @Override
    public void init() {
        registerBeanDefinitionParser("poplar", new CustomizePoplarBeanDefinitionParser());
    }
}
