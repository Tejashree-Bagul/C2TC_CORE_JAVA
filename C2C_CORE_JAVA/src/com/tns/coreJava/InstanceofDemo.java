package com.tns.coreJava;

public class InstanceofDemo {

	public static void main(String[] args) {
		
		 InstanceofDemo operator = new InstanceofDemo();
		 InstanceofDemo operator1 = null;
		 
		 boolean res;
		 res = operator instanceof InstanceofDemo;
		 
		 System.out.println(res);
		 
		 res = operator1 instanceof InstanceofDemo;
		 System.out.println(res);

	}

}
