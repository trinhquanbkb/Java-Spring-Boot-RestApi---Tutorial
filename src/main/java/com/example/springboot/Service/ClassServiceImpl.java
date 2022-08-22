package com.example.springboot.Service;

import com.example.springboot.Entity.ClassInfo;
import com.example.springboot.Payload.Request.ClassRequest;
import com.example.springboot.Payload.Request.ClassUpdateRequest;
import com.example.springboot.Repository.ClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

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

    @Override
    public List<ClassInfo> getAllClass(){
        return classRepository.findAll();
    }

    @Override
    public Optional<ClassInfo> getClassById(int id){
        return classRepository.findById(id);
    }

    @Override
    public void deleteClassById(int id){
        classRepository.deleteById(id);
    }

    @Override
    public void updateClass(ClassUpdateRequest classUpdateRequest){
        for(ClassInfo classInfo: classRepository.findAll()) {
            if (classUpdateRequest.getId() == classInfo.getId()) {
                ClassInfo classNew = new ClassInfo();
                classNew.setClassName(classUpdateRequest.getClassName());
                classNew.setMajor(classUpdateRequest.getMajor());
                classNew.setCreateAt(new Date(System.currentTimeMillis()));
                classNew.setUpdateAt(new Date(System.currentTimeMillis()));
                classRepository.save(classNew);
            }
        }
    }
}
