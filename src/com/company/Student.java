package com.company;

import java.util.Date;

public class Student {
    private String name;
    private String studentId;
    private Date birthDate;
    private String address;
    private String major;
    private double mark;

    public Student() {
    }

    public Student(String name, String studentId, Date birthDate, String address, String major, double mark) {
        this.name = name;
        this.studentId = studentId;
        this.birthDate = birthDate;
        this.address = address;
        this.major = major;
        this.mark = mark;
    }

    public void printAllAttributes() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + studentId);
        System.out.println("DoB: " + birthDate.getDate() + "-" + (birthDate.getMonth() + 1) + "-" + birthDate.getYear());
        System.out.println("Address: " + address);
        System.out.println("major: " + major);
        System.out.println("Mark: " + mark);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
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

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }
}
