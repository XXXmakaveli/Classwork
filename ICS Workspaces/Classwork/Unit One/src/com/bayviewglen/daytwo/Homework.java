package com.bayviewglen.daytwo;

public class Homework {

	public static void main(String[] args) {
	
	//Question 1:
	int radius = 7;
	double area = 0;
	
	area = Math.PI * (radius*radius);
	
	System.out.println("1) The area of the circle is " + area);
	//Output: The area is 153.93804002589985
	
	//Question 2:
	radius = 14;
	double volume = 0;
	
	volume = Math.pow(radius, 3) * Math.PI * (4/3.0);
	
	System.out.println("2) The volume of the sphere is " + volume);
	//Output: The volume of the sphere is 11494.040321933857
	
	//Question 3:
	int a = 2;
	int b = 3;
	int c = 4;
	int x = 5;
	double y = 0;
	
	y = a * (x*x) + b * x + c;
	
	System.out.println("3) if a=2, b=3, c=4, x=5, in y=ax^2+bx+c, y = "+y);
	//Output: if a=2, b=3, c=4, x=5, in y=ax^2+bx+c, y = 69.0
	
	//Question 4:
	int x1 = 4;
	int x2 = 8;
	int y1 = 3;
	int y2 = 6;
	double slope = 0;
	int yDif = y2-y1;
	int xDif = x2-x1;
	
	slope = 1.0*yDif/xDif;
	
	System.out.println("4) The slope is: "+slope);
	//Output: The slope is: 0.75
	
	//Question 5:
	int toonies = 2;
	int loonies = 1;
	double quarters = 0.25;
	double dimes = 0.1;
	double nickels = 0.05;
	double pennies = 0.01;
	double money = 0;
	
	money = (3*toonies)+(2*loonies)+(3*quarters)+(4*dimes)+(2*nickels)+(3*pennies);
	
	System.out.println("5) You have $"+money);
	//Output: You have $9.28
	
	//Question 6:
	int discriminant = b*b - 4*a*c;
	if (discriminant<0) {
		System.out.println("There are no real roots");
	} else {
		double r1 = (-1*b + Math.sqrt(b*b - 4*a*c))/(2.0*a);
		double r2 = (-1*b - Math.sqrt(b*b - 4*a*c))/(2.0*a);
		System.out.println("The roots are "+r1+" and "+r2);
	}
	//Output: There are no real roots
	}

}
