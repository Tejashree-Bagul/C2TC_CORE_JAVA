package com.tns.coreJava;
import java.util.*;
public class AddTwoNO {

	public static void main(String[] args) {
		
		System.out.println("Enter the two numbers : ");
		Scanner input = new Scanner(System.in);
		
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		
		System.out.println("The addition of two numbers is : " + (n1+n2));

	}

}
