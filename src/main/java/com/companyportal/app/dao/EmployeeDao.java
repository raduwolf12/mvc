package com.companyportal.app.dao;

import java.util.List;

import com.companyportal.app.entity.Employee;

// TODO: Auto-generated Javadoc
/**
 * The Interface EmployeeDao.
 */
public interface EmployeeDao {

	/**
	 * Save employee data.
	 *
	 * @param employee the employee
	 */
	void saveEmployeeData(Employee employee);

	/**
	 * Gets the employees data.
	 *
	 * @return the employees data
	 */
	List<Employee> getEmployeesData();

	/**
	 * Delete employee.
	 *
	 * @param employeeId the employee id
	 */
	void deleteEmployee(int employeeId);

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
	Employee getEmployeeById(int id);

	/**
	 * Gets the employee by name.
	 *
	 * @param name the name
	 * @return the employee by name
	 */
	Employee getEmployeeByName(String name);
}
