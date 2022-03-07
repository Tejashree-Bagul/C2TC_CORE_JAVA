package com.tns.coreJava;
import java.io.*;
public class EvenOddDemo {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please Enter the number : ");
		int n = Integer.parseInt(br.readLine());

		if (n%2 == 0) 
			System.out.println(n + " is Even number");
		else
			System.out.println(n + " is Odd number");

	}

}
