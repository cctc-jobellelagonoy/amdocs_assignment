package com.training.exam1.Task2;

import java.util.List;

import com.training.exam1.Task1.ExistingStudentException;

public class Main {

	public static void main(String[] args) {
		int choice = 0;
		PhoneBook phonebook = new PhoneBook();
		
		Menu menu = new Menu();
		
		while(choice != 6) {
			choice = menu.getMenu();
			
			if(choice == 1) {
				System.out.println("----Add Contact----");
				Contact newc = menu.createNewContact();
				
				try {
					phonebook.addContact(newc);
				} catch (ExistingContactException e) {
					System.out.println(e.getMessage());
				}
			}
			else if(choice == 2) {
				List<Contact> list = phonebook.getContacts();
				
				System.out.println("----All Contacts----");
				for(Contact c : list) {
					System.out.println(c.getName()+" - "+c.getNumber());
				}
			}
			else if(choice == 3) {
				String name = menu.getName();
				
				System.out.println("----Search Result----");
				List<Contact> list = phonebook.findByName(name);
				for(Contact c : list) {
					System.out.println(c.getName()+" - "+c.getNumber());
				}
			}
			else if(choice == 4) {
				String number = menu.getNumber();
				
				System.out.println("----Search Result----");
				List<Contact> list = phonebook.findByNumber(number);
				for(Contact c : list) {
					System.out.println(c.getName()+" - "+c.getNumber());
				}
			}
			else if(choice == 5) {
				System.out.println("----Remove Contact----");
				String name = menu.getName();
				
				phonebook.removeContactByName(name);
			}
		}
	}

}
