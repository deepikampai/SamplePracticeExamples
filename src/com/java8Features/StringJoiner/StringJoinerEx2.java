package com.java8Features.StringJoiner;

import java.util.StringJoiner;

public class StringJoinerEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringJoiner joinNames = new StringJoiner(",");
		System.out.println("joinNames: " +joinNames);
		
		joinNames.setEmptyValue("empty");
		System.out.println("joinNames: " +joinNames);
		
		joinNames.add("Samarth");
		joinNames.add("Vikranth");
		System.out.println("joinNames: " +joinNames);
		
		int length = joinNames.length();
		System.out.println("Length is joinNames: " +length);
		
		String str = joinNames.toString();
		System.out.println("joinNames to string: " +str);
		
		char c = str.charAt(8);
		System.out.println("char at 8:" +c);
		
		joinNames.add("Girish");
		System.out.println("joinNames: " +joinNames);
//		System.out.println("Length is joinNames: " +length);
//		System.out.println("char at 18:" +str.charAt(18));
	}
}
