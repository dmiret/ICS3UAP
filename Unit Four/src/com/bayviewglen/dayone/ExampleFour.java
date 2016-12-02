package com.bayviewglen.dayone;

public class ExampleFour {

	public static void main(String[] args) {
		int nums = 0;
		int nums2 = 0;
		int i = 1;
		
		while(i<=100){
			if(i%2==0){
				nums+=i;
			}
			i++;
		}
		System.out.println(nums);
	
	for(int j = 1;j<=100;j++){
		if(j%2==0){
			nums2+=j;
		}
	}
	System.out.println(nums2);
	}
}
