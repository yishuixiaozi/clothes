package com.example.spring.clothes;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.spring.clothes.mapper")
public class ClothesApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClothesApplication.class, args);
        //SpringApplication springApplication = new SpringApplication(ClothesApplication.class);
        //springApplication.run(args);
    }

}
