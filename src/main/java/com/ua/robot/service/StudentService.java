package com.ua.robot.service;

import com.ua.robot.domain.Student;
import com.ua.robot.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    public Optional<Student> findById(Long id) {
        return studentRepository.findById(id);
    }

    public Optional<Student> findByName(String name) {
        return studentRepository.findStudentByName(name);
    }

    public void save(Student student) {
        studentRepository.save(student);
    }
}
