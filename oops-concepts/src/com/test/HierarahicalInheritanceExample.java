package com.test;
class Vehicle
{
	void start()
	{
		System.out.println("Vehicle starts");
	}
}


class Car1 extends Vehicle
{
	void drive()
	{
		System.out.println("Car drives");
	}
}


class Bike extends Vehicle
{
	void ride()
	{
		System.out.println("Bike rides");
	}
}

class Truck extends Vehicle
{
	void load()
	{
		System.out.println("Truck carries goods");
	}
}
public class HierarahicalInheritanceExample {

	public static void main(String[] args) {

		Car1 car=new Car1();
		Bike bike=new Bike();
		Truck truck=new Truck();
		
		
		
		car.start();
		car.drive();
		
		
		bike.start();
		bike.ride();
		
		
		truck.start();
		truck.load();;
	}

}
