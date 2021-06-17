package com.java8Features.Streams;

import java.util.ArrayList;
import java.util.List;

public class StreamCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> productList = new ArrayList<>();
		productList.add(new Product(1, "television", 10000));
		productList.add(new Product(2, "Boombox", 5000));
		productList.add(new Product(3, "car", 40000));
		productList.add(new Product(4, "game", 9000));
		
		long count = productList.stream().filter(p -> p.price > 5000).count();
		System.out.println(count);
	}

}
