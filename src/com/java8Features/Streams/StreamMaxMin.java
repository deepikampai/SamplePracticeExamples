package com.java8Features.Streams;

import java.util.ArrayList;
import java.util.List;

public class StreamMaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Product> productList = new ArrayList<>();
		productList.add(new Product(1, "television", 10000));
		productList.add(new Product(2, "Boombox", 5000));
		productList.add(new Product(3, "car", 40000));
		productList.add(new Product(4, "game", 9000));
		
		Product prodMaxPrice = productList.stream().max((p1,p2) -> p1.price > p2.price? 1: -1).get();
		
		System.out.println("Max price product: " +prodMaxPrice);
		
		Product prodMinPrice = productList.stream().max((p1,p2) -> p1.price < p2.price? 1: -1).get();
		System.out.println("Min price product: " +prodMinPrice);
	}

}
