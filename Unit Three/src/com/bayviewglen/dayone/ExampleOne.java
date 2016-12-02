package com.bayviewglen.dayone;

import java.util.Scanner;

public class ExampleOne {

	public static void main(String[] args) {
		// Mathematical Operators
		// +,/,-,*,%(modulus operator)

		// #numbers operands
		// entire thing = mathematical expressions
		System.out.println(4 + 7);

		// Logical Operator
		// 4>3
		// = Boolean: True or False
		// <(less than) ,>(greater than) ,<=(less than, equals) ,>=(greater than, equals)
		// ,==(equals) ,!=(not equals)
		System.out.println(4 < 3);

		// Primitive types
		// Int,Double,Char,Boolean
		
		//example 1
		int age = 17;
		double height = 123.5;
	
		System.out.println((age >= 17)&&(height<150)); // (one and the other must be true) = entire thing is true
		
		//example 2
		System.out.println((age>=17)||height<150); //(one or the other is true)entire thing is true
		
		
		//example 3
		
		System.out.println(!((age >= 17)&&(height<150))); // NOT what is in the brackets
		
		
		
		// if statements
		
		//if(<<boolean expression>>){ 			} only go into brackets if true
		
		//else if(<<boolean expression>>){			}
		
		//else{				}		if opposite then return else brackets
		
		
		//example
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Grade");
		int grade = scanner.nextInt();
		
		if (grade >=80){
			System.out.println("A");
		}else if (grade >=70){
			System.out.println("B");
		}else if (grade >=60){
			System.out.println("C");
		}else{
			System.out.println("Fail");
		}
		

	}

}
