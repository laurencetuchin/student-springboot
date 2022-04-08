package com.example.demo2.student;

import java.time.LocalDate;
import java.util.List;

public class StudentService {
    public List<Student> getStudents() {
        return List.of(new Student(1L, "Tom", "tomhiddelston@test.com", LocalDate.of(1981,1,1),42));
    }
}
