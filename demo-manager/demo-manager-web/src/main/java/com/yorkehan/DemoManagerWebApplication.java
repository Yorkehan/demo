package com.yorkehan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.yorkehan.mapper.dao")
public class DemoManagerWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoManagerWebApplication.class, args);
    }
}
