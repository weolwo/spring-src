package com.poplar.tx;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Create BY poplar ON 2021/1/21
 */
public class BookService {

    private BookDao bookDao;



    @Transactional(propagation = Propagation.REQUIRED)
    public void sellBook(Integer id) {
        Book book = bookDao.getBookById(id);
        if (book != null) {
            bookDao.decStock(book.getId());
        }
        bookDao.incAccount(book.getId());
    }

    @Transactional
    public void multipleTxTest(Integer bookId) {
        sellBook(bookId);
        updatePrice(bookId);
        int[] arr = {};
        int a = arr[0];
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void updatePrice(Integer bookId) {
        bookDao.updatePrice(bookId);
//        int[] arr = {};
//        int a = arr[0];
    }

    public BookDao getBookDao() {
        return bookDao;
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}
