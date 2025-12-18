package com.example.demo.entity;

import java.time.LocalDate;

@Entity
public class Studententity {
    @Id
    private int id;
    private String name;
    @Column(name=unique)
    private String email;
    private String role;

    public Studententity( int id, String name, String email, String role) {

        this.id = id;
        this.name = name;
        this.email = email;
        this.role = role;
    }

    public Studententity(){

    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public LocalDate getDob() {
        return dob;
    }
    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public float getCgpa() {
        return cgpa;
    }
    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }
    
}
