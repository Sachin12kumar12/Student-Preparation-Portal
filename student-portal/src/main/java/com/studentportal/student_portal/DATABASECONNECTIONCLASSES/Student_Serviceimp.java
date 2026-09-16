package com.studentportal.student_portal.DATABASECONNECTIONCLASSES;

import com.studentportal.student_portal.EntityClasses.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Student_Serviceimp implements Student_Service{
    @Autowired
    Student_Repository studentRepository;
    @Override
    public boolean addStudent(Student student) {
        if (studentRepository.existsByEmail(student.getEmail())) {
            return false;
        } else {
            studentRepository.save(student);
           return true;
        }
    }

    @Override
    public boolean findByEmail(String Email,String password) {
        Student student=studentRepository.findByEmail(Email);
        if(student !=null && student.getPassword().equals(password)){
            return true;
        }
        return false;
    }
}
