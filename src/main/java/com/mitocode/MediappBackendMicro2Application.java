package com.mitocode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableEurekaClient
@EnableResourceServer
public class MediappBackendMicro2Application {

    public static void main(String[] args) {
        SpringApplication.run(MediappBackendMicro2Application.class, args);
    }
}