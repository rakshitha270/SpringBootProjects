package com.example.Studentapp.Controller;

import com.Studentapp.Studentapp.entity.Student;
import com.Studentapp.Studentapp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class StudentController {

    @Autowired
    StudentService service;

    //create
    @PostMapping("/add")//API End point
    public String addStudent(@RequestBody Student std) {

        service.addStudent(std);

        return "response from student Controller";
    }

    //Read
    @GetMapping("/get")
    public Student getStudent(@RequestParam("roll")int roll) {
        Student std=service.getStudent(roll);
        return std;
    }

    @GetMapping("/getAll")
    public List<Student> getAllStudents() {
        List<Student> stdlist=service.getAllStudents();
        return stdlist;
    }

    @PutMapping("/Update")
    public String updateStudent(@RequestBody Student std) {
        service.updateStudent(std);
        return "Student Updated";
    }

    @DeleteMapping("/delete")
    public String deleteStudent(@RequestParam("roll")int roll) {
        service.deleteStudent(roll);
        return "Student deleted";
    }
}
