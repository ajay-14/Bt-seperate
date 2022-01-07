package com.bugtracking.employee.dto;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.bugtracking.employee.entities.Bug;
//import com.cg.bugtracking.bug.entity.Project;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("Employee Entity")
public class EmployeeDto{
	private long empId;
	@NotEmpty
	@ApiModelProperty("name should not empty")
	private String empName;
	@NotEmpty
	private String empEmail;
	@NotEmpty
	private String empContactNo;
	@Min(value=1)
	private long projectId;
	
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
	
	
	public EmployeeDto(long empId, String empName, String empEmail, String empContactNo, long projectId) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empEmail = empEmail;
		this.empContactNo = empContactNo;
		this.projectId = projectId;
	}
	
	public EmployeeDto() {
		
	}
}