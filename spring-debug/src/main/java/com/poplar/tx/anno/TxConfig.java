package com.poplar.tx.anno;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * Create BY poplar ON 2021/2/7
 * 事务注解版
 */
@Configuration
@EnableTransactionManagement
@PropertySource(value = "classpath:jdbc.properties")
public class TxConfig {

    @Value("${jdbc.username}")
    private String userName;

    @Value("${jdbc.url}")
    private String url;

    @Value("${jdbc.driver}")
    private String driveClass;

    @Value("${jdbc.password}")
    private String password;

    @Bean
    public DataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUsername(userName);
        dataSource.setPassword(password);
        dataSource.setUrl(url);
        dataSource.setDriverClassName(driveClass);
        return dataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {

        return new JdbcTemplate(dataSource);
    }

    @Bean
    public AccountService accountService() {
        return new AccountService();
    }

    @Bean
    public BookDao bookDao() {
        return new BookDao();
    }

    @Bean
    public BookService bookService() {
        return new BookService();
    }

    @Bean
    public PlatformTransactionManager DataSourceTransactionManager(DataSource dataSource) {

        return new DataSourceTransactionManager(dataSource);
    }
}
