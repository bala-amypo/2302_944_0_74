package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.StudentEntity;
import com.example.demo.services.StudentService;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
public class StudentController {
    @Autowired
    StudentService src;
    @PostMapping("/post")//create
    public StudentEntity postdata(@RequestBody StudentEntity st){
        return src.savedata(st);
    }
    @GetMapping("/get")//read
    public List<StudentEntity> getdata(){
        return src.retdata();
    }
    @GetMapping("/getid/{id}")
    public StudentEntity getIdVal(@PathVariable int id){
        return src.id(id);
    }
     @PutMapping("/update/{id}")
    public StudentEntity updateId(@PathVariable int id,@RequestBody StudentEntity st){
        return src.update(id,st);
    }
    @DeleteMapping("/delete/{id}")
    public StudentEntity deleteId(@PathVariable int id){
        return src.delete(id);

    }

}