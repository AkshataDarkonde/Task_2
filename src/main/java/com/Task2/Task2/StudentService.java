package com.Task2.Task2;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents(){
        return studentRepository.findAll();

    }
    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }
}
