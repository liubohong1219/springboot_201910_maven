package com.colin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: DengLong
 * Date: 2020-07-16
 * Time: 18:42
 */
@MapperScan("com.colin.mapper")
//@SpringBootApplication(scanBasePackages = "com.colin")
@SpringBootApplication
@EnableTransactionManagement
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
