package com.poplar.populateBean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Create BY poplar ON 2020/12/30
 * 属性填充中@Autowired 及各种类型属性值得解析注入
 */
public class PopulateBeanTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("populateBean.xml");
    }
}
