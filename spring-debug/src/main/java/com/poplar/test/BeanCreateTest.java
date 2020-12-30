package com.poplar.test;

import com.poplar.config.CustomizeClassPathXmlApplicationContext;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Create BY poplar ON 2020/12/21
 */
public class BeanCreateTest {

    public static void main(String[] args) {
        //ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("customizeEditor.xml");
       /* CustomizeClassPathXmlApplicationContext ac = new CustomizeClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println(ac.getBean("apple"));
        System.out.println(ac.getBean("dataSource"));*/

        //实例化过程测试
        CustomizeClassPathXmlApplicationContext ac = new CustomizeClassPathXmlApplicationContext("test.xml");
        System.out.println(ac.getBean("student1"));
        System.out.println(ac.getBean("student2"));
        ac.close();
    }


    @Test
    public void test1() {

        //CustomizeClassPathXmlApplicationContext ac = new CustomizeClassPathXmlApplicationContext("applicationContext.xml");

        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println(ac.getBean("poplar"));
    }
}
