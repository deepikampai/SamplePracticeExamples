package com.java8Features.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCollectors {

	public static void main(String[] args) {
		
		List<Product> productList = new ArrayList<>();
		productList.add(new Product(1, "television", 10000));
		productList.add(new Product(2, "Boombox", 5000));
		productList.add(new Product(3, "car", 40000));
		productList.add(new Product(4, "game", 9000));
		
		double totalPrice = productList.stream().collect(Collectors.summingDouble(p -> p.price));
		
		System.out.println("totalPrice: " +totalPrice);
	}

}
