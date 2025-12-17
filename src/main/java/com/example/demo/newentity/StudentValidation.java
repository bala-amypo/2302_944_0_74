package com.example.demo.newentity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Email;


public class StudentValidation{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message="No spaces")
    private String name;
    @NotBlank(message="no blank allowed")
    @Email(message="invalid format")
    private String email;

    
}