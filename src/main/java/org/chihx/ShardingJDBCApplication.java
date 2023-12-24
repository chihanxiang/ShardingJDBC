package org.chihx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author Faker
 * @implNote ShardingJDBCApplication
 * @since 2023-12-23
 */
@MapperScan("org.chihx.mapper")
@EnableTransactionManagement
@SpringBootApplication
public class ShardingJDBCApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShardingJDBCApplication.class, args);
    }
}
