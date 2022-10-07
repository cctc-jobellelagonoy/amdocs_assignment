package com.training.assignment12.Task2;

public class Main {

	public static void main(String[] args) {
		CrudOperations op = new CrudOperations();
//		op.insertEntity("Janelle", "B");
//		op.insertEntity("Aiden", "A");
//		op.insertEntity("Hanna", "C");
//		op.insertEntity("Michael", "A+");
//		op.insertEntity("Sally", "D");
		
//		op.updateEntity("D", 2);
		op.findEntity("B+");
		op.removeEntity("D");
	}

}
