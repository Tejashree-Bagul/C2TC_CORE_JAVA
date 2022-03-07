package com.tns.coreJava;

public class If_Else_Demo {

	public static void main(String[] args) {
		
		int x = 0;
		if(x) {                  //Error-type mismatch...we only give boolean values
			
			 System.out.println("Good Morning");
			 
		}else {
			
			System.out.println("Good Noon");
			
		}

	}

}
