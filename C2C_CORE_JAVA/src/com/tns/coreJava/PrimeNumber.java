package com.tns.coreJava;
import java.io.*;
public class PrimeNumber {

	public static void main(String[] args) throws IOException {
		
		int i,m=0,flag=0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		  System.out.println("Enter the number");  
	      int n = Integer.parseInt(br.readLine());  

	      m=n/2;  
	    
	      if(n == 0 || n == 1) {
	  
	            System.out.println(n + " is not prime number");
	      
	      }else {  

	           for(i = 2; i <= m; i++) {  
	    
	                if(n%i == 0) {  
	    
	                      System.out.println(n+" is not prime number");      
	                      flag=1;      
	                      break;      
	                }      
	           }      
	           if(flag==0)  { 
	              
	                 System.out.println(n+" is prime number"); }  
	       }  
		

	}

}
