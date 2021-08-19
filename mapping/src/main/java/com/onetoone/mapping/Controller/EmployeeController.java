package com.onetoone.mapping.Controller;

import com.onetoone.mapping.Repository.EmployeeRepository;
import com.onetoone.mapping.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping("/saveEmployees")
    public ResponseEntity<String> saveEmployees(@RequestBody List<Employee> empdata){
        employeeRepository.saveAll(empdata);
        return ResponseEntity.ok("data saved");
    }
}
