package com.example.springboot.Payload.Request;

public class AddStudent {
    private String nameStudent;
    private String mssv;

    public AddStudent(String nameStudent, String mssv) {
        this.nameStudent = nameStudent;
        this.mssv = mssv;
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
}
