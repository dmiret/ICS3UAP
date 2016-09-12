package com.bayviewglen.daythree;

public class HomeworkFive {

	public static void main(String[] args) {
		
		int pennies, nickles, dimes, quarters, loonies, toonies;
		double TotalMoney;
		
		pennies = 91;
		nickles = 20;
		dimes = 13;
		quarters = 6;
		loonies = 10;
		toonies = 4;
		
		TotalMoney = 0.01*pennies + 0.05*nickles + 0.10*dimes + 0.25*quarters + 1*loonies + 2*toonies;
		
		System.out.println(TotalMoney);
		System.out.println("");
		System.out.println("the amount of money you have is $"+""+TotalMoney);
		

	}

}
