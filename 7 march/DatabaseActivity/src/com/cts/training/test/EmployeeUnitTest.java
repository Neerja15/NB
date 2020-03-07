package com.cts.training.test;

import static org.junit.Assert.*;


import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.cts.training.bean.Employee;
import com.cts.training.dao.EmployeeDAO;
import com.cts.training.dao.impl.EmployeeDAOImpl;
import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;

public class EmployeeUnitTest {

	
	private static EmployeeDAO employeeDAO;
	private static Employee employee;
	
	@BeforeClass
	
	public static void init()
	{
		employee = new Employee();
		employeeDAO = new EmployeeDAOImpl();
	}
	@Ignore
	@Test
	public void test_add_employee_success() {
		Employee emp = new Employee(2, "Vinay", "Mumbai", 22, 987456210, "Software Programmer", 24415);
		assertEquals(true, employeeDAO.saveEmployee(emp));
	}
	@Ignore
	@Test
	public void test_update_employee_success() {
		EmployeeDAO empObj= new EmployeeDAOImpl();
		Employee employee1 = empObj.getEmployeeById(135);
		employee1.setName("Kratika");
		empObj.updateEmployee(employee1);
		assertEquals(true, employeeDAO.updateEmployee(employee1));
	}
	@Ignore
	@Test
	public void test_delete_success()
	{
		EmployeeDAO empObj= new EmployeeDAOImpl();
		Employee emp = empObj.getEmployeeById(1);
		assertEquals(true, employeeDAO.deleteEmployee(emp));
	}
	@Ignore
	@Test(expected = NullPointerException.class)
	public void test_id_success()
	{
		
		Employee emp = employeeDAO.getEmployeeById(21);
		assertEquals("Vinay",emp.getName() );
	}
	@Ignore
	@Test
	public void test_all_success()
	{
		List<Employee> list =employeeDAO.getAllEmployees();

		//assertEquals("list", employeeDAO.getAllEmployees());
		assertEquals(7, list.size());
		assertEquals("Kratika", list.get(5).getName());
		assertEquals("Mumbai", list.get(5).getAddress());
	}
	@Ignore
	@Test(expected = NullPointerException.class)
	public void test_delete_fail()
	{
		employee = employeeDAO.getEmployeeById(9);
		assertEquals(false, employeeDAO.deleteEmployee(employee));
	}
	@Ignore
	@Test(expected = NullPointerException.class)
	public void test_update_fail()
	{
		employee = employeeDAO.getEmployeeById(5);
		employee.setName("Nirali");
		assertEquals(false, employeeDAO.updateEmployee(employee));
	}
	@Test(expected = MySQLIntegrityConstraintViolationException.class)
	public void test_add_employee_false() {
		Employee emp = new Employee(10, "Vinay", "Mumbai", 22, 987456210, "Software Programmer", 24415);
		assertEquals(false, employeeDAO.saveEmployee(emp));
	}

}
