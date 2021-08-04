package com.binu.jpademo;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  // JPA annotation
@Table(name="employee_data")
public class Employee {

	@Id
	private int id;
	
	private String name;
	
	@Enumerated(EnumType.STRING)
	private EmployeeType type;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public EmployeeType getType() {
		return type;
	}

	public void setType(EmployeeType type) {
		this.type = type;
	}
	
	
	
	
	
	
	
}


