package com.example.Studentapp.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    int rollno;
    String name;
    String branch;
    int yop;
    public Student() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Student(int rollno, String name, String branch, int yop) {
        super();
        this.rollno = rollno;
        this.name = name;
        this.branch = branch;
        this.yop = yop;
    }
    public int getRollno() {
        return rollno;
    }
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBranch() {
        return branch;
    }
    public void setBranch(String branch) {
        this.branch = branch;
    }
    public int getYop() {
        return yop;
    }
    public void setYop(int yop) {
        this.yop = yop;
    }
    @Override
    public String toString() {
        return "Student [rollno=" + rollno + ", name=" + name + ", branch=" + branch + ", yop=" + yop + "]";
    }

}
