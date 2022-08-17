package com.example.efjonathanortizconfigserverpizza;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class EfJonathanOrtizConfigserverPizzaApplication {

    public static void main(String[] args) {
        SpringApplication.run(EfJonathanOrtizConfigserverPizzaApplication.class, args);
    }

}
