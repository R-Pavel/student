package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student mariam = new Student(
                    1L,
                    "Mariam",
                    "mariam.jamal@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 5)
            );

            Student villiam = new Student(
                    2L,
                    "Villiam",
                    "villiam.javak@gmail.com",
                    LocalDate.of(1998, Month.AUGUST, 14)
            );

            repository.saveAll(
                    List.of(mariam, villiam)
            );
        };
    }
}
