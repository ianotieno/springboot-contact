package com.example.demo.student;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class StudentController  {
    @Autowired
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


@GetMapping(path = "api/v1/student")
	public List <Student> getStudents(){
		return studentService.getStudents();
	}

@PostMapping(path = "api/v1/student")
public void registerNewStudent(@RequestBody Student student){ {
   
    studentService.addNewStudent(student);

}
    
}
}
