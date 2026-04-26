package org.features;

import java.util.ArrayList;

public class VarExample {
	
	//var y=10; not allowed

	public static void main(String[] args) {
		
		var age=25;
		var name="John";
		var salary=50000.23f;
		
		//var s=null; not allowed
		
		System.out.println(age);
		System.out.println(name);
		System.out.println(salary);
		
		
		var names=new ArrayList<String>();
		names.add("Alice");
		names.add("Bob");
		names.add("Charlie");
		
		
		for(var n:names)
		{
			System.out.println(n);
		}

		
		for (var i=1;i<=10;i++)
		{
			System.out.println(i);
		}

		
		
		



	}

}
