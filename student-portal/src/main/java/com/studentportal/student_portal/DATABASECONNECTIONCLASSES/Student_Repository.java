package com.studentportal.student_portal.DATABASECONNECTIONCLASSES;

import com.studentportal.student_portal.EntityClasses.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Student_Repository extends JpaRepository<Student,Integer> {

    Student findByEmail(String email);

    boolean existsByEmail(String email);
}
