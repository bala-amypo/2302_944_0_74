package com.example.demo.newservice;
import com.example.demo.newentity.StudentValidation;

public interface NewService{
    StudentValidation savedata(StudentValidation newfile );
    StudentValidation getidval(Long id);
    List<StudentValidation> getall();
    StudentValidation update(long id,)

}