package com.project.employee_backend.service;

import com.project.employee_backend.dto.EmployeeDTO;
import com.project.employee_backend.entity.Employee;

import java.util.List;

public interface EmployeeService {
 List<Employee> findAllByDeletedIsFalse();
 void save(EmployeeDTO employeeDTO);
 void  update(EmployeeDTO employeeDTO);
 EmployeeDTO findById(String id);
 void delete(String id);
}
