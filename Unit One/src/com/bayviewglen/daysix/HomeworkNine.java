package com.bayviewglen.daysix;

import java.util.Scanner;

public class HomeworkNine {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please Write the number of units sold:");
		
		int num = keyboard.nextInt();
		
		double totalpay = num*0.37;
		
		System.out.println("$"+totalpay);
		
		
	}

}
