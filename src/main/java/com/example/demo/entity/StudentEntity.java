package com.example.demo.entity;

import jakarta.persistence.entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.util.Date;

@entity

public class StudentEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
private Integer id;
private String name;
private String email;
private String password;
private Date created;
public Date getCreated(){
    return Created;
}
public void setCreated(Date created){
    this.created=created;
}

public Integer getId(){
    return id;
}

public void setId(Integer id){
    this.id=id;
}
public String getName(){
    return name;
}
public void setName(String Name){
    this.name=name;
}
public String getEmail(){
    return Email;
}
public void setEmail(String email){
    this.email=email;
}
public String getPassword(){
    return password;
}
public void setPassword(String Password){
    this.password=password;
}

public StudentEntity(Integer Id, String name,String email,String password,Date created){
    this.id=id;
    this.name=name;
    this.email=email;
    this.password=password;
    this.date=date;
    
}

               
}