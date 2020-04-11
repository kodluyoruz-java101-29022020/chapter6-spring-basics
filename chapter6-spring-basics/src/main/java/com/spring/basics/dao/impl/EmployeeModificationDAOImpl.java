package com.spring.basics.dao.impl;

import org.springframework.stereotype.Component;

import com.spring.basics.dao.EmployeeModificationDAO;

@Component
public class EmployeeModificationDAOImpl implements EmployeeModificationDAO {

	@Override
	public boolean save(String record) {
		System.out.println(record + " saved!");
		return true;
	}

	@Override
	public boolean update(String record, Long id) {
		System.out.println(record + " updated!");
		return true;
	}

	@Override
	public boolean delete(Long id) {
		System.out.println(id + " record deleted!");
		return false;
	}
}
