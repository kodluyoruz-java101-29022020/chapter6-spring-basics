package com.spring.basics.dao.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.basics.dao.EmployeeSelectDAO;

@Repository
public class EmployeeSelectDAOImpl implements EmployeeSelectDAO {

	@Override
	public List<String> getAll() {
		
		return Arrays.asList("Ali", "Mehmet", "Ayşe", "Fatma");
	}

	@Override
	public String findById(Long id) {
		System.out.println(id + " found!");
		return String.valueOf(id);
	}

}
