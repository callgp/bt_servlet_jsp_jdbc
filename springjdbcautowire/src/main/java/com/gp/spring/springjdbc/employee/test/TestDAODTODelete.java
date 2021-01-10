package com.gp.spring.springjdbc.employee.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.gp.spring.springjdbc.employee.dao.EmployeeDAO;
import com.gp.spring.springjdbc.employee.dto.Employee;
public class TestDAODTODelete {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/gp/spring/springjdbc/employee/test/config.xml");
		EmployeeDAO empDao = (EmployeeDAO) context.getBean("employeeDao");
	//Employee employee;
		//	String sql = "insert into employee values(?,?,?)";
		//int result = jdbcTemplate.update(sql, new Integer(2), "ff2", "ll2");
		Employee employee = new Employee();
	/*	employee.setId(3);
		employee.setFirstname("newnewnew");
		employee.setLastname("lnlnln");*/
		int result = empDao.delete(3);
		System.out.println("Number of records deleted are: " + result);
	}

}
