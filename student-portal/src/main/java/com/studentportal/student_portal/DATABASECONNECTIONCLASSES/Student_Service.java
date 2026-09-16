package com.studentportal.student_portal.DATABASECONNECTIONCLASSES;

import com.studentportal.student_portal.EntityClasses.Student;

public interface Student_Service {
    boolean addStudent(Student student);

    boolean findByEmail(String email, String password);
//    boolean findByEmail(String Email,String password);
}
