package com.bugtracking.employee.services;

import java.util.List;

import com.bugtracking.employee.dto.EmployeeDto;
import com.bugtracking.employee.entities.Employee;

public interface IEmployeeService {
	public EmployeeDto createEmployee(EmployeeDto employeeDto);
	public EmployeeDto updateEmployee(long empId, EmployeeDto employeeDto);
	public EmployeeDto deleteEmployee(long empId);
	public EmployeeDto getEmployee(long empId);
	public  List<EmployeeDto> getAllEmployees();

}
