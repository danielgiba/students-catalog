package com.danielgiba.studentsystem.service;

import java.util.List;
import com.danielgiba.studentsystem.model.Student;
//post&get in db!
public interface StudentService {
    //saving data in db -> POST
    public Student saveStudent(Student student);
    //take data from db -> GET
    public List<Student> getAllStudents();

}
