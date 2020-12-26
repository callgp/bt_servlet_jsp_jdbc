package com.gp.springcore.interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient implements InitializingBean, DisposableBean {
	
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
		System.out.println("destroy interaface");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("in afterPropertiesSet");
		
	}
	
	

}
