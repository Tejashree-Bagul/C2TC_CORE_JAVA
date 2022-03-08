package com.tns.coreJava;

public class Switch_Demo7 {

	public static void main(String[] args) {
		
		byte b = 10;
		switch(b) {
		
		case 10 :
			    System.out.println("Ten");
			    break;
			    
		case 1000 :   //error- byte range is out of bound
			    System.out.println("Thousand");
			    break;
			    
	    default :
	    	    System.out.println("Default");
	    	    break;
			
		}

	}

}
