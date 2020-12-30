package com.poplar.factoryMethod;

import com.poplar.bean.Person;

/**
 * Create BY poplar ON 2020/12/30
 * factoryMethod 自定义一个静态工厂,工厂本身不需要实例化
 */
public class CustomizeStaticFactory {

    public static Person getPerson(String name) {
        Person person = new Person();
        person.setId(1);
        person.setName(name);
        return person;
    }

    public static Person getPerson(String name, int id) {
        Person person = new Person();
        person.setId(1);
        person.setName(name);
        return person;
    }
}
