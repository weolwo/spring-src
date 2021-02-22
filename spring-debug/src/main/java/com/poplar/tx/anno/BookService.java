package com.poplar.tx.anno;

import com.poplar.tx.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Create BY poplar ON 2021/1/21
 */
public class BookService {

    @Autowired
    private BookDao bookDao;


    // @Transactional(propagation = Propagation.REQUIRED)
    public void decStock(Integer id) {
        Book book = bookDao.getBookById(id);
        if (book != null) {
            bookDao.decStock(book.getId());
        }
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void sellBook(Integer bookId) {
        decStock(bookId);
        addMoney();
        throw new RuntimeException();
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void addMoney() {
        bookDao.incAccount();
    }

}
