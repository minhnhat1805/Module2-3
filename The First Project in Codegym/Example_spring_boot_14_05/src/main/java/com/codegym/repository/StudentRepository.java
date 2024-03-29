package com.codegym.repository;

import com.codegym.entity.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student ,String> {
    Page<Student> findAllByDeletedIsFalse(Pageable pageable);
}
