package com.example.demo.controller;

import com.example.demo.model.Student;
//import com.example.demo.dto.StudentDTO;
import com.example.demo.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import jakarta.validation.Valid;

import java.util.List;
import java.util.ArrayList;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping()
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public void addStudent(@Valid @RequestBody Student student){
        studentService.addStudent(student);
    }

    @GetMapping("/{id}")
        public Student getStudentById(@PathVariable int id) {
            return studentService.getStudentById(id);
    }

}