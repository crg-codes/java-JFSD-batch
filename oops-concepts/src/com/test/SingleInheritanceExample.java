package com.test;
class Animal
{
	
	String name="Animal";
	
	public Animal()
	{
		System.out.println("Animal Constructor");
	}
	
	public void show()
	{
		System.out.println("This is animal method");
	}
}


class Dog extends Animal
{
	String name="Dog";
	public Dog()
	{
		super();
		System.out.println("Dog constructor");
	}
	
	public void display()
	{
		System.out.println(super.name);
		
	}
	
}
public class SingleInheritanceExample {

	public static void main(String[] args) {
		
		Dog dog=new Dog();
		dog.display();
		dog.show();
		

	}

}
