package com.alok.request;

import com.alok.entity.Department;
import com.alok.entity.Subject;
import lombok.*;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Component
public class StudentRequestTO {

    @NotNull(message = "name should not be empty !!!")
    private String name;
    @NotNull(message = "email should not be empty !!!")
    private String email;
    private Department department;
    private List<Subject> subjects;
}
