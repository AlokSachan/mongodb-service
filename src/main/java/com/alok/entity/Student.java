package com.alok.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder

@Document(collection = "student")
public class Student {

    @Id
    private String id;
    private String name;
    private String email;
    private Department department;
    private List<Subject> subjects;
}
