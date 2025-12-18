package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.NotNull;

@Entity
public class ValidationEntity{
    @Id
     @GeneratedValue(strategy=GenerationType.IDENTITY)

    private Long id;
    @NotNull
    @size(min=2,max=30,message="must be 2to 10 character")
    private String username;
    @Email(message="Email is not valid")
    private String email;
    @NotNull(message="Password is mandtory")
    @Size(min=8,max=20,message="must be 8 to 10 character")
    private String password;
    @Max(30)
    @Positive(message="Age is in +ve")
    private int age;

public 
}