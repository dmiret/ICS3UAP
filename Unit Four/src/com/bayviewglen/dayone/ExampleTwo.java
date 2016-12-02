package com.bayviewglen.dayone;

import java.util.Scanner;

public class ExampleTwo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Two Numbers Please: ");
		int x = input.nextInt();
		int y = input.nextInt();
		
		int low,high;
		if(x>y){
			low =y;
			high=x;
		}else{
			low=x;
			high=y;
		}
		
		int sum = 0;
		int current = low;
		while(current<=high){
			sum +=current;
			current++;
		}
		System.out.println(sum);
		
	}
}