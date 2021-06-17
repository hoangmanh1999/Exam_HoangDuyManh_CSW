package com.example.hoangduymanh.repository;

import com.example.hoangduymanh.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<EmployeeEntity,Integer> {

}
