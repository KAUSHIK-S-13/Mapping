package com.onetoone.mapping.Repository;

import com.onetoone.mapping.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
