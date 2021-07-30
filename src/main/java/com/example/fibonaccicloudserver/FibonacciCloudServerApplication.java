package com.example.fibonaccicloudserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({
        CloudServerConfig.class
})
public class FibonacciCloudServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(FibonacciCloudServerApplication.class, args);
    }
}