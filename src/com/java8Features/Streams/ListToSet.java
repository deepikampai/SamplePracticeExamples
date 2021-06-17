package com.java8Features.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ListToSet {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> productList = new ArrayList<>();
		productList.add(new Product(1, "television", 10000));
		productList.add(new Product(2, "Boombox", 5000));
		productList.add(new Product(3, "car", 40000));
		productList.add(new Product(4, "game", 9000));
		productList.add(new Product(5, "Videogame", 10000));
		
		Set<Integer> prodSetOnId = productList.stream().map(p -> p.id).collect(Collectors.toSet());
		System.out.println(prodSetOnId);
		
		Set<Float> prodSetOnPrice = productList.stream().filter(p -> p.price >5000).map(p -> p.price).collect(Collectors.toSet());
		System.out.println(prodSetOnPrice);
		
		Set<Product> prod = productList.stream().collect(Collectors.toSet());
		System.out.println(prod);
	}

}
