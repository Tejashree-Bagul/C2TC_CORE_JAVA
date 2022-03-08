package com.tns.coreJava;

public class Switch_Demo4 {

	public static void main(String[] args) {
		
		int x = 10;
		final int y = 20;
		switch(x) {
		
		case 10 :
			    System.out.println(10);
			    break;
			    
		case y :          //case label should be constant value not a variable
			   System.out.println(20);
			   break;
		}

	}

}
