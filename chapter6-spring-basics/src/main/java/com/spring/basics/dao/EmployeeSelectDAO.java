package com.spring.basics.dao;

import java.util.List;

public interface EmployeeSelectDAO {

	public List<String> getAll();
	public String findById(Long id);
}
