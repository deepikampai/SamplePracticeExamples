package com.java8Features;

import java.util.ArrayList;
import java.util.List;

public class ForEachExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> gamesList = new ArrayList<String>();  
        gamesList.add("Football");  
        gamesList.add("Cricket");  
        gamesList.add("Chess");  
        gamesList.add("Hocky");  
        
        gamesList.forEach(games -> System.out.println(games));
        System.out.println("**************");
        
        gamesList.forEach(System.out::println);
        System.out.println("**************");
        
        gamesList.stream().forEachOrdered(g->System.out.println(g));
        System.out.println("**************");
        
        gamesList.stream().sorted().forEachOrdered(System.out::println);

	}

}
