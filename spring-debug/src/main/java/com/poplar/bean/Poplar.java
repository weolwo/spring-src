package com.poplar.bean;

/**
 * Create BY poplar ON 2020/12/25
 * 自定义标签 bean
 */
public class Poplar {

    private String name;

    private String id;

    private String job;

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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Poplar{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}
