package com.java8Features.Collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;



public class DataAsListAndSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> productList = new ArrayList<>();
		productList.add(new Product(1, "television", 10000));
		productList.add(new Product(2, "Boombox", 5000));
		productList.add(new Product(3, "car", 40000));
		productList.add(new Product(4, "game", 9000));
		
		List<Float> prodPriceList = productList.stream().map(p -> p.getPrice()).collect(Collectors.toList());
		System.out.println(prodPriceList);
		
		Set<Float> prodPriceListSet = productList.stream().map(p -> p.getPrice()).sorted().collect(Collectors.toSet());
		System.out.println(prodPriceListSet);
		
	}

}
