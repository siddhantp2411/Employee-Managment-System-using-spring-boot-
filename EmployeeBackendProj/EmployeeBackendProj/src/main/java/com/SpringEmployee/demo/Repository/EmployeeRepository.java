package com.SpringEmployee.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringEmployee.demo.Model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>
{
	List<Employee> findByFirstName(String firstName);

}
