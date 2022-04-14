package com.tns.coreJava;

public class MultithreadingDemo {

	public static void main(String[] args) {
		
		for(int i=0; i<10; i++) {
			
			System.out.println("Main");
		}
        MyThread obj = new MyThread();
        obj.start();
        
        System.out.println("Thread name = " + Thread.currentThread().getName());
	}

}
class MyThread extends  Thread {
	  
	public void run() {
		System.out.println("Run method");
		for(int i=0; i<10; i++) {
			
			System.out.println("I am MyThread");
			
		}
		
	}
	
}
