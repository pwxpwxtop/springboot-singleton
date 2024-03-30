package com.xingble;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"com.xingble.mapper"})
public class XingbleApplication {

    public static void main(String[] args) {
        SpringApplication.run(XingbleApplication.class, args);
    }

}
