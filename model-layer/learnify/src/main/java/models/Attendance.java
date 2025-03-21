package com.example.learnify.models;

import com.example.learnify.helpers.AttendanceType;

import java.util.Date;

public class Attendance {
    private Integer attendanceId;
    private Date date;
    private AttendanceType attendanceType;

    public Attendance() {
    }

    public Attendance(Integer attendanceId, Date date, AttendanceType attendanceType) {
        this.attendanceId = attendanceId;
        this.date = date;
        this.attendanceType = attendanceType;
    }

    public Integer getAttendanceId() {
        return attendanceId;
    }

    public void setAttendanceId(Integer attendanceId) {
        this.attendanceId = attendanceId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public AttendanceType getAttendanceType() {
        return attendanceType;
    }

    public void setAttendanceType(AttendanceType attendanceType) {
        this.attendanceType = attendanceType;
    }
}

