package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student tiago = new Student(
                    "Tiago",
                    "tiago@email.com",
                    LocalDate.of(2002, Month.NOVEMBER, 10));

            Student daniel = new Student(
                    "Daniel",
                    "daniel@email.com",
                    LocalDate.of(2004, Month.MARCH, 05));

            repository.saveAll(
                    List.of(tiago, daniel));
        };
    }

}
