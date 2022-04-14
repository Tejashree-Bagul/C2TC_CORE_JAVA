package com.tns.coreJava;

public class MyException {
	
	int detail;
	  MyException(int a){
		  detail = a;
	  }
      public String toString() {
    	  
    	  return "detail";
      }
}
class Output1 {
	static void compute (int a) throws MyException {
		throw new MyException(a);
	}
	public static void main(String[] args) {
		 try {
			 
			 compute(3);
			 
		 }catch(MyException exception ) {
			 System.out.print("Exception");
		 }

	}

}
