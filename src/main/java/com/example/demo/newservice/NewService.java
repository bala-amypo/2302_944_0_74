package com.example.demo.newservice;
import com.example.demo.newentity.StudentValidation;
import java.util.List;

public interface NewService{
    StudentValidation savedata(StudentValidation newfile );
    StudentValidation getidval(Long id);
    List<StudentValidation> getall();
    StudentValidation update(long id,StudentValidation newfile);
    void delete(long id);

}