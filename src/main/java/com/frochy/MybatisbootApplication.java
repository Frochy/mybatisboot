package com.frochy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.frochy.mapper")
@SpringBootApplication
public class MybatisbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisbootApplication.class, args);
    }

}
