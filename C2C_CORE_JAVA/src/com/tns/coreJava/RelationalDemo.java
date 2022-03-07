package com.tns.coreJava;

public class RelationalDemo {
    //==,!=,>,<,>=,<=---> always gives o/p as true or false.
	public static void main(String... args) {
		
		int n1 = 10;
		int n2 = 30;
		
		boolean ans;
		
		ans = (n1 == n2);
		System.out.println(ans);
		
		ans = (n1 > n2);
		System.out.println(ans);
		
		ans = (n1 < n2);
		System.out.println(ans);
		
		ans = (n1 >= n2);
		System.out.println(ans);
		
		ans = (n1 <= n2);
		System.out.println(ans);
		
		ans = (n1 != n2);
		System.out.println(ans);		

	}

}
