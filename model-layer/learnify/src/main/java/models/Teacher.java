package com.example.learnify.models;

public class Teacher {
    private Integer teacherId;
    private String specialty;

    public Teacher() {
    }

    public Teacher(Integer teacherId, String specialty) {
        this.teacherId = teacherId;
        this.specialty = specialty;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}
