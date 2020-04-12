package com.spring.basics.console;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.spring.basics.service.EmployeeModificationService;
import com.spring.basics.service.EmployeeSelectService;

@Component
public class ConsoleApplication implements CommandLineRunner {

	@Autowired
	private EmployeeSelectService employeeSelectService;
	
	@Autowired
	private EmployeeSelectService employeeSelectService2;
	
	@Autowired
	private EmployeeSelectService employeeSelectService3;
	
	
	@Autowired
	private EmployeeModificationService employeeModificationService;
	
	@Autowired
	private EmployeeModificationService employeeModificationService2;
	
	@Autowired
	private EmployeeModificationService employeeModificationService3;
	
	
	@Override
	public void run(String... args) throws Exception {
		
		List<String> employees = employeeSelectService.getAll();
		
		System.out.println(employees);
		
		
		employeeSelectService.findById(1L);
		
		employeeModificationService.save("Ahmet");
		
		System.out.println("employeeModificationService address : " + employeeModificationService);
		
		System.out.println("employeeModificationService2 address : " + employeeModificationService2);

		System.out.println("employeeModificationService3 address : " + employeeModificationService3);


		System.out.println("employeeSelectService address : " + employeeSelectService);
		
		System.out.println("employeeSelectService2 address : " + employeeSelectService2);
		
		System.out.println("employeeSelectService3 address : " + employeeSelectService3);
	}

}
