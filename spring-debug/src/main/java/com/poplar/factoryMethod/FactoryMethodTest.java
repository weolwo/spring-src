package com.poplar.factoryMethod;

import com.poplar.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Create BY poplar ON 2020/12/30
 * 使用 factoryMethod 这种方式创建对象测试
 */
public class FactoryMethodTest {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("factoryMethod.xml");
        Person person1 = (Person) ac.getBean("person1");
        System.out.println(person1.getName());

        Person person2 = (Person) ac.getBean("person2");
        System.out.println(person2.getName());
    }
}
