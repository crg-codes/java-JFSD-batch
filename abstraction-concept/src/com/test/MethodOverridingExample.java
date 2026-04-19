package com.test;

class OrderPayment
{
	void pay()
	{
		System.out.println("This is a generic payment");
	}
}

class CreditCard extends OrderPayment
{
	void pay()
	{
		System.out.println("Pay using Credit card");
	}
}


class DebitCard extends OrderPayment
{
	void pay()
	{
		System.out.println("Pay using Debit card");
	}
}


class UPI extends OrderPayment
{
	void pay()
	{
		System.out.println("Pay using UPI");
	}
}

//Same name method but different behavior -> Overriding 
public class MethodOverridingExample {

	public static void main(String[] args) {
		
		OrderPayment payment1=new CreditCard();
		OrderPayment payment2=new DebitCard();
		OrderPayment payment3=new UPI();
		
		payment1.pay();
		payment2.pay();
		payment3.pay();

	}

}
