package com.training.assignment08.Task2;

public class OddEven extends Thread {

	Thread t;
	
	OddEven(){
		t = new Thread();
		start();
	}
	
	public void run() {
		for(int i=1; i<10; i++) {
			if(i%2==0) {
				System.out.println(i+" is even");
			}
			else {
				System.out.println(i+" is odd");
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
