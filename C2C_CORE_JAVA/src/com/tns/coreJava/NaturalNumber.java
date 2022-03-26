package com.tns.coreJava;
import java.io.*;
public class NaturalNumber {

	public static void main(String[] args) throws IOException {
		int sum = 0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("Enter the number : ");
	    
	    int n = Integer.parseInt(br.readLine());
	    for(int i=1; i<=n; i++) {
	    	
	    	sum = sum + i;
	     
	    }
	    System.out.println("Sum of natural number is : " + sum);
	}

}
