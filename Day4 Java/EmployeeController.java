package com.cts.training.controller;

import java.util.List;
import java.util.Scanner;

import com.cts.training.bean.Employee;
import com.cts.training.dao.impl.EmployeeDAOImpl;
;

public class EmployeeController {

	public static void main(String[] args) {
		EmployeeDAOImpl empObj = new EmployeeDAOImpl();
		System.out.println("Enter id :");
		Scanner sc = new Scanner(System.in);
	int id = sc.nextInt();
		System.out.println("Enter your choice");
		System.out.println("select your option");
		System.out.println("1.Add Employee");
		System.out.println("2.Update Employee");
		System.out.println("3.Remove Employee");
		System.out.println("4.Get emp by id");
		System.out.println("5.Display all");
		System.out.println("6.Exit");
	
		Scanner sc1 = new Scanner (System.in);
		int choice= sc1.nextInt();	
	
		switch(choice)
		{
//		case 1: Employee em1= (Employee) empObj.addEmployee(id);
//			break;
		case 2: 
			Employee em= empObj.updateEmployee(id);
			break;	
		case 3: Employee em2= (Employee) empObj.deleteEmployee(id);
				break;
		case 4: Employee em3 = empObj.getEmployeeById(id);
				break;
		case 5 : Employee em4= (Employee) empObj. getAllEmployees(); 
				break;
		default:System.out.println("Invalid Input");  
		
		}

		List<Employee> list = empObj.getAllEmployees();
		 list.forEach(System.out::println);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*EmployeeDAOImpl empObj = new EmployeeDAOImpl();
		Employee emp = new Employee(111, "Disha", "Bhopal", "Digital Engineer", 22, 46566.77, 46546656L);
		empObj.addEmployee(emp);
	System.out.println("Enter id :");
		Scanner sc = new Scanner(System.in);
	int id = sc.nextInt();
			Employee em= empObj.getEmployeeById(id);
	System.out.println(em);
		
			System.out.println("Delete operation");
		 empObj.deleteEmployee(em);
		
			System.out.println("Update operation");
		Employee em1= empObj.getEmployeeById(id)
			empObj.updateEmployee(em);
		 
		
			
			 
		 //list.forEach(System.out::println);
	List<Employee> list = empObj.getAllEmployees();
		 list.forEach(System.out::println);
	}
*/
}
}
