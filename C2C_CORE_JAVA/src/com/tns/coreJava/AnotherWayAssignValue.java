package com.tns.coreJava;

public class AnotherWayAssignValue {
	
	String name = "Tejashree";
	int age = 24;
	
	public AnotherWayAssignValue() {
		
		System.out.println("No parameterisedConstructor");
	}
	void display() {
		
		System.out.println("Name = " + name);
		System.out.println("Age = " + age);
	}

	public static void main(String[] args) {
		
		AnotherWayAssignValue obj1 = new AnotherWayAssignValue();
		obj1.display();
		
		AnotherWayAssignValue obj2 = new AnotherWayAssignValue();
		obj2.name = "Shweta";
		obj2.age = 21;
		obj2.display();

	}

}
