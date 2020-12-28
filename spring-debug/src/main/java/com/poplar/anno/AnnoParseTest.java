package com.poplar.anno;

import com.poplar.bean.DataSource;
import com.poplar.config.LinuxCondition;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Create BY poplar ON 2020/12/27\
 * 用来测试 @Configuration，ComponentScan，PropertySource，Bean，@Conditional
 */
@Configuration
@PropertySource(value = "classpath:jdbc.properties")
public class AnnoParseTest {

    @Component
    class innerClassTest {

    }


    @Value("${username}")
    private String name;

    @Bean
    @Conditional(LinuxCondition.class)
    public DataSource dataSource() {
        DataSource dataSource = new DataSource();
        dataSource.setUsername(name);
        dataSource.setPassword("123456");
        dataSource.setUrl("localhost:3306");
        dataSource.setDriver("");
        return new DataSource();
    }
}
