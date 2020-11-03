/**
 * Desc: Creating Interface as EmployeeService
 * Author Nandhini V
 */
package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public interface EmployeeSevice {
	/*
	 * Methods to be implemented in Service class
	 */
	public void getEmployeeDetails(Employee employee);

	public String FindInsuranceDetails(double salary);

	public void displayDetails(Employee emp);

}
