package com.example.Studentapp.Service;


import com.Studentapp.Studentapp.entity.Student;

import java.util.List;

public interface StudentService {

    public void addStudent(Student std);

    public Student getStudent(int roll);

    public List<Student> getAllStudents();

    public void updateStudent(Student std);

    public void deleteStudent(int roll);
}