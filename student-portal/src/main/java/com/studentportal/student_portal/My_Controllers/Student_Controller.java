package com.studentportal.student_portal.My_Controllers;

import com.studentportal.student_portal.DATABASECONNECTIONCLASSES.Student_Service;
import com.studentportal.student_portal.EntityClasses.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
public class Student_Controller {
    @Autowired
    Student_Service student_service;
    @PostMapping("/student_register")
    public String addStudent(@ModelAttribute("add_Student") Student student,Model model) {
        System.out.println(student.getPassword());
        System.out.println(student.getCpassword());
        if (student!=null && student.getPassword().equals(student.getCpassword())) {
            boolean b = student_service.addStudent(student);
            if (b) {
                model.addAttribute("msg", "Congratulations! You have successfully Registered!");
                return "index";
            }
            model.addAttribute("msg", "Sorry you are already registered!");
            return "index";
        }
        model.addAttribute("msg", "Sorry passwords don't match!");
        return "index";
    }


    @PostMapping("/login_student")
    public String logged(@ModelAttribute("logged") Student student , Model model){
        boolean b=student_service.findByEmail(student.getEmail(),student.getPassword());
        if(b){
            model.addAttribute("logged", new Student());

            return "Dashboard";
        }
        return "index";
    }

}
