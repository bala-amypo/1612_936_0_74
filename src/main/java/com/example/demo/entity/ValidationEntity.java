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

public Long getId(){
        return id;
    }
    public void setId(Long Id){
        this.id=id;
    }
    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username=username;
    }
     public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }

    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password=password;
    }
     public int getAge(){
        return age;
    }
    public void setAge(String age){
        this.age=age;
    }
public ValidationEntity(Long id,
)
}