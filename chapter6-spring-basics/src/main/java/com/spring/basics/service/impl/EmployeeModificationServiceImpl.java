package com.spring.basics.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.spring.basics.annotion.MethodRunningTime;
import com.spring.basics.dao.EmployeeModificationDAO;
import com.spring.basics.service.EmployeeModificationService;

@Component
@Scope(value = "prototype")
public class EmployeeModificationServiceImpl implements EmployeeModificationService {

	@Autowired
	private EmployeeModificationDAO employeeModificationDAO;
	
	
	@MethodRunningTime(active = true)
	@Override
	public boolean save(String record) {
		
		return employeeModificationDAO.save(record);
	}

	@MethodRunningTime(active = true)
	@Override
	public boolean update(String record, Long id) {
		
		return employeeModificationDAO.update(record, id);
	}

	@MethodRunningTime(active = true)
	@Override
	public boolean delete(Long id) {
		
		return employeeModificationDAO.delete(id);
	}

}
