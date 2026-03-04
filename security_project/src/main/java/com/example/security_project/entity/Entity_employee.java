package com.example.security_project.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@jakarta.persistence.Entity
@Table(name="employe")
public class Entity_employee {


        @Id
        @GeneratedValue(strategy= GenerationType.IDENTITY)
        @Column(nullable = false)
        private  Integer employee_id;

        @Column(nullable = false)
        private String name;


        @Column(nullable = false)
        private String email;

        @Column(nullable = false)
        private Long salary;

        @Column(nullable = false)
        private String department;

        @CreationTimestamp
        @Column(nullable = false)
        private Instant created_at;

        @Column(nullable = true)
        private String  created_by;

        @UpdateTimestamp
        @Column(nullable = false)
        private Instant updated_at;

        @Column(nullable = true)
        private String   updated_by;
    }


