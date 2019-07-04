package com.codegym.personel_crm.controller;

import com.codegym.personel_crm.model.Student;
import com.fasterxml.jackson.databind.util.ArrayIterator;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
@Controller
public class StudentController {
    private static  Iterable<Student> students= new ArrayList<Student>();
}
