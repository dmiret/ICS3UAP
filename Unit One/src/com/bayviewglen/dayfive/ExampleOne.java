package com.bayviewglen.dayfive;

import java.util.Scanner;

public class ExampleOne {

	public static void main(String[] args) {
		//System.out = console
		//System.in = keyboard
		//buffer/ input stream - like a queue (line)
		//When you enter things it goes from back to front
		//Scanner - new type of class
		//Scanner keyboard;
		
		Scanner Keyboard = new Scanner(System.in); //Declare scanner, assign new scanner to system.in
		
		int x,y,z;
		
		System.out.print("Please enter three integers: "); //telling user to do something
		
		x = Keyboard.nextInt(); //grabs the next integer
		y = Keyboard.nextInt(); //grabs the next integer
		z = Keyboard.nextInt(); //grabs the next integer
		
		double average = (x + y + z) / 3.0;
		
		System.out.println("The average of the numbers: " + x + ", " + y + " and " + z + " is " + average);
		
	Keyboard.close();
		
	}

}
