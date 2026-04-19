package com.test;

class Demo
{
	private String value1;
	private int value2;
	
	//Getters and setters
	
	public void setValue1(String v1)
	{
		this.value1=v1;
	}
	
	public String getValue1()
	{
		return this.value1;
	}

	public int getValue2() {
		return value2;
	}

	public void setValue2(int value2) {
		this.value2 = value2;
	}
	
	
}


public class EncapsulationExample {

	public static void main(String[] args) {
		
     Demo demo=new  Demo();
     demo.setValue1("hi");
     demo.setValue2(10);
     
     
     System.out.println(demo.getValue1());
     System.out.println(demo.getValue2());
	}

}
