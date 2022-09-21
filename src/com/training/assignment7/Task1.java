package com.training.assignment7;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Task1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n;
		
		System.out.println("Enter n: ");
		n = Integer.parseInt(input.next());
		
		int[] prices = new int[n];
		
		for(int i=0; i<n; i++) {
			try {
				prices[i] = Integer.parseInt(input.next());
			}
			catch(NumberFormatException e) {
				System.out.println("Only integers are allowed.");
				i--;
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		int index;
		System.out.println("Enter index to see price: ");
		index =  Integer.parseInt(input.next());
		
		try {
			System.out.println("The value at index "+index+" is "+prices[index]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index out of bound.");
		}
	
	}

}
