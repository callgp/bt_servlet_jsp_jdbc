/*package com.bt.spring.SpringCore;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com.bt.spring.SpringCore.config.xml");
		Employee emp = (Employee) ctx.getBean("emp");
		System.out.println("Employee ID: " + emp.getId());
		System.out.println("Employee Name: " + emp.getName());

	}

}

*/

package com.gp.springcore.interfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gp.spring.springcore.Employee;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("com/gp/springcore/interfaces/lcconfig.xml");
		Patient patien = (Patient) ctx.getBean("patient");
		System.out.println("patient details: " + patien);
		//System.out.println("model ID: " + dealr.getModel());
		//System.out.println("set class ID: " + dealr.getModel().getClass());
		//test ingg
//756pm
		ctx.registerShutdownHook();
	}

}
