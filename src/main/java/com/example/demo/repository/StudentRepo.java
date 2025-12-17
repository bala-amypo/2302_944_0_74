package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.classes.entity.Studententity;

@Repository
public interface  StudentRepo extends JpaRepository<Studententity,Long>{

}
