package com.gp.spring.springjdbcautowire;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.gp.spring.springjdbc.employee.dao.EmployeeDAO;
import com.gp.spring.springjdbc.employee.dto.Employee;
public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/gp/spring/springjdbcautowire/config.xml");
		/*JdbcTemplate jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTemplate");
		String sql = "insert into employee values(?,?,?)";
		int result = jdbcTemplate.update(sql, new Integer(2), "ff2", "ll2");
		System.out.println("Number of records inserted are: " + result);*/
		EmployeeDAO dao=(EmployeeDAO) context.getBean("employeeDao");
		List<Employee> readResult = dao.read();
		System.out.println("readResult"+readResult);
		
		
	}

}
