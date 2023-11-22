package com.Task2.Task2;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest

public class ServiceTest {
    @Autowired
    private StudentService studentService;

    @Test
    void testSaveAndGetAllStudents(){
        Student student = new Student("A", "Akshata",24 , 25000);
        studentService.saveStudent(student);
        assertEquals(1,studentService.getAllStudents().size());
    }
}
