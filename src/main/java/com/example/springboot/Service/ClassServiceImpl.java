package com.example.springboot.Service;

import com.example.springboot.Entity.ClassInfo;
import com.example.springboot.Payload.Request.ClassRequest;
import com.example.springboot.Repository.ClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ClassServiceImpl implements ClassService {
    @Autowired
    private ClassRepository classRepository;

    @Override
    public void addClass(ClassRequest classRequest){
        ClassInfo classNew = new ClassInfo();
        classNew.setClassName(classRequest.getClassName());
        classNew.setMajor(classRequest.getMajor());
        classNew.setCreateAt(new Date(System.currentTimeMillis()));
        classNew.setUpdateAt(new Date(System.currentTimeMillis()));
        classRepository.save(classNew);
    }
}
