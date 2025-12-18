package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.demo.entity.ValidationEntity;
import com.example.demo.service.ValidationService;
import java.util.List;

@RestController
public class ValidationController{
    @Autowired ValidationService ser;
    @PostMapping("/post")
    public ValidationEntity sendData(@RequestBody ValidationEntity entity){
            return ser.postdata(entity);
    }
    @GetMapping("/Get")
    public List<ValidationEntity>getval(){
        return ser.getAllData();
    }
    @DeleteMapping("/delete/{id}")
    public String deleteval(@PathVariable int id){
        return ser.DeleteData(id);
    }
    @GetMapping("/getid/{id}")
    public ValidationEntity getdata(int id){
    return ser.getData(id);
    }
    @PutMapping("/put/{id}")
    public ValidationEntity putval(@PathVariable int id,@RequestBody ValidationEntity entity ){
        return ser.updateData(id,entity);
    }
}


