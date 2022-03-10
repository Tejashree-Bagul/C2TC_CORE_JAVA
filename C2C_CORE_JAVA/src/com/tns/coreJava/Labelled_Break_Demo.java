package com.tns.coreJava;

public class Labelled_Break_Demo {

	public static void main(String[] args) {
		
		int x = 10;
		l: {
			
			System.out.println("Login");
			if(x == 10)
				 break l;
			System.out.println("End");
			
		}
        System.out.println("Hello");
	}

}
