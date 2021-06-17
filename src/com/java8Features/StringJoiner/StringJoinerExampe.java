package com.java8Features.StringJoiner;

import java.util.StringJoiner;

public class StringJoinerExampe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringJoiner sj = new StringJoiner(",");
		sj.add("Sita");
		sj.add("Mita");
		sj.add("Bita");
		sj.add("Tita");
		
		System.out.println(sj);
		
		StringJoiner sj1 = new StringJoiner(":","[","]");
		sj1.add("Veena");
		sj1.add("Reena");
		sj1.add("Peena");
		sj1.add("Beena");
		System.out.println(sj1);
		
		StringJoiner stringMerge = sj.merge(sj1);
		System.out.println("Merged string: " +stringMerge);
		
	}

}
