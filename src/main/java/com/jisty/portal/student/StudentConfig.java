package com.jisty.portal.student;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student jide = new Student("A001", "Baba Jide", "Solutions Development", "6");

            repository.saveAll(List.of(jide));
        };
    }
}
