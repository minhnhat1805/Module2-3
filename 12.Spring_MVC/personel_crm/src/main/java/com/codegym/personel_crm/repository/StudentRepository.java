package com.codegym.personel_crm.repository;

import com.codegym.personel_crm.model.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends PagingAndSortingRepository<Student,Long> {
    Iterable<Student> findAllByStudent(Student student);
}
