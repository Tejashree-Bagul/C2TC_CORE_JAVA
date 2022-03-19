package com.tns.coreJava;

public class StringDemo1 {

	public static void main(String[] args) {
		
		boolean bol = true;
		int i = 10;
		String s1 = "Tejashree";
		String s2 = new String("Tejashree");
		String s6 = new String("Bagul");
		
		//Methods
		//1.length()
        System.out.println(s1.length());
        
        //2.equals()
        System.out.println(s1.equals(s2));
        
        //3.valueOf - valueOf() method converts different types of values into string. By the help of string valueOf() method, we can convert int to string, long to string, boolean to string, character to string, float to string, double to string, object to string and char array to string.
        String s3 = String.valueOf(i);
        System.out.println(s3);
        System.out.println(s3+20);  //concatenating string
        
        String s4 = String.valueOf(bol);
        System.out.println(s4);
        
        char chr[] = {'J','A','V','A'};
        String s5 = String.valueOf(chr);
        System.out.println(s5);
        
        //4.compareTo()
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s6));
        
        //5.concat()
        System.out.println(s1.concat(s6));
        
        //6.replace()
        System.out.println(s1.replace('a','u'));
        
        //7.startsWith()
        System.out.println(s1.startsWith("Tej"));
        
        //8.endsWith()
        System.out.println(s6.endsWith("ul"));
        
        //9.indexOf()
        System.out.println(s1.indexOf("j"));
        
        //10.substring()
        System.out.println(s1.substring(3));
        System.out.println(s1.substring(3,6));
        
        //11.toUpperCase()
        System.out.println(s1.toUpperCase());
        
        //12.toLowerCase()
        System.out.println(s6.toLowerCase());
        
        
	}

}