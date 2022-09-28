package com.training.assignment11.Task1;

public class BankAccountThread implements Runnable{

	BankAccount b;
	int withdrawAmount;
	Thread t;
	
	BankAccountThread(BankAccount b, int a){
		this.b = b;
		withdrawAmount = a;
		t = new Thread(this);
		t.start();
	}
	
	@Override
	public void run() {
		b.withdraw(withdrawAmount);
	}

}
