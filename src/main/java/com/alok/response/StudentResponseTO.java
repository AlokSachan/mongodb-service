package com.alok.response;

import com.alok.entity.Department;
import com.alok.entity.Subject;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class StudentResponseTO {

    private String id;
    private String name;
    private String email;
    private Department department;
    private List<Subject> subjects;
}
