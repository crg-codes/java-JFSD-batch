package org.features;

import java.util.Optional;

public class OptionalClassExample {

	public static void main(String[] args) {
		
		
		Optional<String> gender=Optional.of("MALE");
		String answer1="Yes";
		String answer2=null;
		
		System.out.println(gender);
		System.out.println(gender.get());
		System.out.println(Optional.empty());
		
		
		System.out.println(Optional.ofNullable(answer1));
		System.out.println(Optional.ofNullable(answer2));
		
		
		String name="Ramesh";
		
		if(name!=null)
		{
			System.out.println(name.length());
		}
		
		
		
		Optional<String> opt=Optional.of(name);
		opt.ifPresent(str->System.out.println(str.length()));
		
		
		//orElse - Returns the value if present otherwise return another value
		
		
		String nullName=null;
		String name1=Optional.ofNullable(nullName).orElse("Rahul");
		
		System.out.println(name1);
		
		
		name=Optional.ofNullable(nullName)
				.orElseThrow(IllegalArgumentException::new);
		System.out.println(name);
		
	
		
	}

}
