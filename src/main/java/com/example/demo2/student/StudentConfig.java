package com.example.demo2.student;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {


    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student tom = new Student("Tom", "tomh@test.com", LocalDate.of(2000, 1, 1));
            Student loki = new Student("Loki", "loki@test.com", LocalDate.of(1900, 1, 1));

        };

        repository.saveAll(
                List.of(tom, loki)
        );
    }


}
