package com.SpringEmployee.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringEmployee.demo.Model.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long>
{
	User findByUsername(String username);
	
}
