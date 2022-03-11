package com.tns.coreJava;
import java.io.*;
public class Array_Demo5 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of an Array : ");
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		System.out.println("Enter the elements : ");
		for(int i=0; i<arr.length; i++) {
			
			   arr[i] = Integer.parseInt(br.readLine());
			   
		}
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]%5 == 0) {
				
				 System.out.println("Numbers divisible by 5 are : " + arr[i]);
				 
			}else {
			
				System.out.println("Numbers not divisible by 5 are : " + arr[i]);
				
			}
			
		}
 
	}

}
