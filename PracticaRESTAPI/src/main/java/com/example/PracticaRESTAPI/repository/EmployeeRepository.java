package com.example.PracticaRESTAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.PracticaRESTAPI.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}