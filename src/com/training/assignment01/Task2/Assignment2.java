package com.training.assignment01.Task2;


public class Assignment2 {

	public static void main(String[] args) {
		String str = "i love java";

		String[] substrs = str.split(" ");
		
		str = "";
		for(String s : substrs) {
			str = str + s.substring(0, 1).toUpperCase() + s.substring(1) + " ";
		}
		
		System.out.print(str);
	}

}

//2. Declare a string and convert first letter of each word to capital for example: 
//“i love java” should be converted to “I Love Java”.
 