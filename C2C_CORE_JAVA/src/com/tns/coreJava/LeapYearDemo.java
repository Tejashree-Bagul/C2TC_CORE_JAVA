package com.tns.coreJava;
import java.io.*;
public class LeapYearDemo {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter year : ");
		
		int n  = Integer.parseInt(br.readLine());
		if(n % 400 == 0 ||  (n % 100 != 0 && n % 4 == 0)) 
		
		      System.out.println(n + " is a leap year");
		      
		else
			  System.out.println(n + " is not a leap year");		

	}

}
