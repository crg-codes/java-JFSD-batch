package com.generics;


import java.util.List;

 class Main
{
	public static void printList(List<?> list)
	{
		for(Object object:list)
		{
			System.out.println(object);
		}
	}
}

public class UnboundedWildcardExample {

	public static void main(String[] args) {
		List<Integer> numbers=List.of(1, 2, 3, 4);
		List<String> names=List.of("A","B","C","D");
		
		
		Main.printList(numbers);
		Main.printList(names);
		
		
		

	}

}
