package com.spring.prodservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProdserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProdserviceApplication.class, args);
    }

}
