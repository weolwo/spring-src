package com.poplar.bean;

import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/**
 * Create BY poplar ON 2020/12/30
 * 测试对象实列化过程中如何确定使用那个构造方法，以及构造方法的缓存，在实列化后允许修改bean定义信息
 * bean的实例化有总共有五种策略
 *
 * @PostConstruct  @PreDestroy 这两个注解是jdk自带的 JSR-250的规范
 */
public class Student {

    private String name;

    @Resource
    private String id;

    public Student() {
    }

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }

    @Value("二猫")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @PostConstruct
    public void initMethod() {
        System.out.println("initMethod.......");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("destroy.......");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

}
