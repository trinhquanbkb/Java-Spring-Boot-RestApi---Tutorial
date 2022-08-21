package com.example.springboot.Entity;


import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.security.Timestamp;

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
    private Class class;

    @Column(name="create_at", columnDefinition = "TIMESTAMP")
    @CreationTimestamp
    private Timestamp createAt;

    @Column(name="update_at", columnDefinition = "TIMESTAMP")
    @CreationTimestamp
    private Timestamp updateAt;

    @Column(name="mssv")
    private String mssv;

    public Student(int id, String nameStudent, Timestamp createAt, Timestamp updateAt, String mssv) {
        this.id = id;
        this.nameStudent = nameStudent;
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

    public Timestamp getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Timestamp createAt) {
        this.createAt = createAt;
    }

    public Timestamp getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Timestamp updateAt) {
        this.updateAt = updateAt;
    }

    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }
}
