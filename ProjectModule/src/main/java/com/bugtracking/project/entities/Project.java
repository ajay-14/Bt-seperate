package com.bugtracking.project.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;

@Entity
public class Project{
	@Id
	private long projId;
	@NotEmpty
	private String projname;
	
	@OneToMany
	private List<Employee> members;
	@NotEmpty
	private String projstatus;
	
	public List<Employee> getMembers() {
		return members;
	}
	public void setMembers(List<Employee> members) {
		this.members = members;
	}
	public long getProjId() {
		return projId;
	}
	public void setProjId(long projId) {
		this.projId = projId;
	}
	public String getProjname() {
		return projname;
	}
	public void setProjname(String projname) {
		this.projname = projname;
	}
	
	public String getProjstatus() {
		return projstatus;
	}
	public void setProjstatus(String projstatus) {
		this.projstatus = projstatus;
	}
	
	public Project() {
		
	}
	public Project(long projId, String projname, List<Employee> members, String projstatus) {
		super();
		this.projId = projId;
		this.projname = projname;
		this.members = members;
		this.projstatus = projstatus;
	}
	
}
