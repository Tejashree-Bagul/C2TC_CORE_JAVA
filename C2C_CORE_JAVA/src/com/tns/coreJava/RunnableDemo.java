package com.tns.coreJava;

public class RunnableDemo {

	public static void main(String[] args) {
		
		MyThreads mt = new MyThreads();
		Thread t = new Thread(mt);
		t.start();

	}

}
class MyThreads implements Runnable {
	
	public void run() {
		
		 System.out.println("Run");
	}
}