package com.tns.coreJava;
import java.io.*;
public class ArmstrongNumber {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number : ");
        
        int n = Integer.parseInt(br.readLine());
        int sum =0;
        int rem,num;
        num = n;
        
        for(;num != 0;) {
        	
        	rem = num % 10;
        	sum = sum + rem * rem * rem;
        	num /= 10;
        	
        }
        if(sum == n)

            System.out.println(n + " is an Armstrong Number");

        else

            System.out.println(n + " is not an Armstrong Number");
	}

}
