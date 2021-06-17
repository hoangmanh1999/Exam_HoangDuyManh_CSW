package com.example.hoangduymanh.controller;

import com.example.hoangduymanh.entity.EmployeeEntity;
import com.example.hoangduymanh.model.BaseReponse;
import com.example.hoangduymanh.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
@Autowired
    EmployeeService service;

@GetMapping
public BaseReponse getemployee(@RequestParam Map<String,String> all){
    BaseReponse res=new BaseReponse();
    res.data=service.getAll();
    return  res;
}
@PostMapping
    public BaseReponse createEmployee(@RequestBody EmployeeEntity e) {
    BaseReponse res = new BaseReponse();
    res.data = service.create(e);
    return res;
}
@PutMapping
        public BaseReponse updateEmployee(@RequestBody EmployeeEntity e){
              BaseReponse res=new BaseReponse();
               if(e!=null){
                   res.data=service.update(e);
               }
               else {
                   res.status = 500;
                   res.message = "Update false";
                   res.data = "";
               }
              return res;
    }
}

