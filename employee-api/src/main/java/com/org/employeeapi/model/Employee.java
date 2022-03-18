package com.org.employeeapi.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	private String eId;
	private String eName;
	private String eSalary;
	
	
	public Employee() {
		super();
	}
	public Employee(String eId, String eName, String eSalary) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eSalary = eSalary;
	}
	public String geteId() {
		return eId;
	}
	public void seteId(String eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String geteSalary() {
		return eSalary;
	}
	public void seteSalary(String eSalary) {
		this.eSalary = eSalary;
	}
}
