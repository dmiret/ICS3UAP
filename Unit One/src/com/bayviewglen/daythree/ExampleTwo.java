package com.bayviewglen.daythree;

public class ExampleTwo {

	public static void main(String[] args) {
		// declare 3 integers
		int numberOne, numberTwo; 			// naming convention  "numberOne"
		int sum;
		
		numberOne = 7;  		//numberOne is assigned 7
		//8 = numberOne; numbers can't be assigned to variables, only variables assigned to numbers
		numberTwo = 12;			// numberTwo is assigned 12
		
		sum = numberOne + numberTwo;
		
		System.out.println(sum);   //writes the value stored to the screen
		
		System.out.println(numberOne + "+" + numberTwo + "=" + sum); //using string concatenation (to join together) 
		// joining strings together
		//numberOne + + = +7
		//+7 + numberTwo = +7 + 12
		//"+7 + 12" + = sum
		// 19
		System.out.println(numberTwo + numberOne + "+" + numberTwo + "=" + sum);
		
				

	}

}
