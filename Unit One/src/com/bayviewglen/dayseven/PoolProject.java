package com.bayviewglen.dayseven;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PoolProject {
	
	static final double PRENCENTAGE = 0.9;
	static final int LITRES = 100;
	private static DecimalFormat decform = new DecimalFormat(".##");
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
	
		
		//length of pool
		System.out.println("Please only print numbers with one decimal place, answers will be given with two deciaml places");
		System.out.println("");
		System.out.print("Please input the length of the pool:");
		double length =keyboard.nextDouble(); 
		
		//width of pool
		System.out.print("Please input the width of the pool:");
		double width = keyboard.nextDouble();
		
		//depth of the shallow end
		System.out.print("Please input the depth of the shallow end:");
		double depthS = keyboard.nextDouble();
		
		//depth of the deep end
		System.out.print("Please input the depth of the deep end:");
		double depthD = keyboard.nextDouble();
		
		//length of the slope connecting between deep and shallow
		System.out.print("Please input the length of slope between the deep end and shallow end:");
		double lengthSlope =keyboard.nextDouble();
		
		//length of the shallow end
		System.out.print("Please input the length of the Shallow end:");
		double lengthShallow = keyboard.nextDouble();
		
		//Liner 1 cost
		System.out.print("Please input the cost of the first liner:");
		double costliner1 =keyboard.nextDouble();
		
		//liner 2 cost
		System.out.print("Please input the cost of the second liner:");
		double costliner2 = keyboard.nextDouble();
		
		//liner 3 cost
		System.out.print("Please input the cost of the third liner:");
		double costliner3 = keyboard.nextDouble();

		System.out.println("");
		//volume of the pool
		double depthslope = (depthD-depthS);
		double lengthS = Math.sqrt((lengthSlope*lengthSlope)-(depthslope*depthslope));  //finding the length of the slope flat side 
		
		double lengthdeep = length-lengthS-lengthShallow;
		
		double volumearea1 = length*width*depthS;
		
		double volumearea2 = lengthdeep*depthslope*width;
		
		double volumearea3 = 1/2*(lengthS*depthslope*width);
		
		double volumetotal = ((volumearea1+volumearea2+volumearea3)*LITRES)*PRENCENTAGE;
		
		System.out.println("The total volume of the pool at 90% is :"+decform.format(volumetotal)+" litres of water");
		
		//amount of liner needed for the pool
		
		double area1 = (length*depthS); // area of top pool 1&2
		
		double area2 = (depthslope*lengthdeep); //area of deep pool sides 1&2
		
		double area3 = (lengthS*depthslope)/2; // area of the triangle sides
		
		double areatri = (lengthSlope*width); //area of the triangle ground
		
		double areabd = lengthdeep*width; //area of deep end ground
		
		double areadd = depthD*width; //area of deep end depth wall
		
		double areabs = lengthShallow*width; //area of shallow end ground
		
		double areads = depthS*width; //area of shallow end wall
		
		double areatotal = 2*(area1)+2*(area2)+2*(area3)+areabd+areadd+areabs+areads+areatri;
		
		System.out.println("the total amount of liner that you would need would be "+decform.format(areatotal) +"^2 meters of liner");
		
		//cost of liner per different product
		System.out.println("");
		System.out.println("");
		
		double cost1 = ((int)areatotal*costliner1);
		
		System.out.println("the cost of the first liner is $"+decform.format(cost1));
		
		System.out.println("");
		
		double cost2 = ((int)areatotal*costliner2);
		
		System.out.println("the cost of the second liner is $"+decform.format(cost2));
		System.out.println("");
		
		double cost3=  ((int)areatotal*costliner3);
		
		System.out.println("the cost of the thrid liner is $"+decform.format(cost3));
		
		keyboard.close();
	}

}
