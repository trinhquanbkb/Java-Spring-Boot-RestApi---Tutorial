package com.example.springboot.Repository;

import com.example.springboot.Entity.Student;
import com.example.springboot.Payload.Request.StudentRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    public Student addStudent(StudentRequest studentRequest);
}
