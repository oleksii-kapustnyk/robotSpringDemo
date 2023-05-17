package com.ua.robot.service;

import com.ua.robot.domain.Student;
import com.ua.robot.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@SpringBootTest(classes = CalculatorService.class)
class CalculatorServiceTest {

    @Autowired
    private CalculatorService calculatorService;

    @MockBean
    private StudentRepository studentRepository;

    @Test
    void shouldMultiply() {
        assertEquals(6, calculatorService.multiply(2, 3));
    }

    @Test
    void shouldDivide() {
        assertEquals(2, calculatorService.divide(6, 3));
    }

    @Test
    void shouldDivideWithException() {
        assertThrows(IllegalArgumentException.class, () -> calculatorService.divide(12, 0));
    }

    @Test
    void shouldGetStudentsCount() {
        when(studentRepository.count()).thenReturn(10L);
        when(studentRepository.findAll()).thenReturn(List.of(new Student(), new Student()));

        assertEquals(10L, calculatorService.getStudentsCount());
    }
}