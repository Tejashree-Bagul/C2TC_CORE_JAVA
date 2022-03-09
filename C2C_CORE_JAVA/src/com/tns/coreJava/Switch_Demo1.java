package com.tns.coreJava;
import java.io.*;
public class Switch_Demo1 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number : ");
        
        int x = Integer.parseInt(br.readLine());
        switch(x) {
        
        case 0 : 
        	   System.out.println(0);
        	   break;
        	   
        case 1 :
        	   System.out.println(1);
        	   
        	   
        case 2 :
        	   System.out.println(2);
        	  
        	   
        default :
        	   System.out.println("Default statement");
        	   break;
        }
                   
	}

}
