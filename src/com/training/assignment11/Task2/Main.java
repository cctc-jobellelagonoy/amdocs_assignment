package com.training.assignment11.Task2;

public class Main {

	public static void main(String[] args) {
		Dish dish = new Dish();
		
		new Cook(dish);
		new Waiter(dish);
	}

}
