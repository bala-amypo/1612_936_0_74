package com.example.demo.service.impl 

import com.example.demo.service.validationservice;
import org.springframework.sterotype.Service;
import com.example.demo.repository.ValidationRepository;
import com.example.demo.entity.ValidationEntity;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class ValidationServiceImpl implements validationservice{
    @Autowired ValidationRepository student;
    @Override
}
