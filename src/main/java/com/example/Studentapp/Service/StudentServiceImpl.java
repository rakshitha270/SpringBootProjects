package com.example.Studentapp.Service;

import com.Studentapp.Studentapp.entity.Student;
import com.Studentapp.Studentapp.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    StudentRepo repo;


    public void addStudent(Student std) {
        repo.save(std);

    }



    public Student getStudent(int roll) {
        Student std=repo.findById(roll).get();
        return std;
    }




    public List<Student> getAllStudents() {
        List<Student>stdlist=repo.findAll();
        return stdlist;
    }




    public void updateStudent(Student std) {
        repo.save(std);

    }




    public void deleteStudent(int roll) {
        repo.deleteById(roll);

    }

}
