package com.poplar.tx.xml;

/**
 * Create BY poplar ON 2021/2/22
 */
public class AccountService {

    private BookDao bookDao;

    public void addMoney() {
        bookDao.addAmount();
       /* int[] arr = {};
        int a = arr[0];*/
        bookDao.incrBookPrice(7);
    }

    public BookDao getBookDao() {
        return bookDao;
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}
