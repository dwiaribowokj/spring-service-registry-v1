package com.registry.service.registry.v1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceRegistryV1Application {

    public static void main(String[] args) {
        SpringApplication.run(ServiceRegistryV1Application.class, args);
    }

}
