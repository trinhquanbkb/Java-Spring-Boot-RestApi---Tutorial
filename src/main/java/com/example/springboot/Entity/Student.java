package com.example.springboot.Entity;


import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Xác định khóa chính
    private int id;

    @Column(name="name_student")
    private String nameStudent;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="class_id", nullable=false, referencedColumnName = "id") //xác định trường class là trường map đến qua id
    @OnDelete(action = OnDeleteAction.CASCADE)
    private ClassInfo classInfo;

    @Column(name="create_at", columnDefinition = "DATE")
    private Date createAt;

    @Column(name="update_at", columnDefinition = "DATE")
    private Date updateAt;

    @Column(name="mssv")
    private String mssv;

    public Student(int id, String nameStudent, ClassInfo classInfo, Date createAt, Date updateAt, String mssv) {
        this.id = id;
        this.nameStudent = nameStudent;
        this.classInfo = classInfo;
        this.createAt = createAt;
        this.updateAt = updateAt;
        this.mssv = mssv;
    }

    public Student(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public ClassInfo getClassInfo() {
        return classInfo;
    }

    public void setClassInfo(ClassInfo classInfo) {
        this.classInfo = classInfo;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }
}
