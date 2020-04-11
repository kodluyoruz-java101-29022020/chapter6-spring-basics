package com.spring.basics.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.spring.basics.annotion.MethodRunningTime;
import com.spring.basics.dao.EmployeeSelectDAO;
import com.spring.basics.service.EmployeeSelectService;

@Component
@Scope(value = "singleton")
public class EmployeeSelectServiceImpl implements EmployeeSelectService {

	
	@Autowired
	private EmployeeSelectDAO employeeDAO;
	
	
	
	@MethodRunningTime(active = true)
	@Override
	public List<String> getAll() {
		
		return employeeDAO.getAll();
	}

	
	@MethodRunningTime(active = false)
	@Override
	public String findById(Long id) {
		
		return employeeDAO.findById(id);
	}
}
