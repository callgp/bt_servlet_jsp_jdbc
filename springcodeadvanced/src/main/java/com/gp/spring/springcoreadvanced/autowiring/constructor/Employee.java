package com.gp.spring.springcoreadvanced.autowiring.constructor;

public class Employee {



	public Employee(Address address) {
		super();
		this.address = address;
	}
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
