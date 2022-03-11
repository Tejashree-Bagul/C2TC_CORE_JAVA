package com.tns.coreJava;

public class Array_Demo3 {

	public static void main(String[] args) {
		
		boolean[] barr = new boolean[3];
		System.out.println("Class Name for boolean : " + barr.getClass().getName());
		
		byte[] bytearr = new byte[3];
		System.out.println("Class Name for byte : " + bytearr.getClass().getName());
		
	    char[] chararr = new char[3];
		System.out.println("Class Name for char : " + chararr.getClass().getName());
		
		double[] doublearr = new double[3];
		System.out.println("Class Name for double : " + doublearr.getClass().getName());
		
		short[] shortarr = new short[3];
		System.out.println("Class Name for short : " + shortarr.getClass().getName());
		
		long[] longarr = new long[3];
		System.out.println("Class Name for long : " + longarr.getClass().getName());
		
		int[] arr = {10,20,30,40,50};
		System.out.println("Class Name for Integer : " + arr.getClass().getName());
		
		float[] farr = {10.2f,15.4f,25.8f,8.63f};
		System.out.println("Class Name for Float : " + farr.getClass().getName());
		
		System.out.println("Integer Numbers in an array are : ");
		
		for(int i=0; i<arr.length; i++) {
			
		         System.out.println(arr[i]);	
		        
		}
		System.out.println("Float Numbers present in an Array are : ");
		for(int i=0; i<farr.length; i++) {
			
			System.out.println(farr[i]);
		}
	}

}
