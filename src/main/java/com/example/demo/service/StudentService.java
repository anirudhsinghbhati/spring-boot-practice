package com.example.demo.service;

import com.example.demo.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents() {

        List<Student> students = new ArrayList<>();

        students.add(new Student(1, "Anirudh", 21));
        students.add(new Student(2, "Rahul", 22));
        students.add(new Student(3, "Amit", 20));

        return students;
    }
}