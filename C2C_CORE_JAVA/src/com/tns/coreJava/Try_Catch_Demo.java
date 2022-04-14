package com.tns.coreJava;

public class Try_Catch_Demo {

	public static void main(String[] args) {
		
		System.out.println("M11 is best");
		
		try {
			
			System.out.println(2/0);
		}catch(ArithmeticException e) {
			
			System.out.println("Dont divide by zero");
			System.out.println(2/2);
			System.out.println(e);
		}
        System.out.println("M11 is dirty");
	}

}
