package com.tns.coreJava;
import java.io.*;
public class Array_Demo4 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of an array :  ");
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		System.out.println("Enter the elements in an array :  ");
		for(int i=0; i<arr.length; i++)  {
			
			 arr[i] = Integer.parseInt(br.readLine());
		}
		System.out.println("Elements present in an array are : ");
		for(int i=0; i<arr.length; i++)  {
			
			System.out.println(arr[i]);
		}
	}

}
