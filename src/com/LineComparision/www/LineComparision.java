package com.LineComparision.www;

public class LineComparision {
	public static void main(String[] args) {

		int x1 = 50, y1 = 100;
		int x2 = 200, y2 = 400;
		int x3 = 50, y3 = 100;
		int x4 = 200, y4 = 400;
		System.out.println("Welcome to Line Comparison Computation Program");
		double length1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		System.out.println("Length of line1: " + length1);
		double length2 = Math.sqrt(Math.pow(x3 - x4, 2) + Math.pow(y3 - y4, 2));
		System.out.println("Length of line2: " + length2);

		if (length1 == length2)
			System.out.println("Both lines are same..");
		else if (length1 > length2)
			System.out.println("line 1 is greater than line2..");
		else
			System.out.println("line 2 is greater than line1..");
	}
}
