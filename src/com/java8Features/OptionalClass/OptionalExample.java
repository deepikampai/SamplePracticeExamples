package com.java8Features.OptionalClass;

import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = new String[10];
//		String toLowerCase = str[5].toLowerCase();
//		System.out.println(toLowerCase);
		
		str[5] = "Optional Example";
		Optional<String> checkNull = Optional.ofNullable(str[5]);
		if(checkNull.isPresent()) {
			String toLowerCase = str[5].toLowerCase();
			System.out.println(toLowerCase);
		}else {
			System.out.println("Doesnt have values");
		}
		
		Optional<String> values = Optional.of(str[5]);
		System.out.println("Filtered value:" +values.filter( s -> s.equals("abc")) );
		System.out.println("Filtered value:" +values.filter( s -> s.equalsIgnoreCase("optional Example")) );
		System.out.println("Getting value:" +values.get());
		System.out.println("Hashcode:" +values.hashCode());
		System.out.println("is Present:" +values.isPresent());
		
		System.out.println("orElse: "+values.orElse("Value is not present")); 
		
		Optional<String> empty = Optional.empty();
		
        System.out.println("orElse: "+empty.orElse("Value is not present"));  
        values.ifPresent(System.out::println);   // printing value by using method referenc
		
	}

}
