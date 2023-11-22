package com.SpringEmployee.demo.Controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringEmployee.demo.Model.Admin;
import com.SpringEmployee.demo.Repository.AdminRepository;

import jakarta.annotation.PostConstruct;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class AdminController 
{
	@Autowired
	AdminRepository repo;
	
	@PostMapping("/admin/login")
    public ResponseEntity<Map<String, String>> adminLogin(@RequestBody Admin admin) {
        // Hardcoding the admin credentials for demonstration purposes
        String expectedUsername = "admin";
        String expectedPassword = "admin";

        // Check if the provided credentials match the hardcoded admin credentials
        if (expectedUsername.equals(admin.getUsername()) && expectedPassword.equals(admin.getPassword())) {
            // Return a success message if credentials are correct
            Map<String, String> response = new HashMap<>();
            response.put("status", "success");
            response.put("message", "Admin login successful");
            return ResponseEntity.ok(response);
        } else {
            // Return an error message if credentials are incorrect
            Map<String, String> response = new HashMap<>();
            response.put("status", "error");
            response.put("message", "Admin not found");
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(response);
        }
    }
}





