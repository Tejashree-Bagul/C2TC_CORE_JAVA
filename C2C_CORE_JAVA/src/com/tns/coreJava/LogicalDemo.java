package com.tns.coreJava;

public class LogicalDemo {
    //Logical ---> && , || ----> returns true or false 
	public static void main(String[] args) {
		
		int num1 = 20;
		int num2 = 30;
		
		boolean ans;
		ans = (num1 == num2) && (num1 < num2);
		
		System.out.println(ans);
		
		ans = (num1 > num2) || (num1 < num2);
		System.out.println(ans);
		

	}

}
