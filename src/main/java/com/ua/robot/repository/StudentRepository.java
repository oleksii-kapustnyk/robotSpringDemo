package com.ua.robot.repository;

import com.ua.robot.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    Optional<Student> findStudentByName(String name);

    Optional<Student> findStudentByNameAndAge(String name, int age);
}
