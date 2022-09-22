package com.training.assignment8.Task2;

import java.util.List;
import java.util.Scanner;

public class Task2 {

	static Scanner input;
	
	public static void main(String[] args) {
		
		Library library = new Library();
		
		input = new Scanner(System.in);
		int choice = 0;
		
		while(choice != 4) {
			choice = getMenu();
			
			if(choice == 1) {
				addMember(library);
			}
			else if(choice == 2) {
				viewMembers(library);
			}
			else if(choice == 3) {
				findByAddress(library);
			}
		}
		System.out.print("The application has been closed.");
	}
	
	public static int getMenu() {
		System.out.println("\nLibrary Member Management");
		System.out.println("-------------------------");
		System.out.println("[1] Add Member");
		System.out.println("[2] View Members");
		System.out.println("[3] Find by Address");
		System.out.println("[4] Exit");
		System.out.println("-------------------------");
		System.out.print("Enter n: ");
		
		int n = Integer.parseInt(input.nextLine());
		return n;
	}
	
	public static void addMember(Library library) {
		System.out.println("-------Add-Member--------");
		System.out.print("Enter name: ");
		String name = input.nextLine();
		System.out.print("Enter address: ");
		String address = input.nextLine();
		
		library.addMember(new Member(name, address));
	}
	
	public static void viewMembers(Library library) {
		System.out.println("------View-Members-------");
		List<Member> members = library.getMembers();
		for(Member m : members) {
			System.out.println(m.getName()+" | "+m.getAddress());
		}
	}
	
	public static void findByAddress(Library library) {
		System.out.println("-----Find-by-Address-----");
		System.out.print("Enter address:");
		String address = input.nextLine();
		
		List<Member> members = library.findByAddress(address);
		for(Member m : members) {
			System.out.println(m.getName()+" | "+m.getAddress());
		}
	}

}
