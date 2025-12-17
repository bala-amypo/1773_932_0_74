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

    public StudentEntity(Long id,String name,String email,float cgpa){
        this.id = id;
        this.name = name;
        this.email = email;
        this.cgpa = cgpa;
    }
    public StudentEntity(){
        
    }

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
    public void setCgpa(float cgpa){
        this.cgpa=cgpa;
    }
    public float getCgpa(){
        return this.cgpa;
    }
}