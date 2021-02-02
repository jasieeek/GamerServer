package com.app.server.gamer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.app.server.gamer.*"})
@EntityScan(basePackages = {"com.app.server.gamer.*"})
@EnableJpaRepositories(basePackages = {"com.app.server.gamer.*"})
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class);
    }
}
