package com.main;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employess {
	@Id
	private int empId;
	private String empName;
	private String city;
	private String email;
	public Employess() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employess(int empId, String empName, String city, String email) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.city = city;
		this.email = email;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
