package com.alok.controller;


import com.alok.adpater.StudentAdapter;
import com.alok.request.StudentRequestTO;
import com.alok.response.StudentResponseTO;
import com.alok.service.StudentService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/v1/api/student")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Slf4j
public class StudentController {

    private final StudentService studentService;
    private final StudentAdapter studentAdapter;
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<List<StudentResponseTO>> getAllStudent(){
      log.info("receive request to get all student details ");
       return new ResponseEntity<>(studentAdapter.adapt(studentService.getAllStudent()), HttpStatus.OK);
    }

    @PostMapping(value = "/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<StudentResponseTO> createStudent(@Valid @RequestBody StudentRequestTO studentRequestTO){
       log.info("received request to create student ");
       return new ResponseEntity<>(studentAdapter.adapt(studentService.createStudent(studentAdapter.adapt(studentRequestTO))), HttpStatus.CREATED);
    }

    @GetMapping(value = "/getById/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<StudentResponseTO> getStudentById(@PathVariable String id){
        log.info("received request to get student of {} ", id);
        return new ResponseEntity<>(studentAdapter.adapt(studentService.getStudentById(id)), HttpStatus.OK);
    }

}
