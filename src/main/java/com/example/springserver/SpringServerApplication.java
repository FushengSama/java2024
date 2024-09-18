package com.example.springserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@MapperScan("com.example.springserver.mapper")
@ServletComponentScan
public class SpringServerApplication {

    public static void main(String[] args) {
        try {
            SpringApplication.run(SpringServerApplication.class, args);}
    catch (Exception e) {e.printStackTrace();}
    }

}
