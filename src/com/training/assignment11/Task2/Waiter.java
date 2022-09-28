package com.training.assignment11.Task2;

public class Waiter implements Runnable{
	
	Dish dish;
	
	Waiter(Dish d){
		dish = d;
		new Thread(this, "Waiter").start();
	}

	@Override
	public void run() {
		while(true) {
			dish.serve();
		}
	}

	
}
