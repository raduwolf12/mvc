package com.companyportal.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * The Class Employee.
 */
@Entity
public class Employee {

	/** The employee id. */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer employeeId;

	/** The name. */
	private String name;

	/** The project. */
	private String project;

	/** The mail id. */
	private String mailId;

	/** The phone no. */
	private String phoneNo;

	/**
	 * Gets the employee id.
	 *
	 * @return the employee id
	 */
	public Integer getEmployeeId() {
		return employeeId;
	}

	/**
	 * Sets the employee id.
	 *
	 * @param employeeId the new employee id
	 */
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the project.
	 *
	 * @return the project
	 */
	public String getProject() {
		return project;
	}

	/**
	 * Sets the project.
	 *
	 * @param project the new project
	 */
	public void setProject(String project) {
		this.project = project;
	}

	/**
	 * Gets the mail id.
	 *
	 * @return the mail id
	 */
	public String getMailId() {
		return mailId;
	}

	/**
	 * Sets the mail id.
	 *
	 * @param mailId the new mail id
	 */
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	/**
	 * Gets the phone no.
	 *
	 * @return the phone no
	 */
	public String getPhoneNo() {
		return phoneNo;
	}

	/**
	 * Sets the phone no.
	 *
	 * @param phoneNo the new phone no
	 */
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
}
