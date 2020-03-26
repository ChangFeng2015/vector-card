package com.qiqilab.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.qiqilab")
@MapperScan("com.qiqilab.dao")
public class CardWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(CardWebApplication.class, args);
    }
}
