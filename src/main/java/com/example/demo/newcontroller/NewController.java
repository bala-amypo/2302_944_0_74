package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.newentity.StudentValidation;
import com.example.demo.newservice.NewService;

@RestController
@RequestMapping("/students")
public class NewController {

    @Autowired
    private NewService src;

    @PostMapping
    public StudentValidation postdata(@RequestBody StudentValidation st) {
        return src.savedata(st);
    }
    @GetMapping
    public List<StudentValidation> getdata() {
        return src.getall();
    }

    @GetMapping("/{id}")
    public StudentValidation getIdVal(@PathVariable Long id) {
        return src.getidval(id);
    }

    @PutMapping("/{id}")
    public StudentValidation updateId(
            @PathVariable Long id,
            @RequestBody StudentValidation st) {
        return src.update(id, st);
    }

    @DeleteMapping("/{id}")
    public void deleteId(@PathVariable Long id) {
        src.delete(id);
    }
}
