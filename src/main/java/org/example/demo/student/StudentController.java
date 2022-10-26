package org.example.demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {
    @GetMapping
    public List<Student> getAllStudents() throws InterruptedException {
//        Thread.sleep(5000L);
//        System.out.println("ping");
        return Arrays.asList(
                new Student(1L, "Jane", "Jane@amigocsode.edu", Gender.FEMALE),
                new Student(2L, "Alex", "Alex@amigocsode.edu", Gender.MALE)
        );
    }
}
