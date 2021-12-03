package com.companyportal.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.companyportal.app.dao.EmployeeDao;
import com.companyportal.app.entity.Employee;
import com.companyportal.app.service.EmployeeService;

/**
 * The Class EmployeeServiceImpl.
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

	/** The employee dao. */
	@Autowired
	private EmployeeDao employeeDao;

	/**
	 * Save employee data.
	 *
	 * @param employee the employee
	 */
	@Override
	public void saveEmployeeData(Employee employee) {
		employeeDao.saveEmployeeData(employee);
	}

	/**
	 * Gets the employees data.
	 *
	 * @return the employees data
	 */
	@Override
	public List<Employee> getEmployeesData() {

		return employeeDao.getEmployeesData();
	}

	/**
	 * Delete employee data.
	 *
	 * @param employeeId the employee id
	 */
	@Override
	public void deleteEmployeeData(int employeeId) {
		employeeDao.deleteEmployee(employeeId);
	}

	/**
	 * Update employee data.
	 *
	 * @param employee the employee
	 */
	@Override
	public void updateEmployeeData(Employee employee) {
		employeeDao.updateEmployeeData(employee);
	}

	/**
	 * Gets the employee by id.
	 *
	 * @param id the id
	 * @return the employee by id
	 */
	@Override
	public Employee getEmployeeById(int id) {
		return employeeDao.getEmployeeById(id);
	}

}
