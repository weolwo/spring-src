package com.poplar.tx;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Create BY poplar ON 2021/1/21
 */
public class TXTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ca = new ClassPathXmlApplicationContext("tx.xml");
        BookService bookService = ca.getBean("bookService", BookService.class);

        bookService.multipleTxTest(7);
    }
}
