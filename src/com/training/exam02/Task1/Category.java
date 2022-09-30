package com.training.exam02.Task1;

import java.util.ArrayList;
import java.util.List;

public class Category {

	private String name;
	private List<Item> items;
	
	Category(String name){
		this.name = name;
		items = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public List<Item> getItems() {
		return items;
	}
	
	public void addItem(Item i) {
		items.add(i);
	}
}
