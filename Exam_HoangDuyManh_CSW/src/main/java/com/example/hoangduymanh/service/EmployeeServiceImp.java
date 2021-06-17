package com.example.hoangduymanh.service;

import com.example.hoangduymanh.entity.EmployeeEntity;
import com.example.hoangduymanh.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImp implements EmployeeService{

    @Autowired
    EmployeeRepo repop;

    @Override
    public List<EmployeeEntity> getAll() {
        return repop.findAll();
    }

    @Override
    public EmployeeEntity create(EmployeeEntity e) {
        EmployeeEntity save = repop.save(e);
        return save;
    }

    @Override
    public EmployeeEntity update(EmployeeEntity e) {

        EmployeeEntity emp=repop.save(e);
        return emp;
    }
}
