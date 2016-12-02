package com.bayviewglen.dayfour;

public class ExampleOne {

	public static void main(String[] args) {
	// Integer Division And the modulus
		
		System.out.println(3*6);  //integer + integer = integer
		
		System.out.println(3.0*6); //double + anything = double
		
		System.out.println(3%6); // 7mod2 = 7over2 = 31/2 3 = remainder, 1 = mod
		System.out.println(23%2);
		System.out.println(458548%10);
		System.out.println("");
		
		//example 1b
		
		int num = 918273;
		
		int	digit1 = num/100000;	
		System.out.println(digit1);
		int digit2 = (num/10000)%10;  // or int digit2 = (num%10000)/10000;
		System.out.println(digit2);
		int digit3 = (num/1000)%10;   
		System.out.println(digit3);
		int digit4 = (num/100)%10;
		System.out.println(digit4);
		int digit5 = (num/10)%10;
		System.out.println(digit5);
		int digit6 = num%10;
		System.out.println(digit6);
		
		int sum = digit1 +digit2 + digit3 +digit4 +digit5 +digit6;
		
		System.out.println(sum);

	}

}
