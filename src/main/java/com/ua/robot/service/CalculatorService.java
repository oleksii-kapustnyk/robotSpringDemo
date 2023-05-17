package com.ua.robot.service;

import com.ua.robot.domain.Student;
import com.ua.robot.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CalculatorService {

    private final StudentRepository studentRepository;

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }

        return a / b;
    }

    public long getStudentsCount() {
        List<Student> students = studentRepository.findAll();
        return studentRepository.count();
    }
}
