package com.example.person_crm.controller;

import java.util.ArrayList;
import java.util.List;

import com.example.person_crm.model.Student;

import com.example.person_crm.service.StudentService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class StudentController {
    private StudentService studentService;

    private static List<Student> students = new ArrayList<Student>();

    // Được tiêm vào (inject) từ application.properties.
    @Value("${welcome.message}")
    private String message;

    @Value("${error.message}")
    private String errorMessage;

   @GetMapping("/index")
    private  ModelAndView index(){
       ModelAndView modelAndView= new ModelAndView("index");
       modelAndView.addObject("message",message);
       return modelAndView;
   }
   @GetMapping("/studentList")
    private  ModelAndView List(){
       ModelAndView modelAndView = new ModelAndView("studentList");
       modelAndView.addObject("students",students);
       return modelAndView;
   }
   @GetMapping("/addStudent")
    public  ModelAndView showCreate(){
       ModelAndView modelAndView = new ModelAndView("addStudent");
       modelAndView.addObject("student", new Student());
       return modelAndView;
   }
   @PostMapping("/addStudent")
    public ModelAndView createStudent(@ModelAttribute("student") Student student){
       ModelAndView modelAndView;
       if (student == null){
           modelAndView = new ModelAndView("/addStudent");

      }
       else{
           studentService.save(student);
           modelAndView = new ModelAndView("/studentList");
           modelAndView.addObject("student",student);
       }
       return modelAndView;
   }
}
