package com.companyportal.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.companyportal.app.entity.Employee;
import com.companyportal.app.service.EmployeeService;

/**
 * The Class EmployeeController.
 */
@Controller
public class EmployeeController {

	/** The employee service. */
	@Autowired
	private EmployeeService employeeService;

	/**
	 * Display registration form.
	 *
	 * @param model the model
	 * @return the string
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String displayRegistrationForm(Model model) {
		Employee employee = new Employee();

		model.addAttribute("employee", employee);
		return "employeeform";
	}

	/**
	 * Save employee data.
	 *
	 * @param employee the employee
	 * @return the string
	 */
	@RequestMapping(value = "/saveData", method = RequestMethod.POST)
	public String saveEmployeeData(@ModelAttribute Employee employee) {
		employeeService.saveEmployeeData(employee);

		return "redirect:/employeelist";
	}

	/**
	 * Gets the employees data.
	 *
	 * @param model the model
	 * @return the employees data
	 */
	@RequestMapping(value = "/employeelist", method = RequestMethod.GET)
	public String getEmployeesData(Model model) {
		List<Employee> employeeList = employeeService.getEmployeesData();

		model.addAttribute("employeeList", employeeList);
		return "employeelist";
	}

	/**
	 * Delete employee data.
	 *
	 * @param id       the id
	 * @param employee the employee
	 * @return the string
	 */
	@RequestMapping(value = "/deleteEmployee/{employeeId}", method = RequestMethod.GET)
	public String deleteEmployeeData(@PathVariable("employeeId") int id, @ModelAttribute Employee employee) {
		employeeService.deleteEmployeeData(id);
		return "redirect:/employeelist";
	}

	/**
	 * Update employee.
	 *
	 * @param id    the id
	 * @param model the model
	 * @return the string
	 */
	@RequestMapping(value = "/updateEmployee", method = RequestMethod.GET)
	public String updateEmployee(@RequestParam("employeeId") int id, Model model) {
		Employee employee = employeeService.getEmployeeById(id);
		model.addAttribute("employee", employee);
		return "employeeupdate";
	}

	/**
	 * Update employee data.
	 *
	 * @param employee the employee
	 * @return the string
	 */
	@RequestMapping(value = "/updateData", method = RequestMethod.POST)
	public String updateEmployeeData(@ModelAttribute("employee") Employee employee) {
		employeeService.saveEmployeeData(employee);
		return "redirect:/employeelist";
	}

	/**
	 * Search employee.
	 *
	 * @param employeeId the employee id
	 * @param model      the model
	 * @return the string
	 */
	@RequestMapping(value = "/searchEmployee", method = RequestMethod.GET)
	public String searchEmployee(@RequestParam("name") String employeeName, Model model) {
		if (employeeName != null) {
			Employee emp = employeeService.getEmployeeByName(employeeName);
			if (emp != null) {
				List<Employee> employeeList = new ArrayList<Employee>();
				employeeList.add(emp);

				model.addAttribute("employeeList", employeeList);
			}
		}

		return "employeelist";
	}
}
