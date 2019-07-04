package com.codegym.personel_crm.service;

import com.codegym.personel_crm.model.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface StudentService {

    Iterable<Student> findAll(Pageable pageable);
    Student findById(Long id);
    void save(Student student);
    void remove(Long id);
    Iterable<Student> findAllByStudent(Student student);
}
