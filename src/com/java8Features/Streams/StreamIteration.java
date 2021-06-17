package com.java8Features.Streams;

import java.util.ArrayList;
import java.util.List;

public class StreamIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> productList = new ArrayList<>();
		productList.add(new Product(1,"television", 10000));
		productList.add(new Product(2,"Boombox", 5000));
		productList.add(new Product(3,"car", 40000));
		productList.add(new Product(4,"game", 9000));
		
		
		productList.stream().filter(p -> p.name == "car").forEach(p -> System.out.println(p.price));
	}

}
