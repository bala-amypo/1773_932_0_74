package com.example.demo.entity;
import jakarta.persistence.Entity;

@Entity
public class StudenEntity{

    @Id
    @GeneratedValue(strategy=GeneratedType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private float cgpa;

    public void student(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getEmail(){
        return this.email;
    }
    public void setcgpa(float cgpa){
        this.cgpa=cgpa;
    }
    public float getcgpa(){
        return this.cg
    }
}