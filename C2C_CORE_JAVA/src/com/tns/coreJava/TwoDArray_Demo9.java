package com.tns.coreJava;

import java.io.*;
import java.io.InputStreamReader;

public class TwoDArray_Demo9 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter rows and columns : ");
		
		int rows = Integer.parseInt(br.readLine());
		int col = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[rows][col];
		arr[0] = new int [3];
		arr[1] = new int [2];
		arr[2] = new int [5];
		
		System.out.println("Enter the elements");
		for(int i=0; i<arr.length; i++ ) {
			
			for(int j=0; j<arr[i].length; j++) {
				
				arr[i][j] = Integer.parseInt(br.readLine());
			}
		}
		System.out.println("Elements in an array are : ");
		for(int i=0; i<arr.length; i++ ) {
			
			for(int j=0; j<arr[i].length; j++) {
				
				System.out.print(arr[i][j]  + "   ");
			}
			System.out.println();
		}
		

	}

}
