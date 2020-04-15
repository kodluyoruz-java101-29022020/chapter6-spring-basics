package com.spring.basics.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.spring.basics.annotion.MethodRunningTime;
import com.spring.basics.dao.EmployeeModificationDAO;
import com.spring.basics.service.EmployeeModificationService;

@Service
@Scope(value = "prototype")
public class EmployeeModificationServiceImpl implements EmployeeModificationService {

	@Autowired
	@Qualifier("employeeModificationDAOImpl")
	private EmployeeModificationDAO employeeModificationDAO;
	
	
	@Autowired
	@Qualifier("employeeModificationDraftDAOImpl")
	private EmployeeModificationDAO employeeModificationDraftDAO;
	
	
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
