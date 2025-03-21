package com.example.learnify.models;

import java.util.Date;

public class Student {
    private Integer studentId;
    private Integer grade;
    private Date birthDate;
    private String address;

    public Student() {
    }

    public Student(Integer studentId, Integer grade, Date birthDate, String address) {
        this.studentId = studentId;
        this.grade = grade;
        this.birthDate = birthDate;
        this.address = address;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
