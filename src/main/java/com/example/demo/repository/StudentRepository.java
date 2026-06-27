package com.example.demo.repository;

import com.example.demo.model.Student;
import com.example.demo.exception.StudentNotFoundException;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository {

    private final List<Student> students = new ArrayList<>();

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public Student getStudentById(int id){
        for(int i = 0; i < students.size() ; i++){
            if(students.get(i).getId() == id)
                return students.get(i);
        }
        throw new StudentNotFoundException("Student with id " + id + " not found");
    }
}