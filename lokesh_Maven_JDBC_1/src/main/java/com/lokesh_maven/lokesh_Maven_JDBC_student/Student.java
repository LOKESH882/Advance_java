package com.lokesh_maven.lokesh_Maven_JDBC_student;

public class Student {

	private String name,city;
	private int age;
	private static int id=2222;
	
	public Student() {
		
	}

	public Student(String name, String city, int age) {
		super();
		this.setName(name);
		this.setCity(city);
		this.setAge(age);
		this.setId(id++);
	}
	
	@Override
	public String toString() {
		return "Student [ID= "+this.getId()+ "name=" + this.getName() + ", city=" + this.getCity() + ", age=" + this.getAge() + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		Student.id = id;
	}
	
	
}
