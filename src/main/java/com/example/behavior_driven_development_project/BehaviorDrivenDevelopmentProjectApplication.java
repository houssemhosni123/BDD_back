package com.example.behavior_driven_development_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })

public class BehaviorDrivenDevelopmentProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(BehaviorDrivenDevelopmentProjectApplication.class, args);
    }

}
