package com.bayviewglen.daysix;

public class HomeworkFive {

	public static void main(String[] args) {
		

		double gameswon = 110;
		double totalgames = 154;
		
		double winningprecent = (gameswon/totalgames);
		double winningprecent1 =(int)(winningprecent*100000);
		double winningprecentR = winningprecent1/1000;
		
		System.out.println(winningprecentR);

	}

	
}
