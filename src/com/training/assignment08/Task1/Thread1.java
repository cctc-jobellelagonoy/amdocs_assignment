package com.training.assignment08.Task1;

public class Thread1 extends Thread{

	private String name;
	Thread t;
	
	Thread1(String name, int priority){
		this.name = name;
		t = new Thread();
		t.setPriority(priority);
		t.setName(name);
		start();
	}
	
	public void run() {
		System.out.println(name +" is running at priority "+t.getPriority());
		for(int i=1; i<5; i++) {
			System.out.println(name + " - "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
