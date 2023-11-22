package com.SpringEmployee.demo.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringEmployee.demo.Model.Employee;
import com.SpringEmployee.demo.Model.User;
import com.SpringEmployee.demo.Repository.UserRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class UserController 
{
	@Autowired
	UserRepository repo;
	
	@GetMapping("/users")
	public List<User> getAllUsers()
	{
		return repo.findAll();
		  

		
	}
	@PostMapping("/register")
	public ResponseEntity<Map<String, String>> register(@RequestBody User user) {
	    repo.save(user);
	    
	    // Create a response map with a success message
	    Map<String, String> response = new HashMap<>();
	    response.put("message", "Registration successful!");

	    return ResponseEntity.ok(response);
	}
	
	@PostMapping("/login")
	public ResponseEntity<Map<String, String>> login(@RequestBody User user) {
	    System.out.println("Received login request for username: " + user.getUsername());
	    System.out.println("Received password: " + user.getPassword());
	    User existingUser = repo.findByUsername(user.getUsername());

	    if (existingUser != null && existingUser.getPassword().equals(user.getPassword())) {
	        return ResponseEntity.ok(Map.of("status", "success", "message", "Login successful!"));
	    } else {
	        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(Map.of("status", "error", "message", "Invalid login credentials"));
	    }
	}
	






}