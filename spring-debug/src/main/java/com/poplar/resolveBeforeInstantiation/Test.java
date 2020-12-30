package com.poplar.resolveBeforeInstantiation;

import com.poplar.config.CustomizeClassPathXmlApplicationContext;

/**
 * Create BY poplar ON 2020/12/30
 */
public class Test {

    public static void main(String[] args) {
        CustomizeClassPathXmlApplicationContext ac = new CustomizeClassPathXmlApplicationContext("resolveBeforeInstantiation.xml");
        BeforeInstantiation bean = ac.getBean(BeforeInstantiation.class);
        bean.doSomeThing();
    }
}
