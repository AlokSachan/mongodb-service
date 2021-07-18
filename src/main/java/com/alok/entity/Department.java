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

public class Department {

    @Field(name = "department_name")
    private String departmentName;
    private String location;

}

