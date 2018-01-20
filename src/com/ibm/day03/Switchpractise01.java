package com.ibm.day03;

import  java.util.Scanner;

public class Switchpractise01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a score");
//		System.out.print(score);		
		int score = 0;			
		try{
			score = sc.nextInt();
		} catch (Exception e){
			System.out.println(e);
		}
		
		switch(score){
		case 0:
		case 1:
		case 2:
			System.out.print("Not pass");
			break;
		case 3:
			System.out.print("Pass");
			break;
		case 4:
			System.out.print("good");
			break;
		case 5:
			System.out.print("Excellent");
			break;
		default:
			System.out.print("Not a valid score");
		}
	}

}
