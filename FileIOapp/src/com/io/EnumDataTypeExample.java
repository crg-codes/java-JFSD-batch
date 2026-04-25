package com.io;

public class EnumDataTypeExample {

	
	public static void main(String args[])
	{
		
		
		Day today=Day.FRIDAY;
		
		
		if(today==Day.FRIDAY)
		{
			System.out.println("Weekend is near");
		}
		
		
		Level level=Level.HIGH;
		
		System.out.println(level.getValue());
	}
}
;