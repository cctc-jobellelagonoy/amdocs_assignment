package com.training.exam01.Task2;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import com.training.exam01.Task1.ExistingStudentException;
import com.training.exam01.Task1.Student;

public class PhoneBook {
	private List<Contact> contacts;
	
	public PhoneBook() {
		contacts = new ArrayList<>();
	}
	
	public void addContact(Contact contact) throws ExistingContactException{
		try {
			Contact c = contacts.stream().filter(a -> a.equals(contact)).findFirst().get();
			throw new ExistingContactException();
		}
		catch(NoSuchElementException e) {
			contacts.add(contact);
		}
	}
	
	public List<Contact> getContacts(){
		return contacts;
	}
	
	public void removeContactByName(String name) {
		contacts.removeIf(c -> c.getName().equals(name));
	}
	
	public List<Contact> findByName(String name) {
		return contacts.stream().filter(a -> a.getName().equals(name)).toList();
	}
	
	public List<Contact> findByNumber(String number) {
		return contacts.stream().filter(a -> a.getNumber().equals(number)).toList();
	}
}
