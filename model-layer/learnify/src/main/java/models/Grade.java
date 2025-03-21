package com.example.learnify.models;

import java.util.Date;

public class Grade {
    private Integer gradeId;
    private float score;
    private Date evaluationDate;

    public Grade() {
    }

    public Grade(Integer gradeId, float score, Date evaluationDate) {
        this.gradeId = gradeId;
        this.score = score;
        this.evaluationDate = evaluationDate;
    }

    public Integer getGradeId() {
        return gradeId;
    }

    public void setGradeId(Integer gradeId) {
        this.gradeId = gradeId;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public Date getEvaluationDate() {
        return evaluationDate;
    }

    public void setEvaluationDate(Date evaluationDate) {
        this.evaluationDate = evaluationDate;
    }
}
