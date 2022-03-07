package com.tns.coreJava;

public class VariablesDemo {

	int mobile = 2;               //instance variable
	static int tv = 1;         //static variable
	
	public static void main(String[] args) {
		
		VariablesDemo obj = new VariablesDemo();
		System.out.println("Instance Variable : " + obj.mobile);
		System.out.println("Static Variable : " + VariablesDemo.tv);
		
		int x = 10;            //Local variable
		System.out.println("Local Variable : " + x);

	}

}
