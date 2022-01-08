package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface studentrepository extends JpaRepository <student,Long> {
    default List<student> getstudent(){
       return findAll();}
}
