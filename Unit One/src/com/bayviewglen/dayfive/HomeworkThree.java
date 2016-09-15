package com.bayviewglen.dayfive;

import java.util.Scanner;

public class HomeworkThree {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please write down a five digit number [5]: ");
		
		int num = keyboard.nextInt();
		
		int digit2 = (num/1000)%10;
		int digit4 = (num/10)%10;
		
		double total = (double)digit2 * (int)digit4;
		
		System.out.println("The second digit is " + digit2);
		System.out.println("the fourth digit is " + digit4);
		
		System.out.println(" The product of the numbers you are using are " + total);

		keyboard.close();
	}

}
