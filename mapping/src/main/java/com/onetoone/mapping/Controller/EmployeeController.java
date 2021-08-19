package com.onetoone.mapping.Controller;

import com.onetoone.mapping.Repository.EmployeeRepository;
import com.onetoone.mapping.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("/employee_detail")
@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping("/addemployees")
    public ResponseEntity<String> saveEmployees(@RequestBody List<Employee> empdata){
        employeeRepository.saveAll(empdata);
        return ResponseEntity.ok("data saved");
    }
    @GetMapping("/all")
    public List<Employee> getAll(){
        return employeeRepository.findAll();
    }
}
