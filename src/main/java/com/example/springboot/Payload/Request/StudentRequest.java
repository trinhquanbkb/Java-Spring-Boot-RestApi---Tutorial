package com.example.springboot.Payload.Request;

public class StudentRequest {
    private String nameStudent;
    private String mssv;
    private String className;

    public StudentRequest(String nameStudent, String mssv, String className) {
        this.nameStudent = nameStudent;
        this.mssv = mssv;
        this.className = className;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
