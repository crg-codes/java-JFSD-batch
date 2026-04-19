package com.test;

class Car
{
	//instance variables
	public String carNo;
	public String colour;
	public String brandName;
	public String modelNumber;
	
	
	
	public Car()  //default constructor
	{
		System.out.println("This is a default constructor.");
	}
	
	//parameterized constructor
	public Car(String carNo,String colour,String brandName,String modelNumber)
	{
		this();
		this.carNo=carNo;
		this.colour=colour;
		this.brandName=brandName;
		this.modelNumber=modelNumber;
		this.display(this);
	}
	
	//instance methods
	public void engineStarts()
	{
		System.out.println("Car engine started.");
	}
	
	public void engineStops()
	{
		System.out.println("Car engine stopped.");
	}
	
	
	public void accelarate()
	{
		System.out.println("Car speed increased.");
	}
	
	
	public void slowDownSpeed()
	{
		System.out.println("Car speed decreased.");
	}
	
	public void applyBreak()
	{
		this.slowDownSpeed();
		System.out.println("Car stopped.");
	}
	
	public void display(Car car)
	{
		System.out.println(car.brandName+" "+car.modelNumber+" "+car.colour+" "+car.carNo);
	}
	
}

public class Test {

	public static void main(String[] args) {
		
          Car car=new Car();
          car.carNo="WB40A1234";
          car.colour="Red";
          car.modelNumber="AX100";
          car.brandName="XYZ";
          
          System.out.println(car.carNo);
          System.out.println(car.brandName);
          System.out.println(car.modelNumber);
          System.out.println(car.colour);
          
          car.engineStarts();
          
          car.accelarate();
          
          car.applyBreak();
          
          car.engineStops();
          
          
          

          Car car1=new Car();//constructor
          car1.carNo="WB40A5678";
          car1.colour="Blue";
          car1.modelNumber="AZ200";
          car1.brandName="XYZ";
          
          System.out.println(car1.carNo);
          System.out.println(car1.brandName);
          System.out.println(car1.modelNumber);
          System.out.println(car1.colour);
          
          car1.engineStarts();
          
          car1.accelarate();
          
          car1.applyBreak();
          
          car1.engineStops();
          
          
          Car car2=new Car("AS12S7845","Black","ABC","PZ700");
          
          System.out.println(car2.carNo);
          System.out.println(car2.brandName);
          System.out.println(car2.modelNumber);
          System.out.println(car2.colour);
	}

}
