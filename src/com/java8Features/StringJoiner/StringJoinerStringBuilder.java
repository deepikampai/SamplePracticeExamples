package com.java8Features.StringJoiner;

import java.util.StringJoiner;

public class StringJoinerStringBuilder {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String fruits[] = {"apple","mango","kiwi"};
		System.out.println(fruits.toString()); 
		
		StringJoiner sj = new StringJoiner(",","[","]");
		for(String s: fruits) {
			sj.add(s);
		}
		
		System.out.println("StringJoiner string:" +sj);
		
		StringBuilder sb = new StringBuilder();
		if(fruits.length > 0) {
			sb.append("[");
			sb.append(fruits[0]);
			for(int i =1; i < fruits.length; i++) {
				sb.append(",").append(fruits[i]);
			}
			sb.append("]");
			System.out.println("StringBuilder string:" +sb.toString());
		}
		
		
		

	}

}
