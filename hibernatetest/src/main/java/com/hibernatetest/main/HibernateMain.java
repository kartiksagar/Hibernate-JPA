package com.hibernatetest.main;

import com.hibernatetest.model.EmployeeService;

public class HibernateMain {
	
	public static void main(String[] args) {
		
		EmployeeService employeeService = new EmployeeService();
		employeeService.saveEmployee();
	}

}
