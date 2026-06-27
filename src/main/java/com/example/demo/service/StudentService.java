package com.example.demo.service;

import com.example.demo.model.Student;
import org.springframework.stereotype.Service;
import com.example.demo.repository.StudentRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    private StudentRepository repository;

    public StudentService(StudentRepository repository) {
    this.repository = repository;
    }

    public List<Student> getStudents() {
        return repository.getStudents();
    }

    public void addStudent(Student student) {
        repository.addStudent(student);
    }
}