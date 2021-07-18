package com.alok.service;

import com.alok.entity.Student;
import com.alok.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Service
@Slf4j
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public Student createStudent(Student student) {
      student.getSubjects().forEach(input-> log.info("{}", input.getSubjectName(), "{}", input.getMarksObtained() ));
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(String id) {
        Optional<Student> student = Optional.ofNullable(studentRepository.findById(id))
                .orElseThrow(() -> new RuntimeException("student not found by given id " + id));
        return student.get();
    }
}
