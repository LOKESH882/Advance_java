package com.tks.lokesh_Springboot.entity;

public class Employee {
	private int id;
	private String name;
	
	
	public Employee() {
		super();
		
	}
	
	public Employee(String name) {
		super();
		this.name = name;
	}
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	
}
