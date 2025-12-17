package com.example.demo.newentity;

import jakarta.persistence.Id;
import jakarta.validation.constraints

public class StudentValidation{
    @Id
    private Long id;
    @NotBlank
    private String name;
    private String email;
}