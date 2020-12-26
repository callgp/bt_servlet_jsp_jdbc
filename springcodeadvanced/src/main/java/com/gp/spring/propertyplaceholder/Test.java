	package com.gp.spring.propertyplaceholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gp.spring.constructorinjection_c_schema.Employee;

public class Test {

	public static void main(String[] args) {
		
	
	ApplicationContext ctx = new ClassPathXmlApplicationContext("com/gp/spring/propertyplaceholder/config.xml");
	MyDAO da = (MyDAO) ctx.getBean("mydao");
	//System.out.println("Employee ID: " + da);
	System.out.println(da);
	}
}
