package com.ibm.day03;

/*
 * 杨辉三角练习
 * 
 */
import java.util.Scanner;

public class TwodimentialArray {

	public static void main(String[] args) {
		int[][] yangTrangle = new int[20][];
//		System.out.print("Hello world!");
//		System.out.print(yangTrangle.length);
		for(int i = 0;i<yangTrangle.length;i++){
			yangTrangle[i] = new int[i+1]; 
			for(int k = 0;k <= i;k++){
				if(k == 0||k == (yangTrangle[i].length - 1)){
					yangTrangle[i][k] = 1;
				}
				else{
				yangTrangle[i][k] = yangTrangle[i-1][k] + yangTrangle[i-1][k-1];
				}
				System.out.print(yangTrangle[i][k] + "\t");
			}
			System.out.print("\n");
		}
		

	}

}
