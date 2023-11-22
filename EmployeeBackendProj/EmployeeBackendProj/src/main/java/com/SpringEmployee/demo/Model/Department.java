package com.SpringEmployee.demo.Model;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
@Data
@Entity
public class Department 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String deptName;
	@Column
	private int noofemployee;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public int getNoofemployee() {
		return noofemployee;
	}
	public void setNoofemployee(int noofemployee) {
		this.noofemployee = noofemployee;
	}
	public Department(int id, String deptName, int noofemployee) {
		super();
		this.id = id;
		this.deptName = deptName;
		this.noofemployee = noofemployee;
	}
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}


	/*@OneToMany
	@JsonIgnoreProperties("dept")
	private List<Employee> employees;*/
}
