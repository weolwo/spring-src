package com.poplar.supplier;

import com.poplar.config.CustomizeClassPathXmlApplicationContext;

/**
 * Create BY poplar ON 2020/12/30
 */
public class SupplierTest {

    public static void main(String[] args) {
        CustomizeClassPathXmlApplicationContext ac = new CustomizeClassPathXmlApplicationContext("supplier.xml");
        System.out.println(ac.getBean(SupplierObject.class).getName());
    }
}
