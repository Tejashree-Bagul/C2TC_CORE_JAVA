package com.tns.Application1;

import com.tns.framework1.NormalAcc;

public class GSNormalAcc  extends NormalAcc{

	//construct of GSNormalAcc class
	
	public GSNormalAcc(int accNO, String accNm, float charges, float deliveryCharges) {
		super(accNO, accNm, charges);
	
	}	
	//method of bookProduct
	
	@Override
	public void bookProduct(float f) {
		super.bookProduct(f);
	}

	//toString method
	@Override
	public String toString() {
		return super.toString();
	}	

}
