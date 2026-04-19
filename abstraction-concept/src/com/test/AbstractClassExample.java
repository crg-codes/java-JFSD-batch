package com.test;
import java.sql.DataTruncation;
import java.io.*;
//import java.util.Scanner;;

abstract class Vehicle
{
	abstract void start();
	
	void fuel()
	{
		System.out.println("Uses fuel");
	}
}

class Car extends Vehicle
{

	@Override
	void start() {
		
		System.out.println("Car starts with key!");		
	}
	
}

class Truck extends Vehicle
{

	@Override
	void start() {
		// TODO Auto-generated method stub
		
	}
	
}
public class AbstractClassExample {

	public static void main(String[] args) {
		//Fully qualified name
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		Vehicle vehicle=new Car();
		vehicle.start();
		vehicle.fuel();
		
	}

}
