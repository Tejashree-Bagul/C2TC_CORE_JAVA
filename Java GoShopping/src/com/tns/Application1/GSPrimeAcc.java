package com.tns.Application1;

import com.tns.framework1.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc {
	
	//Charges variable with private static final
	private static final float Charges=0;
	
	//getting method of Charges
	public float getCharges() {
		return Charges;
	}

	//constructor of GSPrimeAcc with member variable
	public GSPrimeAcc(int accNO, String accNm, float charges, boolean isPrime) {
		super(accNO, accNm, charges, isPrime);
	
	}
	
	// method of bookProduct
	@Override
	public void bookProduct(float f) {
		super.bookProduct(f);
	}
	
	//toString Method
	@Override
	public String toString() {
		return super.toString();
	}	

}
