package com.bayviewglen.daythree;

public class HomeworkSix {

	public static void main(String[] args) {
		double xPlus, xMinus;
		int a,b,c;
		
		a = 3;
		b = 7;
		c = 2;
		
		
		xPlus = -b +Math.sqrt((b*b)-4*a*c)/2*a;
		
		xMinus = -b - Math.sqrt((b*b)-4*a*c)/2*a;
		
		System.out.println(xPlus);
		System.out.println(xMinus);
		System.out.println("");
		System.out.println("The two different roots of the equation are " + xPlus + " and " + xMinus);

	}

}
