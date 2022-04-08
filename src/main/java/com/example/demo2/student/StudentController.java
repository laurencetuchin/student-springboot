package com.example.demo2.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    @GetMapping()
    public List<Student> getStudents() {
        return List.of(new Student(1L, "Tom", "tomhiddelston@test.com", LocalDate.of(1981,1,1),42));
    }
}
