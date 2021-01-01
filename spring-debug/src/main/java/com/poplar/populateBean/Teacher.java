package com.poplar.populateBean;

import com.poplar.bean.Person;
import com.poplar.bean.Student;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * Create BY poplar ON 2021/1/1
 */
@Component
public class Teacher implements InitializingBean {

    private String name;

    private int id;

    private Person person;

    private String[] hobbies;

    private List<Student> list;

    private Set<Book> set;

    private Map<String, Object> maps;

    private Properties properties;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public List<Student> getList() {
        return list;
    }

    public void setList(List<Student> list) {
        this.list = list;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    @PostConstruct
    public void initMethod() {
        System.out.println("Teacher---initMethod");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Teacher--afterPropertiesSet");
    }
}
