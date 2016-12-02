package com.bayviewglen.dayone;

public class ExampleOne {

	public static void main(String[] args) {
		//4 types of loops in java
		
				//the condition is before the code being enclosed
				//Min number of times the code could be executed is 0
				
				//	- While(boolean expression){
				//....} 
				// Repeats while the boolean expression is true
				
				int x =7;		// no output if <
								//if output is > every number from x to less than ten
				
				while(x<10){	
					System.out.println(x);
					x++;}	//adds one to variable and the reassigns it to variable
			
				int y = 93;
			
				while (y>10){
					y/=2;
					System.out.println(y);
				}

				
				
				
				
				
				int sum = 0;
				
				int current = 1;
				
				while(current<1001){
					sum +=current;
					current++;
				}
			System.out.println("The sum of the number from 1 to 1000 is: "+sum);	
	}



		// all changes
		//x++; adds 1
		//x--; minus 1
		//x+=2; adds 2
		//x-=2; minus 2
		//x*=2; times 2
		//x/=2; divides 2
		//x%=2; mods by 2

}

