package com.xxdp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.xxdp.mapper")
@SpringBootApplication
public class XxDianPingApplication {

    public static void main(String[] args) {
        SpringApplication.run(XxDianPingApplication.class, args);
    }

}
