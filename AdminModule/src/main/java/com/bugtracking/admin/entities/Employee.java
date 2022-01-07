package com.bugtracking.admin.entities;

import javax.persistence.Id;
import javax.validation.constraints.Min;

import io.swagger.annotations.ApiModelProperty;

public class Employee {
	@Id
	@Min(value = 1, message = "minimum value must be 1")
	private long empId;
	@ApiModelProperty("Employee name should not be empty")
	public String empName;
	@ApiModelProperty("Employee email should not be empty")
	private String empEmail;
	@ApiModelProperty("Employee contactno should not be empty")
	private String empContactNo;
	@Min(value = 1, message = "minimum value must be 1")
	private long projectId;

	public Employee(long empId, String empName, String empEmail, String empContactNo, long projectId) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empEmail = empEmail;
		this.empContactNo = empContactNo;
		this.projectId = projectId;
	}

	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public String getEmpContactNo() {
		return empContactNo;
	}

	public void setEmpContactNo(String empContactNo) {
		this.empContactNo = empContactNo;
	}

	public long getProjectId() {
		return projectId;
	}

	public void setProjectId(long projectId) {
		this.projectId = projectId;
	}

	public Employee() {

	}
}
