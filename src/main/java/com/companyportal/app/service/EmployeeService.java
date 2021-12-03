package com.companyportal.app.service;

import java.util.List;

import com.companyportal.app.entity.Employee;

/**
 * The Interface EmployeeService.
 */
public interface EmployeeService {

	/**
	 * Save employee data.
	 *
	 * @param employee the employee
	 */
	public void saveEmployeeData(Employee employee);

	/**
	 * Gets the employees data.
	 *
	 * @return the employees data
	 */
	public List<Employee> getEmployeesData();

	/**
	 * Update employee data.
	 *
	 * @param employee the employee
	 */
	void updateEmployeeData(Employee employee);

	/**
	 * Gets the employee by id.
	 *
	 * @param id the id
	 * @return the employee by id
	 */
	public Employee getEmployeeById(int id);

	/**
	 * Delete employee data.
	 *
	 * @param employee the employee
	 */
	void deleteEmployeeData(int employee);

}
