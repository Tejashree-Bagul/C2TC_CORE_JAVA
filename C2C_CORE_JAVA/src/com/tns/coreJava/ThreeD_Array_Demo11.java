package com.tns.coreJava;
import java.io.*;
public class ThreeD_Array_Demo11 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter plane and rows and columns : ");
		
		int plane = Integer.parseInt(br.readLine());
		int rows = Integer.parseInt(br.readLine());
		int col = Integer.parseInt(br.readLine());
		
		System.out.println("Enter Elements : ");
		int[][][] arr = new int[plane][rows][col];
        for(int i=0; i<plane; i++) {
			
			for(int j=0; j<rows; j++) {
				
				for(int k=0; k<col; k++) {
					
				     arr[i][j][k] = Integer.parseInt(br.readLine());
					
				}
			}
		}
        for(int i=0; i<plane; i++) {
			
			if(i==1)
				System.out.println("2nd plane : ");
			for(int j=0; j<rows; j++) {
				
				for(int k=0; k<col; k++) {
					
					System.out.print(arr[i][j][k] + "   ");
					
				}
				System.out.println();
			}
		}
	}
}
