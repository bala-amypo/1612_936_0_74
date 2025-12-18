package com.example.demo.Entity;

import java.util.Date;
import jakarta.persistence.Entity;


@Entity
public class ValidationEntity{
    private Long id;
    private String username;
    private String email;
    private String password;
    private int age;

}