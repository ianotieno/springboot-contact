package com.example.demo.student;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.CommandLineRunner;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;


@Configuration
public class StudentConfig {

@Bean 
CommandLineRunner commandLineRunner(StudentRepository repository){
    return args -> {
     Student mariam = new Student(   
        "Mariam",
        "mariam@gmail.com",
         LocalDate.of(2009, Month.JANUARY, 5)
        );

        Student Ian= new Student(   
        "Ian",
        "ian@gmail.com",
        
        LocalDate.of(2001, Month.JANUARY, 5)
        );
        Student Felix = new Student(    
        "Felix",
        "felix@gmail.com",
    
        LocalDate.of(2005, Month.JANUARY, 5)
        );

        repository.saveAll(
            List.of(mariam, Ian, Felix)
        );
    };
        
}}
