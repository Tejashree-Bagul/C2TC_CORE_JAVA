package com.tns.framework;

public abstract class NormalAcc extends ShopAcc {	

	//deliveryCharges who is not belong to prime user
	
	private final float deliveyCharges=100;
	
	float charges;

	//getting deliveryCharges values
	
	public float getDeliveyCharges() {
		return deliveyCharges;
	}
	
	//constructor for the NormalAcc Class :
	
	public NormalAcc(int accNO, String accNm, float charges) {
		super(accNO, accNm, charges);
		this.charges=charges;

	}
	
	@Override
	public void bookProduct(float f1) {
		System.out.println();
	}

	@Override
	public String toString() {
		return "Dear Normal user, Your charges are: " +charges+ " with Delivery Charges is : "+ deliveyCharges ;
	}

	
	
}