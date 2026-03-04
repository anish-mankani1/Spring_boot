package com.example.security_project.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Entity_Dto {


        private  Integer employee_id;
        private String name;
        private String email;
        private Long salary;
        private String department;
        private Instant created_at;
}
