package com.example.newservice.impl;
import java.util.*;
import org.springframework.stereotype.Service;
import com.example.demo.newentity.StudentValidation;
import com.example.demo.newrepository.NewStudentRepo;
import com.example.demo.newservice.NewService;
@Service

public class NewServiceImpl implements NewService {
    private final NewStudentRepo rep;
    public NewServiceImpl(NewStudentRepo rep){
        this.rep=rep;
    }

    @Override
    public StudentValidation savedata(StudentValidation newfile){
            return rep.save(newfile);
    }

    @Override
    public StudentValidation getidval(long id){
        return rep.get(id);
    }

    @Override
    public List<StudentValidation> getall(){
        return rep.getall();
    }

    @Override
    public StudentValidation update(Long id,StudentValidation newfile){
        return rep.update(id,newfile);
    }

    @Override
    public void delete(Long id){
            return rep.remove(id);
    }
}