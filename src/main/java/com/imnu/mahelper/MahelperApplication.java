package com.imnu.mahelper;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.imnu.mahelper.mapper")
public class MahelperApplication {

    public static void main(String[] args) {
        SpringApplication.run(MahelperApplication.class, args);
    }

}
