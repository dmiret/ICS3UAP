package com.bayviewglen.dayfive;

public class ExampleTwo {

	public static void main(String[] args) {
		String MileOne = "Mile One";
		String MileTwo = "Mile Two";
		String MileThree = "Mile Three";
		String TotalMile = "Total Distance (5km)";
		
		String t1split1 = "3:54.000";
		String t1splitTotal = "5:66.000";
		String tname1 = "Albert Allistar";
		String f1= (tname1.split(" ")[0]);
		String l1 = (tname1.split(" ")[1]);
		String t1t = l1+","+f1;
		
		
		String tname2 = "Rebecca Tyranitary";
		String f2= (tname2.split(" ")[0]);
		String l2= (tname2.split(" ")[1]);
		String t2t = l2+","+f2;
		
		
		String tname3 = "TJ Bake";
		String f3= (tname3.split(" ")[0]);
		String l3 = (tname3.split(" ")[1]);
		String t3t = l3+","+f3;
		
		String tname4 = "Daniel Rob"; 
		String f4= (tname4.split(" ")[0]);
		String l4 = (tname4.split(" ")[1]);
		String t4t = l4+","+f4;
		
		
		String tname5 = "Bob Dave";
		String f5= (tname5.split(" ")[0]);
		String l5 = (tname5.split(" ")[1]);
		String t5t = l5+","+f5;

		System.out.printf("Distances:%44s%30s%30s%38s%n", MileOne, MileTwo, MileThree, TotalMile);
		System.out.printf("Runner One: %22s:%19s%30s%29s%30s%n",t1t,t1split1,t1split1,t1split1,t1splitTotal);
		System.out.printf("Runner Two: %22s:%19s%30s%29s%30s%n",t2t,t1split1,t1split1,t1split1,t1splitTotal);
		System.out.printf("Runner Three: %20s:%19s%30s%29s%30s%n",t3t,t1split1,t1split1,t1split1,t1splitTotal);
		System.out.printf("Runner Four: %21s:%19s%30s%29s%30s%n",t4t,t1split1,t1split1,t1split1,t1splitTotal);
		System.out.printf("Runner Five: %21s:%19s%30s%29s%30s%n",t5t,t1split1,t1split1,t1split1,t1splitTotal);
		

	}

}
