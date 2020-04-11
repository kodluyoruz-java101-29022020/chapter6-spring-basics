package com.spring.basics.dao;

public interface EmployeeModificationDAO {

	public boolean save(String record);
	public boolean update(String record, Long id);
	public boolean delete(Long id);
}
