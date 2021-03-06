package com.poplar.tx.xml;

import com.poplar.tx.Book;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Create BY poplar ON 2021/1/21
 */
public class BookDao {

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


    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void decStock(Integer bookId) {
        String sql = "update stock set numbers=numbers-1 where book_id=?";
        jdbcTemplate.update(sql, bookId);
    }

    public void incrBookPrice(Integer bookId){
        String sql = "update book set price=price+100 where id=?";
        jdbcTemplate.update(sql, bookId);
    }

    public void addAmount() {
        String sql = "update account set amount=amount+100";
        jdbcTemplate.update(sql);
    }
}
