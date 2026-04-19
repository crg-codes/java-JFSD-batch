package com.test;

import java.util.Arrays;

public class ReferenceToAnInstanceMethodOfAnArbitraryType {

	public static void main(String[] args) {
		
		//compareToIgnoreCase ->String
		String array[]= {"James","Mary","John","Bob","Linda"};
		Arrays.sort(array,String::compareToIgnoreCase );
		
		for(String s:array)
		{
			System.out.println(s);
		}
		

	}

}
