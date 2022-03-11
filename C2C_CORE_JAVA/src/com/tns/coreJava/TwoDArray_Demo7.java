package com.tns.coreJava;

public class TwoDArray_Demo7 {

	public static void main(String[] args) {
		
		int[][] arr = new int[3][];
		arr[0] = new int[] {10,20,30};
		arr[1] = new int[] {40,50};
		arr[2] = new int[] {60,70,80,90};
		
		System.out.println("First Array: ");
		for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j<arr[i].length; j++) {
				
				System.out.print(arr[i][j] + "  ");
			}
			System.out.println();
		}
		System.out.println("Second Array : ");
		int[][] iarr = {new int[] {1,2},
				        new int[] {3,4,5},
				        new int[] {6,7,8,9}
		
		               };
        for(int i=0; i<iarr.length; i++) {
			
			for(int j=0; j<iarr[i].length; j++) {
				
				System.out.print(iarr[i][j] + "  ");
			}
			System.out.println();
		}

	}

}
