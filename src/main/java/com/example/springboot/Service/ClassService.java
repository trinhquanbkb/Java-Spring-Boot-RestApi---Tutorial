package com.example.springboot.Service;

import com.example.springboot.Entity.ClassInfo;
import com.example.springboot.Payload.Request.ClassRequest;
import com.example.springboot.Payload.Request.ClassUpdateRequest;

import java.util.List;
import java.util.Optional;

public interface ClassService {
    public void addClass(ClassRequest classRequest);
    public List<ClassInfo> getAllClass();
    public Optional<ClassInfo> getClassById(int id);
    public void deleteClassById(int id);
    public void updateClass(ClassUpdateRequest classUpdateRequest);
}
