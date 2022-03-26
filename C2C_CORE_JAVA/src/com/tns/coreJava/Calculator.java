package com.tns.coreJava;
import java.io.*;
public class Calculator {

	public static void main(String[] args) throws IOException {
		
		 int result = 0;

         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

         System.out.println("Enter the 1st Number : ");
         int num1 = Integer.parseInt(br.readLine());

         System.out.println("Enter the 2nd Number : ");
         int num2 = Integer.parseInt(br.readLine());

         System.out.println("Choose an Operator : +, -, *, /, %");
         char operator = (char)br.read();

         switch(operator)  {

               case '+' :
                       result = num1 + num2;
                       System.out.println(result);
                       break;

               case '-' :  
                       result = num1 - num2;
                       System.out.println(result);
                       break;

               case '*' :
                       result = num1 * num2;
                       System.out.println(result);
                       break;

               case '/' :
                       result = num1 / num2;
                       System.out.println(result);
                       break;

               case '%' :
                       result = num1 % num2;
                       System.out.println(result);
                       break;
          
               default :
                       System.out.println("Please Enter Valid Operator");
                       break;

          }
    }
}


		

	


