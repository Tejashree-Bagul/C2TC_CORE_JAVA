package com.tns.Application;

import com.tns.framework.NormalAcc;
import com.tns.framework.PrimeAcc;
import com.tns.framework.ShopFactory;

public class Main {

	public static void main(String[] args) {
		
		ShopFactory shop=new GSShopFactory();
		PrimeAcc prime= new GSPrimeAcc(1, "Tejashree", 5000, true);
		NormalAcc normal=new GSNormalAcc(2, "Shweta", 10000, 100);
		
		prime.bookProduct(5000);
		normal.bookProduct(10000);
		
		System.out.println(prime.toString());
		System.out.println(normal.toString());
	}

}