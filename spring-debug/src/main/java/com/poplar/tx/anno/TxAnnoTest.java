package com.poplar.tx.anno;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Create BY poplar ON 2021/2/7
 */
public class TxAnnoTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
        ac.register(TxConfig.class);
        ac.refresh();
        BookService bookService = ac.getBean(BookService.class);
        bookService.sellBook(7);
    }
}
