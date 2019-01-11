package com.cg.app.employee.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.cg.app.employee.Employee;

public class EmployeeDaoImpl {
private JdbcTemplate jdbcTemplate=new JdbcTemplate();
public void insertEmployee(Employee employee) {
	jdbcTemplate.batchUpdate(sql)
	
}
}
