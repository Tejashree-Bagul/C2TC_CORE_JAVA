package com.tns.coreJava;

public class Student {
	
	String name = "Tejashree";
	int rollno = 35;
	int age = 24;
	
	public Student()  {
		
		System.out.println("No parameterised Constructor");
	}

	public static void main(String[] args) {
		
		Student obj = new Student();
		System.out.println("Name : " + obj.name);
		System.out.println("Roll no : "  + obj.rollno);
		System.out.println("Age : " + obj.age);
	}

}
