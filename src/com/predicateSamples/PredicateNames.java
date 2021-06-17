package com.predicateSamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PredicateNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s = {"A", "bv","D"};
		List<String> names = new ArrayList<>(Arrays.asList(s));
		
		names.forEach((String result) -> System.out.println(result));
	}

}
