package com.gp.spring.springjdbc.employee.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.gp.spring.springjdbc.employee.dao.EmployeeDAO;
import com.gp.spring.springjdbc.employee.dao.rowmapper.EmployeeRowMapper;
import com.gp.spring.springjdbc.employee.dto.Employee;

public class EmployeeDaoImpl implements EmployeeDAO {
	
	private JdbcTemplate jdbcTemplate;

	@Override
	public int create(Employee employee) {
		String sql = "insert into employee values(?,?,?)";
		int result = jdbcTemplate.update(sql,employee.getId(),employee.getFirstname(),employee.getLastname());
		// TODO Auto-generated method stub
		return result;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int update(Employee employee) {
		String sql = "update employee set firstname=?, lastname=? where id=?";
		int result = jdbcTemplate.update(sql,employee.getFirstname(),employee.getLastname(),employee.getId());
		// TODO Auto-generated method stub
		return result;	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		
		String sql = "delete from employee where id=?";
		int result = jdbcTemplate.update(sql,id);
		// TODO Auto-generated method stub
		//return result;	
		return 0;
	}

	@Override
	public Employee read(int id) {
		// TODO Auto-generated method stub
		
		String sql= "select * from employee where id=?";
		EmployeeRowMapper rowMapper=new EmployeeRowMapper();
		Employee queryForObject = jdbcTemplate.queryForObject(sql, rowMapper,id);
		return queryForObject;
	}

	@Override
	public List<Employee> read() {
		// TODO Auto-generated method stub
		
		String sql= "select * from employee";
		EmployeeRowMapper rowMapper=new EmployeeRowMapper();
		List<Employee> queryList = jdbcTemplate.query(sql, rowMapper);
		return queryList;
	}

}
