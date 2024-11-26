package com.example.casePratico;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.casePratico"})
public class CasePraticoApplication {
    public static void main(String[] args) {
        SpringApplication.run(CasePraticoApplication.class, args);
    }
}
