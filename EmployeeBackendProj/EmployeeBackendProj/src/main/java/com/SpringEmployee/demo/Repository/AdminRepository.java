package com.SpringEmployee.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringEmployee.demo.Model.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer>
{

}
