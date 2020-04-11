package com.spring.basics.service;

public interface EmployeeModificationService {

	public boolean save(String record);
	public boolean update(String record, Long id);
	public boolean delete(Long id);
}
