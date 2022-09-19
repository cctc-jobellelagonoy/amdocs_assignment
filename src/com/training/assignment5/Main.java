package com.training.assignment5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Factory sportType = new Factory();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Type of sport: ");
		
		Sport sport = sportType.getSport(input.next());
		
		System.out.println(sport.getClass());
	}

}
