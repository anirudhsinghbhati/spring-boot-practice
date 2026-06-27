package com.example.demo.model;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class Student {
    private int id;

    @NotBlank(message = "Name cannot be empty")
    private String name;

    @Min(value = 1, message = "Age must be greater than 0")
    private int age;

    public Student(int id , String name , int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }
    
    public int getId() {
    return id;
    }

    public String getName() {
    return name;
    }

    public int getAge() {
    return age;
    }
        public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    } 
    
}