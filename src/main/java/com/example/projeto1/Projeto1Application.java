package com.example.projeto1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories("com.example.projeto1.model.repository")
public class Projeto1Application {

    public static void main(String[] args) {
        SpringApplication.run(Projeto1Application.class, args);
    }

}
