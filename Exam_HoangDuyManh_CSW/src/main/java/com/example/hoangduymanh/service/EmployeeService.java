package com.example.hoangduymanh.service;

import com.example.hoangduymanh.entity.EmployeeEntity;

import java.util.List;

public interface EmployeeService {
    List<EmployeeEntity> getAll();
EmployeeEntity create(EmployeeEntity e);
EmployeeEntity update(EmployeeEntity e);
}
