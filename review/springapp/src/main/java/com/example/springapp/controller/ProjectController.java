package com.example.springapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springapp.model.Project;
import com.example.springapp.repository.ProjectRepo;
@RestController
public class ProjectController {
    @Autowired
    ProjectRepo repo;
    @GetMapping("/Project")
    public List<Project> getAllProjects()
    {
        List<Project> projects =repo.findAll();
        return projects ;
    }
    @GetMapping("/Project/{id}")
    public Project getStudent(@PathVariable int id)
    {
        Project projects  = repo.findById(id).get();
        return projects ;
    }
    @PostMapping("/Project/add")
    public void createStudent(@RequestBody Project projects )
    {
        repo.save(projects );
    }
    @PutMapping("/Project/update/{id}")
    public void updateStudent(@PathVariable int id)
    {
        Project projects = repo.findById(id).get();
        projects. setTitle("Flight ticket Booking");
        projects .setDuration(20);
        projects .setLead("Jaya Altrin");
        repo.save(projects );
    }
    @DeleteMapping("/Project/delete/{id}")
    public void deleteStudent(@PathVariable int id)
    {
        Project projects  = repo.findById(id).get();
        repo.delete(projects);
    }
}