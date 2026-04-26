package org.features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPIdemo {

	public static void main(String[] args) {
		
		
		//stream source
		List<String> list=Arrays.asList("Amit","Deepa","Rahul","Suresh");
		
		
		//stream instance creation
		Stream<String> stream=list.stream();
		
		//intermediate operation
		Stream<String> stream1=stream.filter(name->name.startsWith("A"));
		
		//terminal operation
		stream1.forEach(System.out::println);
		
		
		list.stream()
			.filter(name->name.startsWith("A"))
			.map(name->name.toUpperCase())
			.forEach(System.out::println);
		
		List<String> finalList=list.stream()
			.sorted()
			.toList();
		
		System.out.println(finalList);
		
		
		List<Integer> integers=Arrays.asList(1,2,3,4,5,6,7);
		
		int sum=integers.stream()
				.reduce(0,(a,b)->a+b);
		
		System.out.println(sum);
		
		System.out.println(integers.stream().count());
		
		
		integers.stream()
				.limit(3)
				.forEach(System.out::println);
		
		
	}

}
