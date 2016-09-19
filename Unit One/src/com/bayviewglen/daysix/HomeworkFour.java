package com.bayviewglen.daysix;

public class HomeworkFour {

	public static void main(String[] args) {
		int days = 365;
		int hours = 24;
		
		int minutes = hours*60;
		int seconds = minutes*60;
		
		int year = days*seconds;
		
		double speedperyear = year*(3*10e8);
		
		System.out.println(speedperyear);

	}

}
