package com.masaischool.sprint5project;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Department {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "name",unique = true,nullable = false)
	private String name;
	
	@OneToMany(mappedBy = "department",cascade = CascadeType.ALL)
	private Set<Employee> employee;

	private int isDeleted = 0;

	
	public int isDeleted() {
		return isDeleted;
	}

	public void setDeleted(int isDeleted) {
		this.isDeleted = isDeleted;
	}

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(int id, String name, Set<Employee> employee) {
		super();
		this.id = id;
		this.name = name;
		this.employee = employee;
	}

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

	public Set<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(Set<Employee> employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", employee=" + employee + ", isDeleted=" + isDeleted + "]";
	}

	
	
	
	
	
	
}
