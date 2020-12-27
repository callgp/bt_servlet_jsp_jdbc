package com.gp.spring.springcoreadvanced.autowiring.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {



	/*public Employee(Address address) {
		super();
		this.address = address;
	}*/
	@Autowired(required=false)
	@Qualifier("address2")
	private Address address;
	
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [ address=" + address + "]";
	}


}
