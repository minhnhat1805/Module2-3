package com.codegym.service.impl;

import com.codegym.constants.AppConsts;
import com.codegym.dto.StudentDTO;
import com.codegym.entity.Student;
import com.codegym.repository.StudentRepository;
import com.codegym.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Page<Student> findAllByDeletedIsFalse(Pageable pageable) {
        pageable = PageRequest.of(pageable.getPageNumber(),10, Sort.by("name").ascending());
        return studentRepository.findAllByDeletedIsFalse(pageable);
    }

    @Override
    public void save(StudentDTO studentDTO) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(AppConsts.STRING_TO_DATE_FORMAT);
        LocalDate birthday = LocalDate.parse(studentDTO.getBirthday(),formatter);
        Student student = new Student();
        student.setName(studentDTO.getName());
        student.setBirthday(birthday);
        student.setDeleted(Boolean.FALSE);
        studentRepository.save(student);
    }

    @Override
    public StudentDTO findById(String id) {
        Student student = studentRepository.findById(id).orElse(null);
        if(student!=null){
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(AppConsts.STRING_TO_DATE_FORMAT);
            String birthday = student.getBirthday().format(formatter);
            StudentDTO studentDTO = new StudentDTO();
            studentDTO.setId(student.getId());
            studentDTO.setBirthday(birthday);
            studentDTO.setName(student.getName());
            studentDTO.setDeleted(student.isDeleted());
            return studentDTO;
        }
        return null;
    }

    @Override
    public void update(StudentDTO studentDTO) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(AppConsts.STRING_TO_DATE_FORMAT);
        LocalDate birthday =LocalDate.parse(studentDTO.getBirthday(),formatter);
        Student student = studentRepository.findById(studentDTO.getId()).orElse(null);
        student.setName(studentDTO.getName());
        student.setBirthday(birthday);
        studentRepository.save(student);
    }

    @Override
    public void delete(String id) {
        Student student= studentRepository.findById(id).orElse(null);
        student.setDeleted(true);
        studentRepository.save(student);

    }
}
