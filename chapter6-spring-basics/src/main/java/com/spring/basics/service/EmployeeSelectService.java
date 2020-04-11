package com.spring.basics.service;

import java.util.List;

public interface EmployeeSelectService {

	public List<String> getAll();
	public String findById(Long id);
}
