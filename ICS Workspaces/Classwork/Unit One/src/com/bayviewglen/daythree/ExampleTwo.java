package com.bayviewglen.daythree;

public class ExampleTwo {

	public static void main(String[] args) {
		int number = 1985;
		
		// Add the individual digits in the number
		// and display the sum to the screen.
		
		int digit1 = number / 1000; // 5
		int digit5 = number % 10; // 5
		int digit2 = number / 1000 % 10; // 7	(number / 1000) = 57 % 10 = 7
		int digit3 = number / 100 & 10; // 4	(number / 100) = 574 % 10 = 4
		int digit4 = number % 100 / 10; // 7	(number % 100) = 78 / 10 = 7
		
		// OR
		
		// digit4 = number / 10 % 10;		// 7	(number / 10) = 5747 % 10 = 7\
		
		int sum = digit1 + digit2 + digit3 + digit4 + digit5;
		
		System.out.println("The sum of all the digits of "+number+" is: "+sum);
	}

}
