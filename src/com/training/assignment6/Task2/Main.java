package com.training.assignment6.Task2;

public class Main {

	public static void main(String[] args) {
		DayScholar dayscholar = new DayScholar(1, 1001, 100233, "IT");
		Hosteller hosteller = new Hosteller(1, 1002, 104521, "Engineering");
		
		dayscholar.getDetails();
		hosteller.getDetails();
	}

}
