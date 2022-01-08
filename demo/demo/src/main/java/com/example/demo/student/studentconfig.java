package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class studentconfig {
    @Bean
    CommandLineRunner commandLineRunner(studentrepository repository){
        return args -> {
            student rag=new student ("Rag",20);
            student ali=new student ("Ali",23);
            student sami=new student ("Sami",21);
        repository.saveAll(List.of(rag, sami,ali));
        };
    }
}
