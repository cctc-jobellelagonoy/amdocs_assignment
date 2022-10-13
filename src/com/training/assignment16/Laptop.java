package com.training.assignment16;

public class Laptop {
	private String brand;
	private String model;

	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	public Laptop(String brand, String model, String rAM, String processor) {
		super();
		this.brand = brand;
		this.model = model;
	}
	
	Laptop(){
		
	}
	
	public String getLaptopDetails() {
		return "Brand: "+brand+"\nModel: "+model;
	}
}
