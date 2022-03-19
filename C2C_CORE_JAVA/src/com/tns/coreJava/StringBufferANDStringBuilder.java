package com.tns.coreJava;

public class StringBufferANDStringBuilder {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Tejashree");
		StringBuffer sb1 = new StringBuffer();
		
		StringBuilder sb2 = new StringBuilder("Bagul");
		//1.length()
		System.out.println(sb.length());
		System.out.println(sb1.length());
		System.out.println(sb2.length());
		
		//2.capacity()
		System.out.println(sb.capacity());
		System.out.println(sb1.capacity());
		System.out.println(sb2.capacity());
		
		//3.charAt()
		System.out.println(sb.charAt(4));
		
		//4.append()
		System.out.println(sb.append(sb2));
		System.out.println(sb.append("C2TCProgram"));
		
		//5.insert()
		System.out.println(sb2.insert(5,"TechnoServe"));
		
		//6.delete()
		System.out.println(sb.delete(3, 7));
		
		//7.reverse()
		System.out.println(sb2.reverse());
		
		//8.setLength()
		sb.setLength(6);
		System.out.println(sb);


		
	}

}
