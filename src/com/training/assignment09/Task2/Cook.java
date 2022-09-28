package com.training.assignment09.Task2;

public class Cook implements Runnable {

	Dish dish;
	
	Cook(Dish d){
		dish = d;
		new Thread(this, "Cook").start();
	}
	
	@Override
	public void run() {
		int i = 1;
		while(i<=5) {
			dish.prepare(i);
			i++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
