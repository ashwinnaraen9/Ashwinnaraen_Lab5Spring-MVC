package com.empproject.EMS.Service;

import java.util.List;

import com.empproject.EMS.Model.Employee;

public interface EmployeeService {
	List<Employee> getAllEmployees();

	void saveEmployee(Employee employee);

	Employee getEmployeeById(long id);

	void deleteEmployeeId(long id);

}
