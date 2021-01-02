package com.poplar.cycleReference;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Create BY poplar ON 2021/1/2
 * spring 循环依赖问题实验
 */
public class CycleReferenceTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ca = new ClassPathXmlApplicationContext("cycleReference.xml");
    }
}
