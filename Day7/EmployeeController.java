package com.cts.training.controller;

import java.util.List;
import java.util.Scanner;

import com.cts.training.bean.Employee;
import com.cts.training.dao.EmployeeDAO;
import com.cts.training.dao.impl.EmployeeDAOImpl;


public class EmployeeController {

	public static void main(String[] args) {
		EmployeeDAO empObj= new EmployeeDAOImpl();
//		Employee employee = new Employee(6,"Harshita","Indore", 22 , 879963210,"Developer" , 20000);
//		empObj.saveEmployee(employee);
		Employee employee = new Employee();
		empObj.updateEmployee(employee);
		
		Employee emp = empObj.getEmployeeById(2);
		System.out.println(emp);
//		List<Employee> list = empObj.getAllEmployees();
//		list.forEach(System.out::println);
	}
}