package com.test;

class Person
{
	String name="John";
	
	void displayPerson()
	{
		System.out.println("Name:"+name);
	}
}

class Employee extends Person
{
	int salary=30000;
	
	void displayEmployee()
	{
		System.out.println("Salary:"+salary);
	}
}


class Manager extends Employee
{
	String department="IT";
	
	void displayManager()
	{
		System.out.println("Department:"+department);
	}
}

public class MultilevelInheritanceExample {

	public static void main(String[] args) {
	
		
		Manager manager=new Manager();
		
		
		manager.displayPerson();
		manager.displayEmployee();
		manager.displayManager();
		

	}

}
