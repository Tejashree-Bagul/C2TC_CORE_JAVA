package com.tns.coreJava;

public class StudentInfo {
	
	String name;
	int rollno;
	int age;
	String branch;

	public StudentInfo() {
		
		System.out.println("No parameterised Constructor");
		
	}
	public StudentInfo(String name, int rollno, int age, String branch) {
		
		System.out.println("Parameterized Constructor");
		this.name = name;
		this.rollno = rollno;
		this.age = age;
		this.branch = branch;
	}
	void display() {
		
		System.out.println("Name : " + name);
		System.out.println("Roll no : " + rollno);
		System.out.println("Age : " + age);
		System.out.println("Branch : " + branch);
	}
	public static void main(String[] args) {
		
		StudentInfo obj1 = new StudentInfo();
		StudentInfo obj2 = new StudentInfo("Tejashree", 35,24, "Computer Science");
        obj2.display();
	}

}
