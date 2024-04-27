package com.example.springapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name  = "Project_Management")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id ;
    @Column(name = "Project_Title")
    String title;
    @Column(name = "Project_Duration")
    int duration;
    @Column(name = "Project_Lead")
    String Lead;
    
    public Project() {
    }
    public Project(int id, String title, int duration, String lead) {
        this.id = id;
        this.title = title;
        this.duration = duration;
        Lead = lead;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    public String getLead() {
        return Lead;
    }
    public void setLead(String lead) {
        Lead = lead;
    }
    
}