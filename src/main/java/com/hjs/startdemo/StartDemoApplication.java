package com.hjs.startdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hjs.startdemo.mapper")
public class StartDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(StartDemoApplication.class, args);
    }

}
