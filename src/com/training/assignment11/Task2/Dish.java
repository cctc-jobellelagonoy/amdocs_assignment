package com.training.assignment11.Task2;

public class Dish {

	Boolean isPrepared = false;
	int n = 0;
	
	synchronized void prepare(int n) {
		if(isPrepared) {
			try {
				wait();
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.n = n;
		System.out.println(n+". The cook is preparing the dish...");
		isPrepared = true;
		notify();
	}
	
	synchronized void serve() {
		if(!isPrepared) {
			try {
				wait();
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		System.out.println(n+". The dish is served");
		isPrepared = false;
		notify();
	}
}
