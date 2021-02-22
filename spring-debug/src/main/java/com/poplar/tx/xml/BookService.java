package com.poplar.tx.xml;

import com.poplar.tx.Book;

/**
 * Create BY poplar ON 2021/1/21
 */
public class BookService {

    private BookDao bookDao;

    private AccountService accountService;

    public AccountService getAccountService() {
        return accountService;
    }

    public void setAccountService(AccountService accountService) {
        this.accountService = accountService;
    }

    public void decStock(Integer id) {
        Book book = bookDao.getBookById(id);
        if (book != null) {
            bookDao.decStock(book.getId());
        }

    }

    public void sellBook(Integer bookId) {
        decStock(bookId);
//        try {
        accountService.addMoney();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        int[] arr = {};
        int a = arr[0];
    }


    public BookDao getBookDao() {
        return bookDao;
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}
