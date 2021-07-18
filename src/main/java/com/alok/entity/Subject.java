package com.alok.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Field;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data

public class Subject {

    @Field(name = "subject_name")
    private String subjectName;
    @Field(name = "marks_obtained")
    private int marksObtained;
}
