package com.example.demo.newentity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Email;

@Entity
@Table(name="Student")
public class StudentValidation{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message="No spaces")
    private String name;
    @Column(name=unique)
    @NotBlank(message="no blank allowed")
    @Email(message="invalid format")
    private String email;

    
    public StudentValidation(Long id, @NotBlank(message = "No spaces") String name,
            @NotBlank(message = "no blank allowed") @Email(message = "invalid format") String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    
    public StudentValidation() {
    }


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    
}