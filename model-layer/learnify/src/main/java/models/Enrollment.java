package com.example.learnify.models;

import java.sql.Timestamp;

public class Enrollment {
    private Integer subjectId;
    private Timestamp registrationDate;

    public Enrollment() {
    }

    public Enrollment(Integer subjectId, Timestamp registrationDate) {
        this.subjectId = subjectId;
        this.registrationDate = registrationDate;
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public Timestamp getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Timestamp registrationDate) {
        this.registrationDate = registrationDate;
    }
}
