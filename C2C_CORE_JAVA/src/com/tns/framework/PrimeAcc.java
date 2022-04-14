package com.tns.framework;

public abstract class PrimeAcc extends ShopAcc {
	

	//isPrime instance member variable
	private boolean isPrime=true;
	
	float charges;

	//isPrime method
	public boolean isPrime() {
		return isPrime;
	}
	
    //Delivery Charges for the product
	private static final float deliveryCharges=0;

	public static float getDeliverycharges() {
		return deliveryCharges;
	}
	
	
     //the Constructor for PrimeAcc
	public PrimeAcc(int accNO, String accNm, float charges,boolean isPrime) {
		super(accNO, accNm, charges);
		this.charges = charges;
		this.isPrime=isPrime;
	}
	
	//method for bookProduct:
	@Override
	public void bookProduct( float x) {
		System.out.println();
		
	}
	@Override
	public String toString() {
		return "Dear Prime user, Your Product charges are: " +charges;
	}
}
