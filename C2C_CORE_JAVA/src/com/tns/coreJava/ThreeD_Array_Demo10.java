package com.tns.coreJava;

public class ThreeD_Array_Demo10 {

	public static void main(String[] args) {
	
		int plane = 2, rows = 3, cols = 3;
		int arr[][][] = {{{1,2,3},{4,5,6},{7,8,9}},{{10,11,12},{13,14,15},{16,17,18}}};
		
		System.out.println("1st plane : ");
		for(int i=0; i<plane; i++) {
			
			if(i==1)
				System.out.println("2nd plane : ");
			for(int j=0; j<rows; j++) {
				
				for(int k=0; k<cols; k++) {
					
					System.out.print(arr[i][j][k] + "   ");
					
				}
				System.out.println();
			}
		}
		

	}

}
