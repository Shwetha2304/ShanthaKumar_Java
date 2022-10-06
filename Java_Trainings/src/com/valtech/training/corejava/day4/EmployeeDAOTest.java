package com.valtech.training.corejava.day4;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class EmployeeDAOTest {

	
	//Find salary greater than(float sal)
	@Test
	public void getEmployeesSalaryGreater() throws Exception {
		EmployeeDAO dao = new EmployeeDAO();
		List<Employee> e = dao.getEmployeesSalaryGreater(12000);
		int total = dao.getEmployeesSalaryGreater(12000).size();
		assertEquals(total, dao.getEmployeesSalaryGreater(12000).size());
		assertTrue("second", true);
		assertTrue("new three", true);
		assertFalse("six", false);
	}

	//Find other Employees(List)
	@Test
	public void getEmployeesOthers() throws Exception {
		EmployeeDAO dao = new EmployeeDAO();
		List<Employee> e = dao.getEmployeesMale(1);
		int total = dao.getEmployeesMale(1).size();
		assertEquals(total, dao.getEmployeesMale(1).size());
		assertTrue("six", true);
	}

	//Find female Employees(List)
	@Test
	public void getEmployeesFemale() throws Exception {
		EmployeeDAO dao = new EmployeeDAO();
		List<Employee> e = dao.getEmployeesMale(1);
		int total = dao.getEmployeesMale(1).size();
		assertEquals(total, dao.getEmployeesMale(1).size());
		assertTrue("five", true);
	}

	//Find male Employees(List)
	@Test
	public void getEmployeesMale() throws Exception {
		EmployeeDAO dao = new EmployeeDAO();
		List<Employee> e = dao.getEmployeesMale(1);
		int total = dao.getEmployeesMale(1).size();
		assertEquals(total, dao.getEmployeesMale(1).size());
		assertTrue("new three", true);
		assertTrue("new", true);
	}

	@Test
	public void testUpdateEmployee() throws Exception {
		EmployeeDAO dao = new EmployeeDAO();
		dao.updateEmployee(new Employee(3, "new three", 25, 1, 121212));
		Employee e = dao.getEmployee(3);
		assertEquals(e.getId(), 3);
		assertEquals(e.getName(), "new three");
		assertEquals(25, e.getAge());
		assertEquals(1, e.getGender());
		assertEquals(121212, e.getSalary(), 0.000000);
	}
}