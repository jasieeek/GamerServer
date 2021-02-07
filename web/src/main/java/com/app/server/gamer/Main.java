package com.app.server.gamer;

import com.app.server.gamer.service.utilities.MD5PasswordEncoder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.security.NoSuchAlgorithmException;

@SpringBootApplication
@ComponentScan(basePackages = {"com.app.server.gamer.*"})
@EntityScan(basePackages = {"com.app.server.gamer.*"})
@EnableJpaRepositories(basePackages = {"com.app.server.gamer.*"})
public class Main {
    public static void main(String[] args) throws NoSuchAlgorithmException { SpringApplication.run(Main.class);

    }
}
