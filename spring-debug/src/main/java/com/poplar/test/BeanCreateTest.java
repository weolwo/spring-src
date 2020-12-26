package com.poplar.test;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Create BY poplar ON 2020/12/21
 */
public class BeanCreateTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("customizeEditor.xml");
        System.out.println(ac.getBean("user"));
    }












    @Test
    public void test1() {

        //CustomizeClassPathXmlApplicationContext ac = new CustomizeClassPathXmlApplicationContext("applicationContext.xml");

        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println(ac.getBean("poplar"));
    }
}
