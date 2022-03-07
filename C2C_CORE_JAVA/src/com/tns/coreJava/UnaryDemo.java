package com.tns.coreJava;

public class UnaryDemo {

	public static void main(String[] args) {
		
		int num = 10;
		int ans = 0;
		
		ans = +num;
		System.out.println(ans);
		
		ans = -num;                   
		System.out.println(ans);
		
		ans = ++num;                   //preIncrement
		System.out.println(ans);
		
		ans = --num;                   //preDecrement
		System.out.println(ans);
		
		ans = num++;                    //postIncrement
		System.out.println(ans);
		
		ans = num--;                    //postDecrement
		System.out.println(ans);
	
		//boolean num = true;
		//System.out.println(!num);      //false
		

	}

}
