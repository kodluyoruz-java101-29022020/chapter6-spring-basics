package com.spring.basics.dao.impl;

import org.springframework.stereotype.Component;

import com.spring.basics.dao.EmployeeModificationDAO;

@Component("employeeModificationDraftDAOImpl")
public class EmployeeModificationDraftDAOImpl implements EmployeeModificationDAO{

	@Override
	public boolean save(String record) {
		return false;
	}

	@Override
	public boolean update(String record, Long id) {
		return false;
	}

	@Override
	public boolean delete(Long id) {
		return false;
	}

}
