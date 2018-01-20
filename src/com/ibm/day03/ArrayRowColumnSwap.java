package com.ibm.day03;

public class ArrayRowColumnSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		printarray(arr);
	}

	public static void printarray(int[][] arr ){
//		for(int[] a:arr){
//			for(int b:a){
//				System.out.print(a[][b]);
//			}
//		}
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print("\t"+arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public static int swaparray(int[][] arr){
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print("\t"+arr[i][j]);
			}
			System.out.println();
		}
		return 1;
	}
	
}
