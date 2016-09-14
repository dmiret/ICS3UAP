package com.bayviewglen.dayfour;

public class HomeworkThree {

	public static void main(String[] args) {
		int num = 974034;
		
		int digit2 = (num/10000)%10;
		int digit5 = (num/10)%10;
		
		double total = (double)digit2 * (int)digit5;
		
		System.out.println(" The product of the numbers you are using are " + total);

	}

}
