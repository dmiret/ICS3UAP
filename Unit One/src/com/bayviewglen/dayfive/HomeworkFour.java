package com.bayviewglen.dayfive;

import java.util.Scanner;

public class HomeworkFour {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please enter the initial velocity of the car: ");
		double VelInt = keyboard.nextDouble();
		
		System.out.println("");
		System.out.print("Please Enter the acceloration of the car ");
		double Accel = keyboard.nextDouble();
		
		System.out.println("");
		System.out.print("Please enter the time that the car is driving for: ");
		int Time = keyboard.nextInt();
		
		double VelFin = VelInt + Accel *Time;
		
		System.out.println("The final velocity of the car will be " + VelFin);

		keyboard.close();
	}

}
