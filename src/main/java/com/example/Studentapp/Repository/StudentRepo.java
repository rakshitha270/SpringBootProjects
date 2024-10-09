package com.example.Studentapp.Repository;


import com.Studentapp.Studentapp.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Integer> {

}