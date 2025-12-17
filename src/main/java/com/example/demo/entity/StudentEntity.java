package com.example.demo.entity;
import jakarta.persistence.Entity;

@Entity
public class StudenEntity{
    private int id;
    private String name;
    private String email;
    private float cgpa;
}