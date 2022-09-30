package com.training.exam02.Task1;

public class Item {

	private String name;
	private Integer price, quantity;
	
	Item(String name, Integer price, Integer quantity){
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public Integer getPrice() {
		return price;
	}

	public Integer getQuantity() {
		return quantity;
	}
	
	
}
