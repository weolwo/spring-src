package com.poplar.factoryBean;

import com.poplar.config.CustomizeClassPathXmlApplicationContext;

/**
 * Create BY poplar ON 2020/12/30
 */
public class FactoryBeanTest {

    public static void main(String[] args) {
        CustomizeClassPathXmlApplicationContext ac = new CustomizeClassPathXmlApplicationContext("factoryBean.xml");
        System.out.println(ac.getBean("&customizeFactoryBean"));
        System.out.println(ac.getBean("customizeFactoryBean"));
        System.out.println(ac.getBean(Orange.class));
    }
}
