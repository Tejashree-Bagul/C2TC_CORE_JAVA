package com.tns.coreJava;

public class ExceptionHandlingDemo2 {

	public static void main(String[] args) {
		
        m1();
		
	}
	static void m1() {
	
	    m2();
	    
	}
    static void m2() {

    	System.out.println("Hello M11");
    	System.out.println(10/0);         //Exception
    	
    }

}
