package com.offcn.springbootmybatistest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.offcn.springbootmybatistest.mapper")
public class SpringbootmybatistestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootmybatistestApplication.class, args);
    }

}
