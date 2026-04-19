package com.test;
interface Payment   //common contract
{
	 void pay(double amount);
	 default void test()
	 {
		 System.out.println("This is a default method");
		 demo();
	 }
	 
	 static void paymentMode(String paymentMode)
	 {
		 System.out.println(paymentMode);
		 
	 }
	 
	 private void demo()
	 {
		 System.out.println("This is a private method");
	 }
}

class CreditCardPayment implements Payment //different implementation
{

	@Override
	public void pay(double amount) {
		
		System.out.println("Paid "+amount+" using credit card");
	}
	
}

class UpiPayment implements Payment //different implementation
{

	@Override
	public void pay(double amount) {
		
		System.out.println("Paid "+amount+" using UPI");

	}
	
}
public class InterfaceExample {

	public static void main(String[] args) {
		
		Payment payment1=new CreditCardPayment();
		payment1.pay(1000);
		payment1.test();
		
		Payment.paymentMode("Payment mode set");
		
		
		Payment payment2=new UpiPayment();
		payment2.pay(500);
		payment2.test();

	}

}
