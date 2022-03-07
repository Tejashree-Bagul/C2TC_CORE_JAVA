package com.tns.coreJava;
class Football {
	
	
}
public class Cricket {

	public static void main(String[] args) {
		
		Cricket t20 = new Cricket();
		Cricket test = new Cricket();
		Football fmatch = new Football();
		
		System.out.println(test instanceof Cricket);
		System.out.println(t20 instanceof Object);
		System.out.println(fmatch instanceof Football);
		System.out.println(fmatch instanceof Object);
		

	}

}
