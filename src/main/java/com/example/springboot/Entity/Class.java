package com.example.springboot.Entity;


import com.example.springboot.Constant.Major;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.security.Timestamp;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "class")
public class Class {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Xác định khóa chính
    private int id;

    @Column(name = "class_name") //xác định tên cột, cột ở đây là class_name
    private String className;

    @Column(name="major")
    @Enumerated(EnumType.STRING) //Xác định các giá trị có thể nhập vào
    private Major major;  //trong phạm vi các biến của enum Major

    @Column(name="create_at", columnDefinition = "TIMESTAMP")
    @CreationTimestamp //Lưu thời gian tại thời điểm insert
    private Timestamp createAt;

    @Column(name="update_at", columnDefinition = "TIMESTAMP") // định nghĩa cho cột là kiểu thời gian timestamp
    @CreationTimestamp //Lưu thời gian tại thời điểm Update
    private Timestamp updateAt;

    @OneToMany(mappedBy="class", fetch = FetchType.EAGER) //ánh xạ từ bảng class, bắt buộc lớp nào muốn liên kết với bảng class thì phải định nghĩa class trong nó
    private List<Student> studentList;

    public Class(int id, String className, Major major, Timestamp createAt, Timestamp updateAt, List<Student> studentList) {
        this.id = id;
        this.className = className;
        this.major = major;
        this.createAt = createAt;
        this.updateAt = updateAt;
        this.studentList = studentList;
    }

    public Class() {

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

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}
