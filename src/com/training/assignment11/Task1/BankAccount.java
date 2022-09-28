package com.training.assignment11.Task1;

public class BankAccount {

	private int balance = 0;
	BankAccount(int balance){
		this.balance = balance;
	}
	
	synchronized void withdraw(int amount) {
		balance -= amount;
		System.out.println("Widrawing "+amount+"...");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Current balance: "+balance);
	}
}
