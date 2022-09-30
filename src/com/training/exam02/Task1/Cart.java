package com.training.exam02.Task1;

import java.util.HashMap;
import java.util.Map;

public class Cart {

	HashMap<String, Category> categories;
	
	Cart(){
		categories = new HashMap<>();
	}
	
	public void addCategory(Category c) {
		categories.put(c.getName(), c);
		System.out.println("--Added category - "+c.getName()+"--");
	}
	
	public void addItem(String category, Item i) {
		categories.get(category).addItem(i);
		System.out.println("--"+i.getName()+" has been added to "+category+"--");
	}
	
	public void printReceipt() {
		int total = 0;
		System.out.println("______________________________________________");
		System.out.println("|                 RECEIPT                    |");
		System.out.println("|____________________________________________|");
		System.out.println(String.format("|%-10s %-20s %-5s %-6s|","Price","Item","Qt", "Amount"));
		
		for (Map.Entry<String, Category> set : categories.entrySet()) {
			
			System.out.println(set.getKey()+":");
			
			Integer byCategory = 0;
			
			for(Item i : set.getValue().getItems()) {
				int amount = i.getPrice()*i.getQuantity();
				byCategory += amount;
				System.out.println(String.format("|%-10d %-20s %-5d %-6d|", i.getPrice(), i.getName(), i.getQuantity(), amount));
			}
			total += byCategory;
			System.out.println(String.format("| %42s |", "( "+byCategory.toString()+" )"));
       }
		
		System.out.println("|____________________________________________|");
		System.out.println(String.format("| TOTAL: %35s |", total));
		System.out.println("|____________________________________________|");
	}
}
