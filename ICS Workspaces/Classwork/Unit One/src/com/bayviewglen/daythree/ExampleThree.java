package com.bayviewglen.daythree;

public class ExampleThree {
	/* Types of Errors */
	public static void main(String[] args) {
		//ints x, y; // syntax error - Your Java is WRONG! Java does not understand you
				   // will not run if you have have syntax errors.
		
		
		// Runtime errors - errors that occur at RUN TIME.
		//int x = 7;
		
		//int y = x/0;
		
		//System.out.println(y);
		
		
		// Logic Errors 
		int radius = 7;
		double areaCircle = Math.PI * 2 * radius;	// logic mistake because the equation is wrong
													// these are more like glitches
		System.out.println(areaCircle);				// Difficult to find and generally get missed
		

	}

}
