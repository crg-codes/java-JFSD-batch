package com.io;

public enum Level {
	LOW(1),
	MEDIUM(2),
	HIGH(3);
	
	
	private int value;
	
	Level(int level)
	{
		this.value=level;
	}
	
	
	public int getValue()
	{
		return value;
	}

}
