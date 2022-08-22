package com.example.springboot.Entity;


import com.example.springboot.Constant.Major;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "class")
public class ClassInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Xác định khóa chính
    private int id;

    @Column(name = "class_name") //xác định tên cột, cột ở đây là class_name
    private String className;

    @Column(name="major")
    @Enumerated(EnumType.STRING) //Xác định các giá trị có thể nhập vào
    private Major major;  //trong phạm vi các biến của enum Major

    @Column(name="create_at", columnDefinition = "DATE")
    private Date createAt;

    @Column(name="update_at", columnDefinition = "DATE") // định nghĩa cho cột là kiểu thời gian timestamp
    private Date updateAt;

    @OneToMany(mappedBy="class", fetch = FetchType.EAGER) //ánh xạ từ bảng class, bắt buộc lớp nào muốn liên kết với bảng class thì phải định nghĩa class trong nó
    private List<Student> studentList;

    public ClassInfo(int id, String className, Major major, Date createAt, Date updateAt, List<Student> studentList) {
        this.id = id;
        this.className = className;
        this.major = major;
        this.createAt = createAt;
        this.updateAt = updateAt;
        this.studentList = studentList;
    }

    public ClassInfo() {

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

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}
