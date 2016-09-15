package com.bayviewglen.dayfive;

import java.util.Scanner;

public class HomeworkOne {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please write down a number: ");
		
		int Num = keyboard.nextInt();
		
		System.out.println((double)Num);
		
		double NumSqr = Num * Num;
		
		System.out.println("");
		System.out.println(NumSqr);
		
		keyboard.close();

	}

}
