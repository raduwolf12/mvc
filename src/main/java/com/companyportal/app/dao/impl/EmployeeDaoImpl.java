package com.companyportal.app.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.companyportal.app.dao.EmployeeDao;
import com.companyportal.app.entity.Employee;

// TODO: Auto-generated Javadoc
/**
 * The Class EmployeeDaoImpl.
 */
@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	/** The session factory. */
	@Autowired
	private SessionFactory sessionFactory;

	/**
	 * Save employee data.
	 *
	 * @param employee the employee
	 */
	@Override
	public void saveEmployeeData(Employee employee) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		session.saveOrUpdate(employee);

		session.getTransaction().commit();
		session.close();
	}

	/**
	 * Gets the employees data.
	 *
	 * @return the employees data
	 */
	@Override
	public List<Employee> getEmployeesData() {

		List<Employee> employees = new ArrayList<Employee>();

		Session session = sessionFactory.openSession();
		session.beginTransaction();

		employees = session.createQuery("From Employee").list();

		session.getTransaction().commit();
		session.close();

		return employees;
	}

	/**
	 * Delete employee.
	 *
	 * @param employeeId the employee id
	 */
	@Override
	public void deleteEmployee(int employeeId) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		session.remove(getEmployeeById(employeeId));

		session.getTransaction().commit();
		session.close();
	}

	/**
	 * Update employee data.
	 *
	 * @param employee the employee
	 */
	@Override
	public void updateEmployeeData(Employee employee) {

		Session session = sessionFactory.openSession();
		session.beginTransaction();

		session.update(employee);

		session.getTransaction().commit();
		session.close();
	}

	/**
	 * Gets the employee by id.
	 *
	 * @param id the id
	 * @return the employee by id
	 */
	@Override
	public Employee getEmployeeById(int id) {
		Employee employee = null;

		Session session = sessionFactory.openSession();
		session.beginTransaction();

		employee = (Employee) session.get(Employee.class, id);

		session.getTransaction().commit();
		session.close();

		return employee;
	}

	/**
	 * Gets the employee by name.
	 *
	 * @param name the name
	 * @return the employee by name
	 * @throws NoResultException the no result exception
	 */
	@Override
	public Employee getEmployeeByName(String name) throws NoResultException {
		Employee employee = null;

		Session session = sessionFactory.openSession();
		session.beginTransaction();

		Query query = session.createQuery("From Employee e where e.name= :ename");
		query.setParameter("ename", name);

		employee = (Employee) query.getSingleResult();

		session.getTransaction().commit();
		session.close();

		return employee;
	}

}
