package com.bayviewglen.dayfour;

public class HomeworkFive {

	public static void main(String[] args) {
		double x = 5.5, y = 3.0, z = -2.0;
		int i = 5, j = 4, k = 3;
		
//a)
		System.out.println("A)");
		System.out.println("Ex:");
		System.out.println(i-(i-(i-(i-j))));
		int a1 = i-j;
		int a2 = i-a1;
		int a3 = i -a2;
		int a4 = i -a3;
		
		System.out.println(a4);
		
//b)
		System.out.println("B)");
		System.out.println("Ex:");
		System.out.println((x-y)*(x+(i-j)));
		double b1 = x-y;
		double b2 = x+(i-j);
		double b3 =b1*b2;
		
		System.out.println(b3);
		
//c)
		System.out.println("C)");
		System.out.println("Ex:");
		System.out.println((x-y)-(y-x)-(x-y)-(y-x));
		double c1 = x-y;
		double c2 = y-x;
		double c3 = c1-c2;
		
		System.out.println(c3);
		
//h)
		System.out.println("H)");
		System.out.println("Ex:");
		System.out.println((double)i+j/k);
		
		double h1 = j/k;
		int h2 = i;
		double h3 = (double)h2 +h1;
		
		System.out.println(h3);
		
//I)
		System.out.println("I)");
		System.out.println("Ex:");
		System.out.println((int)x/k-x/k);
		
		double Idiv = x/k;
		double IAnw = (int)Idiv - Idiv;
		
		System.out.println(IAnw);
		
//J)
		System.out.println("J)");
		System.out.println("Ex:");
		System.out.println((double)i/j - (double)(i/j));
		
		double Jdiv = i/j;
		double Jdiv2 = (double)i/j;
		double Janw = Jdiv2 - Jdiv;
		
		System.out.println(Janw);
		
	}

}
