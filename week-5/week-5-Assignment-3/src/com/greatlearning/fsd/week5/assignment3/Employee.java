package com.greatlearning.fsd.week5.assignment3;

public class Employee implements Comparable<Employee>{
	private int id;
	private String name;
	private int age;
	private double salary;
	private Department department;
	
	enum Department{
		HR,FINANCE,MARKETING, SALES
	}

	/**
	 * Public
	 * */
	public Employee(int id, String name, int age, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public Employee(int id, String name, int age, double salary, Department department) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.department = department;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return super.equals(arg0);
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + ", department="
				+ department + "]";
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public int compareTo(Employee emp) {
		// TODO Auto-generated method stub
		if(this.id > emp.id) {
			return 1;
		}
		else if(this.id < emp.id) {
			return -1;
		}
		return 0;
	}
	
	
	
}
