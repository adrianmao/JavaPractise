package com.ibm.day05;

public class RabbitAndCarrot {
	public static int totalCount=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(totalCount);
		countDays(4);
		System.out.println(totalCount);

	}
	
	public static void countDays(int totalDays){

		for(int i=1;i<=totalDays;i++){
			if(i==totalDays)
				totalCount++;
			else
				countDays(totalDays-i);
		}
	}

}
