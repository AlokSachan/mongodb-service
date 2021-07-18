package com.alok.service;

import com.alok.entity.Student;
import java.util.List;

public interface StudentService {
    List<Student> getAllStudent();

    Student createStudent(Student student);

    Student getStudentById(String id);
}
