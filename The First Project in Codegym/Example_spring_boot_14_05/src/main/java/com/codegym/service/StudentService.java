package com.codegym.service;

import com.codegym.dto.StudentDTO;
import com.codegym.entity.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface StudentService {
    Page<Student> findAllByDeletedIsFalse(Pageable pageable);
    void save(StudentDTO studentDTO);
    StudentDTO findById(String id);
    void update(StudentDTO studentDTO);
    void  delete(String id);

}
