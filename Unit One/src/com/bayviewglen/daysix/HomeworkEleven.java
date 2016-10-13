package com.bayviewglen.daysix;

import java.util.Scanner;

public class HomeworkEleven {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please choose the mass of the object:");
		
		int Mass = keyboard.nextInt();
		
		System.out.print("Please choose the speed of the object:");
		
		int Speed = keyboard.nextInt();
		
		double kinecticenergy = 0.5*(Mass*(Speed*Speed));
		
		System.out.println("The kinectic Energy of the object at that speed is "+ kinecticenergy);

		keyboard.close();
	}

}
