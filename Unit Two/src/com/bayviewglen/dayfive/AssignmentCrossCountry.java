package com.bayviewglen.dayfive;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AssignmentCrossCountry {
	static final int CONVERSION = 60; 										//conversion unit from meters to seconds and/or seconds to Meters
	public static void main(String[] args) {

		DecimalFormat formatter = new DecimalFormat("00.000"); 				// Decimal Format for the seconds of each number (00 seconds . 000 miliseconds)
		Scanner input = new Scanner(System.in); 							// Human input method (keyboard)	
				
		
		// Runner 1

		// Name of Runner
		System.out.print("Please write your first and last name: ");		//Gathering the name from the user
		String name1 = input.nextLine();
		String fName1 = (name1.split(" ")[0]);
		String lName1 = (name1.split(" ")[1]);
		String tName1 = lName1+","+fName1;
		
		
		// mile 1 Time
		System.out.print(fName1+", please input your time for the first mile (mm:ss.sss): ");
		String t1Time1 = input.nextLine();
		int t1Minutes1 = Integer.parseInt(t1Time1.split(":")[0]);
		double t1Seconds1 = Double.parseDouble(t1Time1.split(":")[1]);		//separating the minutes and seconds first time

		double t1SecTotal1 = (int) (t1Minutes1) * CONVERSION + t1Seconds1;	// Converting from individual numbers to seconds
		String t1Split1 = t1Minutes1+":"+(formatter.format(t1Seconds1));	// Formating the time with the "DecimalFormat (just to make sure)


		// mile 2 Time
		System.out.print(fName1+", please input your time to complete the second mile (mm:ss.sss): ");
		String t1Time2 = input.nextLine();
		int t1Minutes2 = Integer.parseInt(t1Time2.split(":")[0]);
		double t1Seconds2 = Double.parseDouble(t1Time2.split(":")[1]);		//Human interface, and splitting the time into minutes and seconds second number

		double t1SecTotal2 = (int) (t1Minutes2) * CONVERSION + t1Seconds2;	//Converting all to seconds
		int t1MinSec2 = (int)t1SecTotal2 - (int)t1SecTotal1;				//Finding the total number of minutes in seconds for the second split
		int t1Min2 = t1MinSec2/CONVERSION;									//Converting the minutes in seconds to minutes
		double t1Sec2 = (t1SecTotal2-t1SecTotal1)-(t1Min2*CONVERSION);		//Finding the number of seconds based on the number of minutes
		String t1Split2 = t1Min2+":"+(formatter.format(t1Sec2));			//Displaying the time in the proper format
		

		// mile 3 Time
		System.out.print(fName1+", please input your final time to complete the entire 5km (mm:ss.sss): ");
		String t1Time3 = input.nextLine();
		int t1Minutes3 = Integer.parseInt(t1Time3.split(":")[0]);
		double t1Seconds3 = Double.parseDouble(t1Time3.split(":")[1]);		//Human interface, and splitting the time into minutes and seconds third number
		
		String t1SplitTotal = t1Minutes3+":"+formatter.format(t1Seconds3);
		
		double t1SecTotal3 = (int)(t1Minutes3)*CONVERSION +t1Seconds3;		//Converting all the units to seconds
		int t1minsec3 = (int)(t1SecTotal3 - t1SecTotal2);					//Finding the total number of minutes in second form for the third split
		int t1min3 = t1minsec3/CONVERSION;									//Converting the minutes in seconds to minutes
		double t1sec3 = (t1SecTotal3-t1SecTotal2)-t1min3*CONVERSION;		//Finding the number of seconds based on the number of minutes
		String t1Split3 = t1min3+":"+(formatter.format(t1sec3));			//Displaying the time in the proper format

		
		
		//Runner 1 Summary Chart
		System.out.println("");
		System.out.println("Runner One Summary");							
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("");
		System.out.printf("Name: %10s%n",tName1);							//Displaying the Name of the Runner
		System.out.printf("Mile One: %10s%n", t1Split1);					//Split One
		System.out.printf("Mile Two: %10s%n", t1Split2);					//Split Two
		System.out.printf("Mile Three: %5s%n", t1Split3);					//Split Three
		System.out.printf("Total Time: %s%n%n", t1SplitTotal);				//Complete Time
		
		
		//Runner Two
		
		// Name of Runner
		System.out.print("Please write your first and last name: ");		//Gathering the name from the user
		String name2 = input.nextLine();
		String fName2 = (name2.split(" ")[0]);
		String lName2 = (name2.split(" ")[1]);
		String tName2 = lName2+","+fName2;
		
		
		// mile 1 Time
		System.out.print(fName2+", please input your time for the first mile (mm:ss.sss): ");
		String t2Time1 = input.nextLine();
		int t2Minutes1 = Integer.parseInt(t2Time1.split(":")[0]);
		double t2Seconds1 = Double.parseDouble(t2Time1.split(":")[1]);	

		double t2SecTotal1 = (int) (t2Minutes1) * CONVERSION + t2Seconds1;	// Converting from individual numbers to seconds
		String t2Split2 = t2Minutes1+":"+(formatter.format(t2Seconds1));	// Formating the time with the "DecimalFormat (just to make sure)


		// mile 2 Time
		System.out.print(fName2+", please input your time to complete the second mile (mm:ss.sss): ");
		String t2Time2 = input.nextLine();
		int t2Minutes2 = Integer.parseInt(t2Time2.split(":")[0]);
		double t2Seconds2 = Double.parseDouble(t2Time2.split(":")[1]);		//Human interface, and splitting the time into minutes and seconds second number

		double t2SecTotal2 = (int) (t2Minutes2) * CONVERSION + t2Seconds2;	//Converting all to seconds
		int t2MinSec2 = (int)t2SecTotal2 - (int)t2SecTotal1;				//Finding the total number of minutes in seconds for the second split
		int t2Min2 = t2MinSec2/CONVERSION;									//Converting the minutes in seconds to minutes
		double t2Sec2 = (t2SecTotal2-t2SecTotal1)-(t2Min2*CONVERSION);		//Finding the number of seconds based on the number of minutes
		String t2Split1 = t2Min2+":"+(formatter.format(t2Sec2));			//Displaying the time in the proper format
		

		// mile 3 Time
		System.out.print(fName2+", please input your final time to complete the entire 5km (mm:ss.sss): ");
		String t2Time3 = input.nextLine();
		int t2Minutes3 = Integer.parseInt(t2Time3.split(":")[0]);
		double t2Seconds3 = Double.parseDouble(t2Time3.split(":")[1]);		//Human interface, and splitting the time into minutes and seconds third number
		
		String t2SplitTotal = t2Minutes3+":"+formatter.format(t2Seconds3);
		
		double t2SecTotal3 = (int)(t2Minutes3)*CONVERSION +t2Seconds3;		//Converting all the units to seconds
		int t2minsec3 = (int)(t2SecTotal3 - t2SecTotal2);					//Finding the total number of minutes in second form for the third split
		int t2min3 = t2minsec3/CONVERSION;									//Converting the minutes in seconds to minutes
		double t2sec3 = (t2SecTotal3-t2SecTotal2)-t2min3*CONVERSION;		//Finding the number of seconds based on the number of minutes
		String t2Split3 = t2min3+":"+(formatter.format(t2sec3));			//Displaying the time in the proper format

		
		//Runner 2 Summary Chart
		System.out.println("");
		System.out.println("Runner One Summary");							
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("");
		System.out.printf("Name: %10s%n",tName2);							//Displaying the Name of the Runner
		System.out.printf("Mile One: %10s%n", t2Split1);					//Split One
		System.out.printf("Mile Two: %10s%n", t2Split2);					//Split Two
		System.out.printf("Mile Three: %5s%n", t2Split3);					//Split Three
		System.out.printf("Total Time: %s%n%n", t2SplitTotal);				//Complete Time
		
		
		//Runner Three
		
		// Name of Runner
		System.out.print("Please write your first and last name: ");		//Gathering the name from the user
		String name3 = input.nextLine();
		String fName3 = (name3.split(" ")[0]);
		String lName3 = (name3.split(" ")[1]);
		String tName3 = lName3+","+fName3;
		
		
		// mile 1 Time
		System.out.print(fName3+", please input your time for the first mile (mm:ss.sss): ");
		String t3Time1 = input.nextLine();
		int t3Minutes1 = Integer.parseInt(t3Time1.split(":")[0]);
		double t3Seconds1 = Double.parseDouble(t3Time1.split(":")[1]);		//dividing the given time into minutes and seconds

		double t3SecTotal1 = (int) (t3Minutes1) * CONVERSION + t3Seconds1;	// Converting from individual numbers to seconds
		String t3Split1 = t3Minutes1+":"+(formatter.format(t3Seconds1));	// Formating the time with the "DecimalFormat (just to make sure)


		// mile 2 Time
		System.out.print(fName3+", please input your time to complete the second mile (mm:ss.sss): ");
		String t3Time2 = input.nextLine();
		int t3Minutes2 = Integer.parseInt(t3Time2.split(":")[0]);
		double t3Seconds2 = Double.parseDouble(t3Time2.split(":")[1]);		//splitting the time into minutes and seconds second number

		double t3SecTotal2 = (int) (t3Minutes2) * CONVERSION + t3Seconds2;	//Converting all to seconds
		int t3MinSec2 = (int)t3SecTotal2 - (int)t3SecTotal1;				//Finding the total number of minutes in seconds for the second split
		int t3Min2 = t3MinSec2/CONVERSION;									//Converting the minutes in seconds to minutes
		double t3Sec2 = (t3SecTotal2-t3SecTotal1)-(t3Min2*CONVERSION);		//Finding the number of seconds based on the number of minutes
		String t3Split2 = t3Min2+":"+(formatter.format(t3Sec2));			//Displaying the time in the proper format
		

		// mile 3 Time
		System.out.print(fName3+", please input your final time to complete the entire 5km (mm:ss.sss): ");
		String t3Time3 = input.nextLine();
		int t3Minutes3 = Integer.parseInt(t3Time3.split(":")[0]);
		double t3Seconds3 = Double.parseDouble(t3Time3.split(":")[1]);		//Human interface, and splitting the time into minutes and seconds third number
		
		String t3SplitTotal = t3Minutes3+":"+formatter.format(t3Seconds3);
		
		double t3SecTotal3 = (int)(t3Minutes3)*CONVERSION +t3Seconds3;		//Converting all the units to seconds
		int t3minsec3 = (int)(t3SecTotal3 - t3SecTotal2);					//Finding the total number of minutes in second form for the third split
		int t3min3 = t3minsec3/CONVERSION;									//Converting the minutes in seconds to minutes
		double t3sec3 = (t3SecTotal3-t3SecTotal2)-t3min3*CONVERSION;		//Finding the number of seconds based on the number of minutes
		String t3Split3 = t3min3+":"+(formatter.format(t3sec3));			//Displaying the time in the proper format

		
		
		//Runner 3 Summary Chart
		System.out.println("");
		System.out.println("Runner One Summary");							
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("");
		System.out.printf("Name: %10s%n",tName3);							//Displaying the Name of the Runner
		System.out.printf("Mile One: %10s%n", t3Split1);					//Split One
		System.out.printf("Mile Two: %10s%n", t3Split2);					//Split Two
		System.out.printf("Mile Three: %5s%n", t3Split3);					//Split Three
		System.out.printf("Total Time: %s%n%n", t3SplitTotal);				//Complete Time
		
		
		//Runner Four
		// Name of Runner
		System.out.print("Please write your first and last name: ");		//Gathering the name from the user
		String name4 = input.nextLine();
		String fName4 = (name4.split(" ")[0]);
		String lName4 = (name4.split(" ")[1]);
		String tName4 = lName4+","+fName4;
		
		
		// mile 1 Time
		System.out.print(fName4+", please input your time for the first mile (mm:ss.sss): ");		
		String t4Time1 = input.nextLine();
		int t4Minutes1 = Integer.parseInt(t4Time1.split(":")[0]);
		double t4Seconds1 = Double.parseDouble(t4Time1.split(":")[1]);		//dividing the time given into minutes and seconds

		double t4SecTotal1 = (int) (t4Minutes1) * CONVERSION + t4Seconds1;	// Converting from individual numbers to seconds
		String t4Split1 = t4Minutes1+":"+(formatter.format(t4Seconds1));	// Formating the time with the "DecimalFormat (just to make sure)


		// mile 2 Time
		System.out.print(fName4+", please input your time to complete the second mile (mm:ss.sss): ");
		String t4Time2 = input.nextLine();
		int t4Minutes2 = Integer.parseInt(t4Time2.split(":")[0]);
		double t4Seconds2 = Double.parseDouble(t4Time2.split(":")[1]);		//Human interface, and splitting the time into minutes and seconds second number

		double t4SecTotal2 = (int) (t4Minutes2) * CONVERSION + t4Seconds2;	//Converting all to seconds
		int t4MinSec2 = (int)t4SecTotal2 - (int)t4SecTotal1;				//Finding the total number of minutes in seconds for the second split
		int t4Min2 = t4MinSec2/CONVERSION;									//Converting the minutes in seconds to minutes
		double t4Sec2 = (t4SecTotal2-t4SecTotal1)-(t4Min2*CONVERSION);		//Finding the number of seconds based on the number of minutes
		String t4Split2 = t4Min2+":"+(formatter.format(t4Sec2));			//Displaying the time in the proper format
		

		// mile 3 Time
		System.out.print(fName4+", please input your final time to complete the entire 5km (mm:ss.sss): ");
		String t4Time3 = input.nextLine();
		int t4Minutes3 = Integer.parseInt(t4Time3.split(":")[0]);
		double t4Seconds3 = Double.parseDouble(t4Time3.split(":")[1]);		//Human interface, and splitting the time into minutes and seconds third number
		
		String t4SplitTotal = t4Minutes3+":"+formatter.format(t4Seconds3);
		
		double t4SecTotal3 = (int)(t4Minutes3)*CONVERSION +t4Seconds3;		//Converting all the units to seconds
		int t4minsec3 = (int)(t4SecTotal3 - t4SecTotal2);					//Finding the total number of minutes in second form for the third split
		int t4min3 = t4minsec3/CONVERSION;									//Converting the minutes in seconds to minutes
		double t4sec3 = (t4SecTotal3-t4SecTotal2)-t4min3*CONVERSION;		//Finding the number of seconds based on the number of minutes
		String t4Split3 = t4min3+":"+(formatter.format(t4sec3));			//Displaying the time in the proper format

		
		
		//Runner 4 Summary Chart
		System.out.println("");
		System.out.println("Runner One Summary");							
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("");
		System.out.printf("Name: %10s%n",tName4);							//Displaying the Name of the Runner
		System.out.printf("Mile One: %10s%n", t4Split1);					//Split One
		System.out.printf("Mile Two: %10s%n", t4Split2);					//Split Two
		System.out.printf("Mile Three: %5s%n", t4Split3);					//Split Three
		System.out.printf("Total Time: %s%n%n", t4SplitTotal);				//Complete Time
		
		//Runner Five
		// Name of Runner
		System.out.print("Please write your first and last name: ");		//Gathering the name from the user
		String name5 = input.nextLine();
		String fName5 = (name5.split(" ")[0]);
		String lName5 = (name5.split(" ")[1]);
		String tName5 = lName5+","+fName5;
		
		
		// mile 1 Time
		System.out.print(fName1+", please input your time for the first mile (mm:ss.sss): ");
		String t5Time1 = input.nextLine();
		int t5Minutes1 = Integer.parseInt(t5Time1.split(":")[0]);
		double t5Seconds1 = Double.parseDouble(t5Time1.split(":")[1]);		//dividing the given time into minutes and seconds

		double t5SecTotal1 = (int) (t5Minutes1) * CONVERSION + t5Seconds1;	// Converting from individual numbers to seconds
		String t5Split1 = t5Minutes1+":"+(formatter.format(t5Seconds1));	// Formating the time with the "DecimalFormat (just to make sure)


		// mile 2 Time
		System.out.print(fName1+", please input your time to complete the second mile (mm:ss.sss): ");
		String t5Time2 = input.nextLine();
		int t5Minutes2 = Integer.parseInt(t5Time2.split(":")[0]);
		double t5Seconds2 = Double.parseDouble(t5Time2.split(":")[1]);		//Human interface, and splitting the time into minutes and seconds second number

		double t5SecTotal2 = (int) (t5Minutes2) * CONVERSION + t5Seconds2;	//Converting all to seconds
		int t5MinSec2 = (int)t5SecTotal2 - (int)t5SecTotal1;				//Finding the total number of minutes in seconds for the second split
		int t5Min2 = t5MinSec2/CONVERSION;									//Converting the minutes in seconds to minutes
		double t5Sec2 = (t5SecTotal2-t5SecTotal1)-(t5Min2*CONVERSION);		//Finding the number of seconds based on the number of minutes
		String t5Split2 = t5Min2+":"+(formatter.format(t5Sec2));			//Displaying the time in the proper format
		

		// mile 3 Time
		System.out.print(fName1+", please input your final time to complete the entire 5km (mm:ss.sss): ");
		String t5Time3 = input.nextLine();
		int t5Minutes3 = Integer.parseInt(t5Time3.split(":")[0]);
		double t5Seconds3 = Double.parseDouble(t5Time3.split(":")[1]);		//Human interface, and splitting the time into minutes and seconds third number
		
		String t5SplitTotal = t5Minutes3+":"+formatter.format(t5Seconds3);
		
		double t5SecTotal3 = (int)(t5Minutes3)*CONVERSION +t5Seconds3;		//Converting all the units to seconds
		int t5minsec3 = (int)(t5SecTotal3 - t5SecTotal2);					//Finding the total number of minutes in second form for the third split
		int t5min3 = t5minsec3/CONVERSION;									//Converting the minutes in seconds to minutes
		double t5sec3 = (t5SecTotal3-t5SecTotal2)-t5min3*CONVERSION;		//Finding the number of seconds based on the number of minutes
		String t5Split3 = t5min3+":"+(formatter.format(t5sec3));			//Displaying the time in the proper format

		
		
		//Runner 5 Summary Chart
		System.out.println("");
		System.out.println("Runner One Summary");							
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("");
		System.out.printf("Name: %10s%n",tName5);							//Displaying the Name of the Runner
		System.out.printf("Mile One: %10s%n", t5Split1);					//Split One
		System.out.printf("Mile Two: %10s%n", t5Split2);					//Split Two
		System.out.printf("Mile Three: %5s%n", t5Split3);					//Split Three
		System.out.printf("Total Time: %s%n%n%n", t5SplitTotal);			//Complete Time
		
		//Complete Summary of All Five Runners
		
		
		String mileOne = "Mile One";					//Declaring the titles of each split as a string for formating purposes
		String mileTwo = "Mile Two";
		String mileThree = "Mile Three";
		String totalMile = "Total Distance (5km)";
		
		
		System.out.println("Complete Runner Summary");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("");
		System.out.printf("Names %34s%30s%30s%38s%n", mileOne, mileTwo, mileThree, totalMile);			//displaying the categories of the table
		System.out.printf("%-20s:%19s%30s%29s%30s%n",tName1,t1Split1,t1Split2,t1Split3,t1SplitTotal);	//displaying runner one (with formatted splits) %s = aligning the names to be under the headings
		System.out.printf("%-20s:%19s%30s%29s%30s%n",tName2,t2Split1,t2Split2,t2Split3,t2SplitTotal);	//displaying runner two (with formatted splits)
		System.out.printf("%-20s:%19s%30s%29s%30s%n",tName3,t3Split1,t3Split2,t3Split3,t3SplitTotal);	//displaying runner three (with formatted splits)
		System.out.printf("%-20s:%19s%30s%29s%30s%n",tName4,t4Split1,t4Split2,t4Split3,t4SplitTotal);	//displaying runner four (with formatted splits)
		System.out.printf("%-20s:%19s%30s%29s%30s%n",tName5,t5Split1,t5Split2,t5Split3,t5SplitTotal);	//displaying runner five (with formatted splits)
		
		
		input.close(); //Closing the Scanner.in
	}
}
