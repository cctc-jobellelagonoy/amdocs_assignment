package com.training.exam1.Task2;

import java.util.Scanner;

public class Menu {
	Scanner input;
	
	public Menu() {
		input = new Scanner(System.in);
	}
	
	public int getMenu() {
		System.out.println("\nPhonebook Simulator");
		System.out.println("---------------------------");
		System.out.println("[1] Add Contact");
		System.out.println("[2] View all contacts");
		System.out.println("[3] Search by name");
		System.out.println("[4] Search by number");
		System.out.println("[5] Remove by name");
		System.out.println("[6] Exit");
		System.out.println("---------------------------");
		System.out.print("Enter n: ");
		
		int n = Integer.parseInt(input.nextLine());
		
		return n;
	}
	
	public Contact createNewContact() {
		System.out.print("Enter name: ");
		String name = input.nextLine();
		System.out.print("Enter number: ");
		String n = input.nextLine();
		
		return new Contact(name, n);
	}

	public String getName() {
		System.out.print("Enter name: ");
		String name = input.nextLine();
		return name;
		
	}

	public String getNumber() {
		System.out.print("Enter number: ");
		String n = input.nextLine();
		return n;
	}
}
