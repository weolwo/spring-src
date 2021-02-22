package com.poplar.tx.anno;

import com.poplar.tx.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Create BY poplar ON 2021/1/21
 */
public class BookDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Book getBookById(Integer id) {
        return jdbcTemplate.queryForObject("select * from book where id=?", (rs, rowNum) -> {
            Book book = new Book();
            book.setId(rs.getInt("id"));
            book.setName(rs.getString("name"));
            book.setPrice(rs.getDouble("price"));
            return book;
        }, id);
    }

    public void decStock(Integer bookId) {
        String sql = "update stock set numbers=numbers-1 where book_id=?";
        jdbcTemplate.update(sql, bookId);
    }

    public void updatePrice(Integer id) {
        String sql = "update book set price=price-1 where id=?";
        jdbcTemplate.update(sql, id);
    }

    public void incAccount() {
        String sql = "update account set amount=amount+100";
        jdbcTemplate.update(sql);
    }
}
