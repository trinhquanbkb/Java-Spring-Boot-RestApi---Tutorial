package com.example.springboot.Repository;

import com.example.springboot.Constant.Major;
import com.example.springboot.Entity.ClassInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClassRepository extends JpaRepository<ClassInfo,Integer> {
    public Optional<ClassInfo> findClassByMajor(Major major);
}
