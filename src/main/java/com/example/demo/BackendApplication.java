package com.example.demo;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.student.Student;

@SpringBootApplication
@RestController
public class BackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

	@GetMapping
	public List <Student> hello(){
		return List.of(
				new Student(
					1L, "Mariam",
				 "mariam.student.com", 
				 21, 
				 LocalDate.of(2000, Month.JANUARY, 5))
				);
	}
}
