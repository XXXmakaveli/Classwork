package com.bayviewglen.daythree;

public class ExampleOne {
	
	/* Integer Division */
	public static void main(String[] args) {
		int x = 345;
		int y = 17;
		
		double z = x / y;
		
		System.out.println(z);
		
		int remainder = x % y; // modulus operator gets us the remainder
		
		System.out.println("The remainder is: " + remainder);
		
		if (x % 2 ==0) {
			System.out.println("EVEN");
		}else {
			System.out.println("ODD");
		}
		
		if (x % 3 ==0) {
			System.out.println(x + " is divisible by 3.");
		}else {
			System.out.println(x + " is not divisible by 3.");
		}
		
		
		for (int counter = 0; counter<100; counter++) {
			if (counter%9 ==0) {
				System.out.print(counter+", ");
			}
		}
		
		
		
		
	}

}
