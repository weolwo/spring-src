package com.poplar.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Create BY poplar ON 2021/1/2
 * aop测试实验
 */
public class AopTest {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("aop.xml");
        CustomizeCalculator calculator = (CustomizeCalculator) ac.getBean("customizeCalculator");
        calculator.add(2, 3);
    }
}
