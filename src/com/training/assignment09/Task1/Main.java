package com.training.assignment09.Task1;

public class Main {

	public static void main(String[] args) {
		BankAccount account = new BankAccount(5000);
		
		BankAccountThread t1 = new BankAccountThread(account, 1000);
		BankAccountThread t2 = new BankAccountThread(account, 500);
		
		try {
			t1.t.join();
			t2.t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
