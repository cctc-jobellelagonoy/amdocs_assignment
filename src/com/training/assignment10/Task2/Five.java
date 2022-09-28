package com.training.assignment10.Task2;

public class Five extends Thread {

	Thread t;
	
	Five(){
		t = new Thread();
		start();
	}
	
	public void run() {
		for(int i=5; i<100; i*=5) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

