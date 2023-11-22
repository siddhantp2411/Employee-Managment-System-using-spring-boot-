package com.SpringEmployee.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringEmployee.demo.Model.Department;


public interface DepartmentRepository extends JpaRepository<Department, Integer>
{

	List<Department> findBydeptName(String deptName);

}
