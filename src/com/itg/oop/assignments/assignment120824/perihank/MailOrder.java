package com.itg.oop.assignments.assignment120824.perihank;

public class MailOrder implements IPayment {


	@Override
	public void pay(double amount) {
		System.out.println(amount + " tutarinda Mail Order odemesi yapildi");
		
	}

}