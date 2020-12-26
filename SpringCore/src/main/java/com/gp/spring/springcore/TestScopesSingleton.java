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

package com.gp.spring.springcore;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gp.springcore.annotations.Patient;

public class TestScopesSingleton {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/gp/spring/springcore/pschemaconfig.xml");
		Employee em = (Employee) ctx.getBean("emp");
		System.out.println("Employee : " + em);
		System.out.println("Em hashcode"+em.hashCode());
		
		Employee em2 = (Employee) ctx.getBean("emp");
		System.out.println("Employee : " + em2);
		System.out.println("Em hashcode"+em2.hashCode());
		
		
		//
	//	Employee : com.gp.spring.springcore.Employee@29774679
	//	Employee : com.gp.spring.springcore.Employee@29774679 same value but does not prove but check hashcode to see point to same object..so spring container create one object even though we create 2 times in our code
		
		//if i gave proptotype i got below output
		/*Employee : com.gp.spring.springcore.Employee@29774679
		Em hashcode695682681
		Employee : com.gp.spring.springcore.Employee@3ffc5af1
		Em hashcode1073502961*/
		
/*		if i leave scope detault that is singleton i got correct same output
		Employee : com.gp.spring.springcore.Employee@29774679
		Em hashcode695682681
		Employee : com.gp.spring.springcore.Employee@29774679
		Em hashcode695682681*/
		//System.out.println("Employee Name: " + emp.getName());
		//test ingg
//756pm
		
	/*	AbstractApplicationContext ctx2 = new ClassPathXmlApplicationContext("com/gp/springcore/interfaces/pschemaconfig.xml");
		Employee em1 = (Employee) ctx2.getBean("emp2");
		System.out.println("emp details: " + em1);*/
		
		/*ClassPathXmlApplicationContext ctx2 = new ClassPathXmlApplicationContext("com/gp/spring/springcore/pschemaconfig.xml");
		Employee empl2 = (Employee) ctx2.getBean("emp2");
		System.out.println("Employee ID: " + empl2.getId());
		System.out.println("Employee Name: " + empl2	.getName());*/
	}

}
