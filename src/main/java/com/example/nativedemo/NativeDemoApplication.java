package com.example.nativedemo;

import cn.hutool.extra.ftp.SimpleFtpServer;
import jakarta.annotation.PostConstruct;
import org.apache.ftpserver.usermanager.impl.BaseUser;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class NativeDemoApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(NativeDemoApplication.class, args);
    }
    
}
