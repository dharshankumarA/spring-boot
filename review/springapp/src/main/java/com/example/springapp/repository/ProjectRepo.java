package com.example.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springapp.model.Project;


public interface ProjectRepo extends JpaRepository<Project,Integer>{

    
}