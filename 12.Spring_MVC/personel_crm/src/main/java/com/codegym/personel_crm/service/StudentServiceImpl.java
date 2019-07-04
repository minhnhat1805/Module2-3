package com.codegym.personel_crm.service;

import com.codegym.personel_crm.model.Student;
import com.codegym.personel_crm.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;

public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentRepository studentRepository;

    public StudentServiceImpl() {
    }

    @Override
    public String toString() {
        return "StudentServiceImpl{}";
    }

    @Override
    public Iterable<Student> findAll(Pageable pageable) {
        return studentRepository.findAll(pageable);
    }

    @Override
    public Student findById(Long id) {
        return null;
    }

    @Override
    public void save(Student student) {

    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public Iterable<Student> findAllByStudent(Student student) {
        return null;
    }
}
