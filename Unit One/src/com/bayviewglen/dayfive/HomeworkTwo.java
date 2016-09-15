package com.bayviewglen.dayfive;

import java.util.Scanner;

public class HomeworkTwo {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please write down what the test is out of: ");
		double TestMax = in.nextDouble();
				
		System.out.print("Now please write down the score you achieved: ");	
		double Score = in.nextDouble();
		
		double precent = ((int)Score / TestMax)*100;
		
		System.out.println("you got a score of " + Score + "/" + TestMax +"or");
		System.out.println(precent+"%");

		in.close();
	}

}
