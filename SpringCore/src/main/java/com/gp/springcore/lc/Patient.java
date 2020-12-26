package com.gp.springcore.lc;

public class Patient {
	
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("in setter");
		this.id = id;
	}
	
	
	public void init(){
		System.out.println("init");
	}
	
	public void destroy(){
		System.out.println("destroy");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}
	
	

}
