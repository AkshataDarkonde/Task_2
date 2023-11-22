package com.Task2.Task2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private static final Logger logger= LoggerFactory.getLogger(StudentController.class);
    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("/save")
    public Student addStudent(@RequestBody Student student) {
        logger.info("Saving New Student: {}",student);
        return studentRepository.save(student);
    }

    @GetMapping("/getall")
    public List<Student> getAllStudents() {
        logger.info("Saving New Student: {}");
        return studentRepository.findAll();
    }
}
