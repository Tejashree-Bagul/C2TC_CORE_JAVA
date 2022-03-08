package com.tns.coreJava;

public class Switch_Demo2 {

	public static void main(String[] args) {
		
		int x = 10;
		switch ( x) {
		
		case 'a' :    //ascii value of a is 97 (duplicate value is there) that's why it shows error
			     System.out.println("a");
			     break;
			     
		case 97 :
			     System.out.println("97");
			     break;
			     
		default : 
			    System.out.println("Default");
			    break;
			     
		}

	}

}
