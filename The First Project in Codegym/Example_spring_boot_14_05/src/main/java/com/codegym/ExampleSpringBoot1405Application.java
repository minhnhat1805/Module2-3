package com.codegym;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@EnableJpaRepositories(basePackages="com.codegym.repository")
@EnableJpaAuditing()
@SpringBootApplication
public class ExampleSpringBoot1405Application  {

    public static void main(String[] args)
    {
        SpringApplication.run(ExampleSpringBoot1405Application.class, args);
    }

}
