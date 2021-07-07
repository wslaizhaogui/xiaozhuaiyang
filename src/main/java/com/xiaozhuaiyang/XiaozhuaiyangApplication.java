package com.xiaozhuaiyang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@MapperScan("com.xiaozhuaiyang.business.*.mapper")
public class XiaozhuaiyangApplication {

    public static void main(String[] args) {
        SpringApplication.run(XiaozhuaiyangApplication.class, args);
    }

}
