package com.gp.spring.springjdbc.employee.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.gp.spring.springjdbc.employee.dao.EmployeeDAO;
import com.gp.spring.springjdbc.employee.dto.Employee;
public class TestDAODTOInsert {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/gp/spring/springjdbc/employee/test/config.xml");
		EmployeeDAO empDao = (EmployeeDAO) context.getBean("employeeDao");
	//Employee employee;
		//	String sql = "insert into employee values(?,?,?)";
		//int result = jdbcTemplate.update(sql, new Integer(2), "ff2", "ll2");
		Employee employee = new Employee();
		employee.setId(3);
		employee.setFirstname("firsttt");
		employee.setLastname("lasttt");
		int result = empDao.create(employee);
		System.out.println("Number of records inserted are: " + result);
	}

}
