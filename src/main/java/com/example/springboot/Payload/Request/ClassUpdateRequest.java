package com.example.springboot.Payload.Request;

import com.example.springboot.Constant.Major;

public class ClassUpdateRequest {
    private int id;
    private String className;
    private Major major;

    public ClassUpdateRequest(int id, String className, Major major) {
        this.id = id;
        this.className = className;
        this.major = major;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Major getMajor() {
        return major;
    }

    public void setMajor(Major major) {
        this.major = major;
    }
}
