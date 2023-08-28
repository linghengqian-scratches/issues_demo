package com.ingsha.application.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@ComponentScan(basePackages = "com.ingsha")
@SpringBootApplication
@EnableScheduling
public class Application {
    public static void main(String[] args) {
        System.setProperty("http.maxConnections", "200");
        SpringApplication.run(Application.class, args);
    }
}
