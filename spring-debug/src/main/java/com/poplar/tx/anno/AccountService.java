package com.poplar.tx.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Create BY poplar ON 2021/2/22
 */
public class AccountService {

    @Autowired
    private BookDao bookDao;

    @Transactional(propagation = Propagation.NESTED)
    public void addMoney() {
        bookDao.incAccount();
        int[] arr = {};
        int a = arr[0];
    }
}
