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

package com.gp.spring.springcore.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gp.spring.springcore.Employee;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/gp/spring/springcore/list/listconfig.xml");
		Hospital hsp = (Hospital) ctx.getBean("hospital");
		System.out.println("Employee ID: " + hsp.getName());
		System.out.println("Employee ID: " + hsp.getDepartments());
		System.out.println("Employee ID: " + hsp.getDepartments().getClass());
		//test ingg
//756pm
	}

}
