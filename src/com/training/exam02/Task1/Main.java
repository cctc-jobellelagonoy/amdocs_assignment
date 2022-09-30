package com.training.exam02.Task1;

public class Main {

	public static void main(String[] args) {
		Cart cart = new Cart();
		
		cart.addCategory(new Category("Dairy Products"));
		cart.addCategory(new Category("Menswear"));
		cart.addCategory(new Category("Toys"));
		cart.addCategory(new Category("Appliances"));
		cart.addCategory(new Category("Beverages"));
		
		cart.addItem("Dairy Products", new Item("Fresh Milk", 150, 2));
		cart.addItem("Dairy Products", new Item("Yogurt", 100, 3));
		cart.addItem("Dairy Products", new Item("Cheese", 120, 2));
		cart.addItem("Menswear", new Item("Rubber shoes", 2500, 1));
		cart.addItem("Toys", new Item("Barbie Doll", 1500, 1));
		cart.addItem("Appliances", new Item("Washing Machine", 15000, 1));
		cart.addItem("Appliances", new Item("Electric Stove", 5000, 1));
		cart.addItem("Beverages", new Item("Soda", 80, 5));
		cart.addItem("Beverages", new Item("Wine", 230, 2));
		
		cart.remove("Dairy Products", "Yogurt");
		
		cart.printReceipt();
	}

}
