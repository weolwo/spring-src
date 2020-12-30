package com.poplar.factoryMethod;

import com.poplar.bean.Person;

/**
 * Create BY poplar ON 2020/12/30
 * 自定义一个实例工厂，工厂本身首先需要实列化
 */
public class CustomizeInstanceFactory {

    public Person getPerson(String name) {
        Person person = new Person();
        person.setId(1);
        person.setName(name);
        return person;
    }
}
