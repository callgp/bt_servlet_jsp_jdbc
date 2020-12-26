package com.gp.spring.springcoreadvanced.autowiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {



	/*public Employee(Address address) {
		super();
		this.address = address;
	}*/
	private Address address;
	
	public Address getAddress() {
		return address;
	}
	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [ address=" + address + "]";
	}


}
