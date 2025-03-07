package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
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
