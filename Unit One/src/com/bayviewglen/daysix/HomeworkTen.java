package com.bayviewglen.daysix;

import java.io.InputStream;
import java.util.Scanner;

public class HomeworkTen {

	public static void main(String[] args) {
		
		Scanner Keyboard = new Scanner(System.in);
		
		System.out.print("Please write the width:");
		
		int width = Keyboard.nextInt();
		
		System.out.print("Please write the length:");
		
		int length = Keyboard.nextInt();
		
		int area = length*width;
		
		int perimeter = length + length +width +width;
		
		System.out.println("The area of the Rectangle is "+area);
		System.out.println("The perimeter of the rectangle is "+perimeter);

	}

}
