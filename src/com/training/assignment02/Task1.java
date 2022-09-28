package com.training.assignment02;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		String str = "";
		String result = "";
		
		int counter;
		
		System.out.print("Enter String: ");
		str = (new Scanner(System.in).next());
		
		for(int i=1; i<str.length(); i++) {
			char current = str.charAt(i-1);
			counter = 1;
			
			while(i < str.length() && str.charAt(i) == current) {
				counter++;
				i++;
			}
			
			result += String.valueOf(current) + String.valueOf(counter);
			
		}
		
		System.out.print(result);
	}
	
}
