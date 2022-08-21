package com.example.springboot.Repository;

import com.example.springboot.Constant.Major;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClassRepository extends JpaRepository<Class,Integer> {
    public Optional<Class> findClassByMajor(Major major);
}
