package com.example.SpringSecurity2019.controller;

import com.example.SpringSecurity2019.model.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("managment/api/v1/students")
public class ManagementController {
    private static final List<Student> STUDENTS = Arrays.asList(
            new Student(1L, "Pourya", "pouryakarimi1382@gmail.com"),
            new Student(2L, "Hamid", "HamidReza1381@gmail.com")
    );

    @GetMapping
    public List<Student> getStudents(){
        return STUDENTS;
    }

    @PostMapping
    public ResponseEntity<String> addStudent(@RequestBody Student student){
        return ResponseEntity.ok(student.toString());
    }

    @PutMapping("{studentId}")
    public ResponseEntity<String> updateStudent(@PathVariable("studentId") Long studentId){
        return ResponseEntity.ok("");
    }
}
