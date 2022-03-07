package com.tns.coreJava;

public class BitwiseDemo {
    // &,|,^,~,<<,>>,>>>
	public static void main(String[] args) {
		
		int num1 = 9;
		int num2 = 10;
		int ans = 0;
		
		ans = num1 & num2;
		System.out.println(ans);

		ans = num1 | num2;
		System.out.println(ans);
		
		ans = num1 ^ num2;
		System.out.println(ans);
		
		ans = ~ num2;
		System.out.println(ans);
		
		
	}

}
