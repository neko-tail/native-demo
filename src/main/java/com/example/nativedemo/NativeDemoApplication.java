package com.example.nativedemo;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class NativeDemoApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(NativeDemoApplication.class, args);
    }
    
}
