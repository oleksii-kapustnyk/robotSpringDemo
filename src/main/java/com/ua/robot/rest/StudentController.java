package com.ua.robot.rest;

import com.ua.robot.domain.Student;
import com.ua.robot.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping("/students")
    public List<Student> findAll() {
        return studentService.findAll();
    }

    @GetMapping("/students/{id}")
    public Optional<Student> findById(@PathVariable Long id) {
        return studentService.findById(id);
    }

    @PostMapping("/students")
    public void save(@RequestBody Student student) {
        studentService.save(student);
    }


}
