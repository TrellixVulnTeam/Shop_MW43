package com.ishop.ishoptech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class IshopTechApplication {

    public static void main(String[] args) {
        SpringApplication.run(IshopTechApplication.class, args);
    }

}
