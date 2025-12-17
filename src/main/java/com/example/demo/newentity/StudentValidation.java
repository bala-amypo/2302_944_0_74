package com.example.demo.newentity;

import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

public class StudentValidation{
    @Id
    private Long id;
    @NotBlank(message="No spaces")
    private String name;
    @NotBlank(message="no blank allowed")
    @Email(message)
    private String email;
}