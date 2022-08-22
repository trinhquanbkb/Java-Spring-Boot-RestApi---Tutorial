package com.example.springboot.Service;


import com.example.springboot.Entity.Student;
import com.example.springboot.Payload.Request.StudentRequest;
import com.example.springboot.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void addStudent(StudentRequest studentRequest){
        Student studentNew = new Student();
        studentNew.setNameStudent(studentRequest.getNameStudent());
        studentNew.setMssv(studentRequest.getMssv());
        studentNew.setCreateAt(new Date(System.currentTimeMillis()));
        studentNew.setUpdateAt(new Date(System.currentTimeMillis()));
        studentRepository.save(studentNew);
    }
}
