package com.example.springboot.Payload.Request;

import com.example.springboot.Constant.Major;

public class ClassRequest {
    private String className;
    private Major major;

    public ClassRequest(String className, Major major) {
        this.className = className;
        this.major = major;
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
