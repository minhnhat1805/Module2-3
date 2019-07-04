package com.project.employee_backend.service.Impl;

import com.project.employee_backend.dto.EmployeeDTO;
import com.project.employee_backend.entity.Employee;
import com.project.employee_backend.repository.EmployeeRepository;
import com.project.employee_backend.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> findAllByDeletedIsFalse() {
        List<Employee> employees = employeeRepository.findAllByDeletedIsFalse();
        return employees;
    }

    @Override
    public void save(EmployeeDTO employeeDTO) {
        Employee employee =new Employee();
        employee.setName(employeeDTO.getName();
        employee.setAddress(employeeDTO.getAddress());
        employee.setBirthday(employeeDTO.getBirthday());
        employee.setEmail(employeeDTO.getEmail());
        employee.setGender(employeeDTO.getGender());
        employee.setCode(employeeDTO.getCode());
        employee.setDeleted(Boolean.FALSE);
        employeeRepository.save(employee);

    }

    @Override
    public void update(EmployeeDTO employeeDTO) {
        Employee employee = employeeRepository.findById(employeeDTO.getId()).orElse(null);
        employee.setName(employeeDTO.getName();
        employee.setAddress(employeeDTO.getAddress());
        employee.setBirthday(employeeDTO.getBirthday());
        employee.setEmail(employeeDTO.getEmail());
        employee.setGender(employeeDTO.getGender());
        employee.setCode(employeeDTO.getCode());
        employeeRepository.save(employee);

    }

    @Override
    public EmployeeDTO findById(String id) {
        Employee employee = employeeRepository.findById(id).orElse(null);
        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setId(employee.getId());
        employeeDTO.setAddress(employee.getAddress());
        employeeDTO.setBirthday(employee.getBirthday());
        employeeDTO.setCode(employee.getCode());
        employeeDTO.setEmail(employee.getEmail());
        employeeDTO.setGender(employee.getGender());
        employeeDTO.setName(employee.getName());
        return employeeDTO;

    }

    @Override
    public void delete(String id) {
        Employee employee = employeeRepository.findById(id).orElse(null);
        employee.setDeleted(Boolean.TRUE);
        employeeRepository.save(employee);

    }
}
