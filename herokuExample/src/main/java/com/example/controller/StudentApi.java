package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Student;
import com.example.persistence.StudentRepository;

@RestController
@RequestMapping("/students")
public class StudentApi {
@Autowired
private StudentRepository studentRepository;
@RequestMapping("/add")
public void addStudents(Student student){
 studentRepository.save(student);
}
@RequestMapping("/")
public List<Student>getAllStudent(){
	return studentRepository.findAll();
}
}
