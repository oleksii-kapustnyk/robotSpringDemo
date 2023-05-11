package com.ua.robot.service;

import com.ua.robot.domain.Student;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {


    public List<Student> findAll() {
        return List.of(
                new Student("John", 20, "London"),
                new Student("Jane", 21, "New York"),
                new Student("Jack", 22, "Paris"),
                new Student("Jill", 23, "Berlin")
        );
    }

    public Optional<Student> findById(Long id) {
        return Optional.of(new Student("John", 20, "London"));
    }

    public void save(Student student) {
        System.out.println(student);
    }
}
