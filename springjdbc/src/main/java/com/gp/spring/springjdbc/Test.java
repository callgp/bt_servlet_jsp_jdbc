package com.gp.spring.springjdbc;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/gp/spring/springjdbc/config.xml");
		JdbcTemplate jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTemplate");
		String sql = "insert into employee values(?,?,?)";
		int result = jdbcTemplate.update(sql, new Integer(2), "ff2", "ll2");
		System.out.println("Number of records inserted are: " + result);
	}

}
