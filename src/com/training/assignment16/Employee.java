package com.training.assignment16;

public class Employee {
	private String name;
	private String address;
	private String department;
	private Laptop laptop;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	public Employee(String name, String address, String department, Laptop laptop) {
		super();
		this.name = name;
		this.address = address;
		this.department = department;
		this.laptop = laptop;
	}
	
	public Employee(){
		
	}
	
	public String getEmployeeDetails() {
		return "Name: "+name+
				"\nAddress: "+address+
				"\nDepartment: "+department+"\n"+
				laptop.getLaptopDetails();
	}
}
