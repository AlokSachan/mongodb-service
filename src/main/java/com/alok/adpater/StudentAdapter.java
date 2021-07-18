package com.alok.adpater;

import com.alok.entity.Department;
import com.alok.entity.Student;
import com.alok.entity.Subject;
import com.alok.request.StudentRequestTO;
import com.alok.response.StudentResponseTO;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class StudentAdapter {
    public List<StudentResponseTO> adapt(List<Student> students) {
        return Optional.ofNullable(students).orElseGet(Collections::emptyList)
                .stream()
                .map(student-> convertIntoStudentResponseTo(student))
                .collect(Collectors.toList());
    }

    private StudentResponseTO convertIntoStudentResponseTo(Student student) {
        return StudentResponseTO.builder()
                .id(student.getId())
                .name(student.getName())
                .email(student.getEmail())
                .department(student.getDepartment())
                .subjects(student.getSubjects())
                .build();
    }

    public StudentResponseTO adapt(Student student) {
        return StudentResponseTO.builder()
                .id(student.getId())
                .name(student.getName())
                .email(student.getEmail())
                .department(student.getDepartment())
                .subjects(student.getSubjects())
                .build();
    }

    public Student adapt(StudentRequestTO studentRequestTO) {
        return Student.builder()
                .name(studentRequestTO.getName())
                .email(studentRequestTO.getEmail())
                .department(Department.builder().departmentName(studentRequestTO.getDepartment().getDepartmentName())
                .location(studentRequestTO.getDepartment().getLocation()).build())
                .subjects(setSubjects(studentRequestTO))
                .build();
    }

    private List<Subject> setSubjects(StudentRequestTO studentRequestTO) {
        return studentRequestTO.getSubjects()
                .stream()
                .map(input-> {
                  Subject subject = new Subject();
                  subject.setSubjectName(input.getSubjectName());
                  subject.setMarksObtained(input.getMarksObtained());
                  return subject;
                }).collect(Collectors.toList());
    }

}
