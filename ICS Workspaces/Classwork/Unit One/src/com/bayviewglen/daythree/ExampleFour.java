package com.bayviewglen.daythree;

public class ExampleFour {

	public static void main(String[] args) {
		//final int NUMBER_OF_SIDES = 6;
		
		final int NUM_STUDENTS = 22;	// this makes our code easier to maintain
										// and easier to read
		
		int[] students = new int[NUM_STUDENTS];	//don't stress about the array
		int testScores = 0;
		for (int i=0; i<NUM_STUDENTS; i++) {	//or the for loop
			testScores += students[i];
		}
		
		double average = testScores / NUM_STUDENTS;
		// NUMBER_OF_SIDES = 8;	cannot change the value after it was set
		// Naming convention for constants is UPPER_CASE_WITH_UNDERSCORES
		
		
		
		// hardcoded numbers in your code are reffered to as magic numbers
		// we don't like magic numbers. Create a constant instead.
		// Constants go at the top.

	}

}
