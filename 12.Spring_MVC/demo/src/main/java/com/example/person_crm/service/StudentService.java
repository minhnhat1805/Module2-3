package com.example.person_crm.service;

import com.example.person_crm.model.Student;

import java.util.List;

public interface StudentService {
    Iterable<Student> findAll();
    Student findById(Long id);
    void save(Student student);
    void remove(Long id);
}
