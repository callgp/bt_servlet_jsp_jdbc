package com.gp.spring.springjdbc.employee.dto;

public class Employee {
	
	private int id;
	private String lastname;
	private String firstname;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", lastname=" + lastname + ", firstname=" + firstname + "]";
	}
		

}
