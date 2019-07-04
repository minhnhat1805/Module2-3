package com.project.employee_backend.repository;

import com.project.employee_backend.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,String> {
    List<Employee> findAllByDeletedIsFalse();
}
