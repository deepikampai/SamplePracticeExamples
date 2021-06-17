package com.java8Features.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilteredAsList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> productList = new ArrayList<>();
		productList.add(new Product(1, "television", 10000));
		productList.add(new Product(2, "Boombox", 5000));
		productList.add(new Product(3, "car", 40000));
		productList.add(new Product(4, "game", 9000));
		
		List<Float> filteredList = productList.stream().filter(p -> p.price > 9000)
														.map(p -> p.price)
														.collect(Collectors.toList());
		System.out.println(filteredList);

	}

}
